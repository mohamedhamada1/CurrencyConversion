package uae.hamilton.currencyconversion.core.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import uae.hamilton.currencyconversion.core.BuildConfig
import uae.hamilton.currencyconversion.core.di.scopes.AppScope
import uae.hamilton.currencyconversion.core.local.database.CurrencyConversionDatabase

@Module
class DatabaseModule {

    @Provides
    @AppScope
    fun provideAppDatabase(@AppScope context: Context): CurrencyConversionDatabase {
        return Room.databaseBuilder(
            context,
            CurrencyConversionDatabase::class.java,
            BuildConfig.DATABASE_NAME
        ).build()
    }

    @Provides
    @AppScope
    fun provideExchangeRateDao(database: CurrencyConversionDatabase) = database.exchangeRateDao()

    @Provides
    @AppScope
    fun provideCurrencyDao(database: CurrencyConversionDatabase) = database.currencyDao()

}
