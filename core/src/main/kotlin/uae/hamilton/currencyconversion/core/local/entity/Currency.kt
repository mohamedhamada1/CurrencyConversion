package uae.hamilton.currencyconversion.core.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


// will use this table to store all currencies after first call, so i will support all possible currencies
@Parcelize
@Entity(tableName = "currency")
data class Currency(
    @PrimaryKey val baseCode: String,
) : Parcelable
