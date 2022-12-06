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

class CurrencyExchangeRepoImpl @Inject constructor(
    private val dataSource: ExchangeRateDataSource,
    private val exchangeRateDao: ExchangeRateDao,
    private val currencyDao: CurrencyDao
) : CurrencyExchangeRepo {

    override fun getCurrencyExchangeRate(currency: String): LiveData<Result<List<ExchangeRate>>> =
        resultLiveData(
            localCall = {
                exchangeRateDao.getAllExchangeRateByCurrency(currency)
            },
            networkCall = {
                dataSource.getLatestExchangeRate(currency)
            },
            saveCallResult = {
                it.result?.toLocal()?.let {
                    currencyDao.insertAll(it.conversionRates.keys.toList().map { Currency(it) })
                    exchangeRateDao.insert(it)
                }

            }

        )

    override suspend fun getCurrencyList() = currencyDao.getAll()
}

