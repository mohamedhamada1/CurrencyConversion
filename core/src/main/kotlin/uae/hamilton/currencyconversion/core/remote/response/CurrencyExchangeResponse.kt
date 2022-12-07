package uae.hamilton.currencyconversion.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyExchangeResponse(
    @field:Json(name = "base_code") val baseCode: String,
    @field:Json(name = "conversion_rates") val conversionRateResponse: Map<String, Double>?,
    var lastUpdateCall: Long? = null,
)


