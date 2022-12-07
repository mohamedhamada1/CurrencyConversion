package uae.hamilton.currencyconversion.core.remote.datasource
import uae.hamilton.currencyconversion.core.remote.Result
import com.squareup.moshi.Moshi
import retrofit2.Response
import uae.hamilton.currencyconversion.core.remote.getResult

abstract class BaseDataSource(
    private val moshi: Moshi,
) {
    suspend fun <T : Any> getResult(call: suspend () -> Response<T>): Result<T> =
        getResult(moshi, call)
}
