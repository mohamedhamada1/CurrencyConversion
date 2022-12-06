package uae.hamilton.currencyconversion.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RemoteResponse<T>(
    @field:Json(name = "result") val result: T?
)
