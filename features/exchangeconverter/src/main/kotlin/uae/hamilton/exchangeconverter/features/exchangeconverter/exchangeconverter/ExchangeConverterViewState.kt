package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import uae.hamilton.currencyconversion.common.ui.base.BaseViewState
import uae.hamilton.currencyconversion.core.remote.Result

sealed class ExchangeConverterViewState : BaseViewState {
    object RestartSession : ExchangeConverterViewState()
}
