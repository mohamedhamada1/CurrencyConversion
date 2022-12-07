package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import uae.hamilton.currencyconversion.common.ui.extensions.toSingleMediatorLiveData
import uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData
import uae.hamilton.currencyconversion.core.local.entity.Currency
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo
import uae.hamilton.currencyconversion.core.remote.Result
import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

class ExchangeSelectorViewModel(
    private val exchangeRateRepo: CurrencyExchangeRepo
) : ViewModel() {

    private val _data = MutableLiveData<ExchangeRate>()
    val data: LiveData<ExchangeRate> = _data

    private val _currency = MutableLiveData<List<Currency>>()
    val currency: LiveData<List<Currency>> = _currency

    private val _state = SingleLiveData<ExchangeSelectorViewState>()
    val state: LiveData<ExchangeSelectorViewState> = _state

    var conversionRequest: ConversionRequest? = null

    // this variable only to keep selected currency when user go back
    var fromCurrencyPosition = 0
    var toCurrencyPosition = 0

    private val _event = SingleLiveData<ExchangeSelectorEvent>()
    val event: LiveData<ExchangeSelectorEvent> =
        _event.toSingleMediatorLiveData { event, mediatorLiveData ->
            when (event) {
                is ExchangeSelectorEvent.LoadCurrency -> {
                    val request = exchangeRateRepo.getCurrencyExchangeRate(event.currency)
                    mediatorLiveData.addSource(request) { result ->
                        when (result) {
                            is Result.Success -> {
                                _data.value = result.data
                                _state.value = ExchangeSelectorViewState.Loaded
                                loadCurrencyList()
                            }
                            is Result.Error -> _state.value =
                                ExchangeSelectorViewState.Failure(result)
                            is Result.Loading -> _state.value = ExchangeSelectorViewState.Loading
                        }
                    }
                    true
                }

                else -> false
            }
        }

    private fun loadCurrencyList() {
        if (_currency.value?.isEmpty()?.not() == true) return
        viewModelScope.launch {
            _currency.value = exchangeRateRepo.getCurrencyList()
        }
    }

    fun loadCurrency(currency: String, position: Int) {
        fromCurrencyPosition = position
        this.conversionRequest = null
        _event.value = ExchangeSelectorEvent.LoadCurrency(currency)
    }

    fun convert(conversionRequest: ConversionRequest, position: Int) {
        toCurrencyPosition = position
        this.conversionRequest = conversionRequest
    }

    fun calculate(amount: String) {
        if (conversionRequest == null || amount.isNullOrEmpty()) return
        conversionRequest?.amountToConvert = amount.toDouble()
        conversionRequest?.let { _event.value = ExchangeSelectorEvent.OpenSelectorScreen(it) }
    }

    init {
        _event.value = ExchangeSelectorEvent.LoadCurrency(CURRENCY_USD)
    }

    fun dismissScreen() {
        _event.value = ExchangeSelectorEvent.Dismiss
    }

    companion object {
        const val CURRENCY_USD = "USD"
    }
}
