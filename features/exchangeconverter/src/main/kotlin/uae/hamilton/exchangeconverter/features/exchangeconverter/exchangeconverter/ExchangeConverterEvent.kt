package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

// this is class to manage actions between fragment and viewModel
sealed class ExchangeConverterEvent {
    data class Convert(val conversionRequest: ConversionRequest ) : ExchangeConverterEvent()
    object Dismiss : ExchangeConverterEvent()
}