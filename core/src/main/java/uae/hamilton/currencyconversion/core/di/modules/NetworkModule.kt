package uae.hamilton.currencyconversion.core.di.modules

import uae.hamilton.currencyconversion.core.remote.interceptors.NetworkConnectionInterceptor
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.concurrent.TimeUnit
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import uae.hamilton.currencyconversion.core.BuildConfig
import uae.hamilton.currencyconversion.core.di.scopes.AppScope
import uae.hamilton.currencyconversion.core.remote.datasource.ExchangeRateDataSource
import uae.hamilton.currencyconversion.core.remote.service.CurrencyExchangeService
import uae.hamilton.currencyconversion.core.utils.getMoshiObject

@Module
class NetworkModule {

    companion object {
        private const val TIME_OUT = 60L
    }

    @AppScope
    @Provides
    fun provideHttpLoggingInterceptor() =
        HttpLoggingInterceptor().also {
            it.level = HttpLoggingInterceptor.Level.BODY
        }

    @AppScope
    @Provides
    fun provideOKHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        internetConnectionInterceptor: NetworkConnectionInterceptor
    ): OkHttpClient {
        val httpClientBuilder = OkHttpClient.Builder().also {
            it.writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .callTimeout(TIME_OUT, TimeUnit.SECONDS)
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)

            if (BuildConfig.DEBUG) {
                it.addInterceptor(loggingInterceptor)
            }
            // here we can add all interceptor such like token expiration , network connection error, handle any specific error generally
            it.addInterceptor(internetConnectionInterceptor)
        }
        return httpClientBuilder.build()
    }

    @AppScope
    @Provides
    fun provideMoshi(): Moshi = getMoshiObject()

    @AppScope
    @Provides
    fun provideMoshiConverterFactory(moshi: Moshi): Converter.Factory =
        MoshiConverterFactory.create(moshi)

    @AppScope
    @Provides
    fun provideRetrofit(
        client: OkHttpClient,
        factory: Converter.Factory
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(factory)
            .client(client)
            .build()

    // =========================== SERVICES =================================
    @AppScope
    @Provides
    fun provideCurrencyExchangeService(retrofit: Retrofit): CurrencyExchangeService =
        retrofit.create(CurrencyExchangeService::class.java)

    // =========================== DATA_SOURCES =================================
    @AppScope
    @Provides
    fun provideCurrencyExchangeDataSource(
        service: CurrencyExchangeService,
        moshi: Moshi,
    ) = ExchangeRateDataSource(service, moshi)

}
