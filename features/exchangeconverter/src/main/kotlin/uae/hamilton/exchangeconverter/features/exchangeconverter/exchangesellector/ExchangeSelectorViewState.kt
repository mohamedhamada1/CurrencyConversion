package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector

import uae.hamilton.currencyconversion.common.ui.base.BaseViewState
import uae.hamilton.currencyconversion.core.remote.Result

sealed class ExchangeSelectorViewState : BaseViewState {
    object Loaded : ExchangeSelectorViewState()
    object Loading : ExchangeSelectorViewState()
    data class Failure(val error: Result.Error) : ExchangeSelectorViewState()
}
