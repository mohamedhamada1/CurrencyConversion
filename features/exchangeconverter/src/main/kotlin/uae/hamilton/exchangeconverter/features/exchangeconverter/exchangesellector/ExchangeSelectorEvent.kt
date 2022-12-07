package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector

import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

// this is class to manage actions between fragment and viewModel
sealed class ExchangeSelectorEvent {
    data class LoadCurrency(val currency: String) : ExchangeSelectorEvent()
    data class OpenSelectorScreen(val conversionRequest: ConversionRequest):ExchangeSelectorEvent()
    object Dismiss : ExchangeSelectorEvent()
}