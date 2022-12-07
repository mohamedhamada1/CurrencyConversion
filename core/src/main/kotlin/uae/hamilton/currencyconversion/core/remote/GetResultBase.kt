package uae.hamilton.currencyconversion.core.remote

import uae.hamilton.currencyconversion.core.remote.interceptors.NoConnectivityException
import uae.hamilton.currencyconversion.core.remote.interceptors.NoConnectivityException.Companion.NO_INTERNET_CONNECTION_ERROR_CODE
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import retrofit2.Response
import uae.hamilton.currencyconversion.core.remote.response.BaseErrorResponse
import uae.hamilton.currencyconversion.core.remote.response.ErrorResponse


suspend fun <T : Any> getResult(
    moshi: Moshi,
    call: suspend () -> Response<T>
): Result<T> {
    return try {
        val response = call()
        val body = response.body()
        if (body != null) Result.success(body) else HttpException(response).getErrorResult(moshi)
    } catch (noInternet: NoConnectivityException) {
        Result.error(noInternet, errorCode = NO_INTERNET_CONNECTION_ERROR_CODE)
    } catch (t: HttpException) {
        t.getErrorResult(moshi)
    } catch (expected: Throwable) {
        Result.error(expected)
    }
}

private fun HttpException.getErrorResult(moshi: Moshi): Result.Error =
    try {
        this.response()?.errorBody()?.string()?.let {
            moshi.adapter(BaseErrorResponse::class.java).lenient().fromJson(it)?.error
                ?: moshi.adapter(ErrorResponse::class.java).lenient().fromJson(it)
        }?.let {
            Result.error(
                errorCode = it.code?.toLongOrNull() ?: Result.Error.CODE_UNKNOWN,
                errorMessage = it.description ?: it.message
            )
        } ?: Result.error(this)
    } catch (expected: Throwable) {
        Result.error(expected)
    }
