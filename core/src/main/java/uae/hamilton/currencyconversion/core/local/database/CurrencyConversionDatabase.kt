package uae.hamilton.currencyconversion.core.local.database
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import uae.hamilton.currencyconversion.core.BuildConfig
import uae.hamilton.currencyconversion.core.local.convertor.DBTypeConvertor
import uae.hamilton.currencyconversion.core.local.dao.CurrencyDao
import uae.hamilton.currencyconversion.core.local.dao.ExchangeRateDao
import uae.hamilton.currencyconversion.core.local.entity.Currency
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate

@Database(
    entities = [Currency::class, ExchangeRate::class],
    exportSchema = BuildConfig.DATABASE_EXPORT_SCHEMA,
    version = BuildConfig.DATABASE_VERSION
)
@TypeConverters(DBTypeConvertor::class)
abstract class CurrencyConversionDatabase : RoomDatabase() {

    abstract fun exchangeRateDao(): ExchangeRateDao

    abstract fun currencyDao(): CurrencyDao

}
