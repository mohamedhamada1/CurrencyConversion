package uae.hamilton.currencyconversion.common.ui.extensions

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun Double.formatCurrency(): String {
    return formatCurrencyWithCustomFormat(InputFieldMasks.CURRENCY)
}
fun Double.formatCurrencyWithCustomFormat(currencyFormat: String = InputFieldMasks.CURRENCY_ONE_DECIMAL_POINT): String {
    val formatter = DecimalFormat(currencyFormat, DecimalFormatSymbols(Locale.US))
    return formatter.format(this)
}
