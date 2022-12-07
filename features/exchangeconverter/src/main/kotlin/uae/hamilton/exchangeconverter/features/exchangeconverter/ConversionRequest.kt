package uae.hamilton.exchangeconverter.features.exchangeconverter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ConversionRequest(
    val fromCurrency: String,
    val toCurreny: String,
    val rate: Double,
    var amountToConvert: Double? = null
) : Parcelable
