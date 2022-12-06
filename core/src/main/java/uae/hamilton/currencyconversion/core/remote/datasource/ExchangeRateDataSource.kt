package uae.hamilton.currencyconversion.core.remote.datasource

import com.squareup.moshi.Moshi
import uae.hamilton.currencyconversion.core.remote.service.CurrencyExchangeService

class ExchangeRateDataSource(
    private val service: CurrencyExchangeService,
    moshi: Moshi,
) : BaseDataSource(moshi) {

    suspend fun getLatestExchangeRate(currency: String) = getResult {
        service.getLatestExchangeRate(currency)
    }

}
