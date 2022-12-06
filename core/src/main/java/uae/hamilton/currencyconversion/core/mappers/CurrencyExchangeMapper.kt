package uae.hamilton.currencyconversion.core.mappers

import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate
import uae.hamilton.currencyconversion.core.remote.response.CurrencyExchangeResponse

fun CurrencyExchangeResponse.toLocal() = ExchangeRate(
    baseCode = baseCode,
    conversionRates = conversionRateResponse,
    lastCallTime = System.currentTimeMillis()
)