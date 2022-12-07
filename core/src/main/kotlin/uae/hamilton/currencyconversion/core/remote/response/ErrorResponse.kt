package uae.hamilton.currencyconversion.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
/*
i will assume we agreed the error response standard will be such like this
 */
@JsonClass(generateAdapter = true)
data class BaseErrorResponse(
    @field:Json(name = "result") val error: ErrorResponse?
)

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @field:Json(name = "statusCode") val code: String?,
    @field:Json(name = "description") val description: String?,
    @field:Json(name = "message") val message: String?
)
