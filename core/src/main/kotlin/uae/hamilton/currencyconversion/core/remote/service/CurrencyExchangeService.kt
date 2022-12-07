package uae.hamilton.currencyconversion.core.remote.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import uae.hamilton.currencyconversion.core.BuildConfig
import uae.hamilton.currencyconversion.core.remote.response.CurrencyExchangeResponse
import uae.hamilton.currencyconversion.core.remote.response.RemoteResponse

interface CurrencyExchangeService {
    companion object {
        private const val BASE_URL = "v6/${BuildConfig.API_KEY}/latest/"
    }

    @GET("${BASE_URL}{currency}")
    suspend fun getLatestExchangeRate(
        @Path("currency") currency: String
    ): Response<CurrencyExchangeResponse>
}
