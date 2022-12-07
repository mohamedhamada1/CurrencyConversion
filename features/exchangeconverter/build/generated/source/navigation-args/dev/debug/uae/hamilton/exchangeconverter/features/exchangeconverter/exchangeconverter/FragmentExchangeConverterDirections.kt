package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import uae.hamilton.currencyconversion.features.exchangeconverter.R
import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

public class FragmentExchangeConverterDirections private constructor() {
  private data class ToSuccess(
    public val conversionRequest: ConversionRequest
  ) : NavDirections {
    public override val actionId: Int = R.id.toSuccess

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
          result.putParcelable("conversionRequest", this.conversionRequest as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
          result.putSerializable("conversionRequest", this.conversionRequest as Serializable)
        } else {
          throw UnsupportedOperationException(ConversionRequest::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun toSuccess(conversionRequest: ConversionRequest): NavDirections =
        ToSuccess(conversionRequest)
  }
}
