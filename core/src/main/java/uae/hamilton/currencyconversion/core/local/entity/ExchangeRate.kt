package uae.hamilton.currencyconversion.core.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "exchange_rate")
data class ExchangeRate(
    @PrimaryKey val baseCode: String,
    @ColumnInfo(name = "last_call_time") val lastCallTime: Long, // depend on this will call API and refresh again each specific time
    @ColumnInfo(name = "conversion_rates") val conversionRates: Map<String, Double>,
) : Parcelable
