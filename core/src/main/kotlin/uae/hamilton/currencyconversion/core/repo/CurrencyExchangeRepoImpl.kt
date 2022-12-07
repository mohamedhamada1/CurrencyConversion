package uae.hamilton.currencyconversion.core.repo

import androidx.lifecycle.LiveData
import uae.hamilton.currencyconversion.core.local.dao.CurrencyDao
import uae.hamilton.currencyconversion.core.local.dao.ExchangeRateDao
import uae.hamilton.currencyconversion.core.local.entity.Currency
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate
import uae.hamilton.currencyconversion.core.mappers.toLocal
import uae.hamilton.currencyconversion.core.remote.datasource.ExchangeRateDataSource
import uae.hamilton.currencyconversion.core.utils.resultLiveData
import javax.inject.Inject
import uae.hamilton.currencyconversion.core.remote.Result
import uae.hamilton.currencyconversion.core.remote.response.CurrencyExchangeResponse
import uae.hamilton.currencyconversion.core.utils.Constant.FETCH_FROM_API_EACH_HOUR
import uae.hamilton.currencyconversion.core.utils.networkOnlyLiveData
import uae.hamilton.currencyconversion.core.utils.toMilisecond

class CurrencyExchangeRepoImpl @Inject constructor(
    private val dataSource: ExchangeRateDataSource,
    private val exchangeRateDao: ExchangeRateDao,
    private val currencyDao: CurrencyDao
) : CurrencyExchangeRepo {

    override fun getCurrencyExchangeRate(currency: String): LiveData<Result<ExchangeRate>> =
        networkOnlyLiveData(
            networkCall = {
                val fromLocal = exchangeRateDao.getAllExchangeRateByCurrency(currency)
                if (fromLocal == null || (System.currentTimeMillis() - fromLocal.lastCallTime > FETCH_FROM_API_EACH_HOUR.toMilisecond()))
                    dataSource.getLatestExchangeRate(currency)
                else
                    Result.success(
                        CurrencyExchangeResponse(
                            fromLocal.baseCode,
                            fromLocal.conversionRates,
                            lastUpdateCall = fromLocal.lastCallTime
                        )
                    )
            },
            mapFun = { backendResponse ->
                backendResponse.toLocal().let {
                    if (it.lastCallTime != backendResponse.lastUpdateCall) {
                        currencyDao.insertAll(it.conversionRates.keys.toList().map { Currency(it) })
                        exchangeRateDao.insert(it)
                    }
                    it
                }

            }

        )

    override suspend fun getCurrencyList() = currencyDao.getAll()
}
