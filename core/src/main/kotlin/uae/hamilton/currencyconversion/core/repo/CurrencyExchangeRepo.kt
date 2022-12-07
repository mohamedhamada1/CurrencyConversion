package uae.hamilton.currencyconversion.core.repo

import androidx.lifecycle.LiveData
import uae.hamilton.currencyconversion.core.local.entity.Currency
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate
import uae.hamilton.currencyconversion.core.remote.Result

interface CurrencyExchangeRepo {
    fun getCurrencyExchangeRate(currency: String): LiveData<Result<ExchangeRate>>

    // after first call i will have all currency list codes
    suspend fun getCurrencyList(): List<Currency>
}