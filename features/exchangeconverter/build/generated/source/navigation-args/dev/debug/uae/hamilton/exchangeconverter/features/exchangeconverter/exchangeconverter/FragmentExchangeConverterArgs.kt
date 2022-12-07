package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

public data class FragmentExchangeConverterArgs(
  public val conversionRequest: ConversionRequest
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
      result.set("conversionRequest", this.conversionRequest as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
      result.set("conversionRequest", this.conversionRequest as Serializable)
    } else {
      throw UnsupportedOperationException(ConversionRequest::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentExchangeConverterArgs {
      bundle.setClassLoader(FragmentExchangeConverterArgs::class.java.classLoader)
      val __conversionRequest : ConversionRequest?
      if (bundle.containsKey("conversionRequest")) {
        if (Parcelable::class.java.isAssignableFrom(ConversionRequest::class.java) ||
            Serializable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
          __conversionRequest = bundle.get("conversionRequest") as ConversionRequest?
        } else {
          throw UnsupportedOperationException(ConversionRequest::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__conversionRequest == null) {
          throw IllegalArgumentException("Argument \"conversionRequest\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"conversionRequest\" is missing and does not have an android:defaultValue")
      }
      return FragmentExchangeConverterArgs(__conversionRequest)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        FragmentExchangeConverterArgs {
      val __conversionRequest : ConversionRequest?
      if (savedStateHandle.contains("conversionRequest")) {
        if (Parcelable::class.java.isAssignableFrom(ConversionRequest::class.java) ||
            Serializable::class.java.isAssignableFrom(ConversionRequest::class.java)) {
          __conversionRequest = savedStateHandle.get<ConversionRequest?>("conversionRequest")
        } else {
          throw UnsupportedOperationException(ConversionRequest::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__conversionRequest == null) {
          throw IllegalArgumentException("Argument \"conversionRequest\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"conversionRequest\" is missing and does not have an android:defaultValue")
      }
      return FragmentExchangeConverterArgs(__conversionRequest)
    }
  }
}
