package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData
import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest

class ExchangeConverterViewModel(
    val conversionRequest: ConversionRequest
) : ViewModel() {

    private val _restartConversionTimerSeconds = MutableLiveData(0)
    val restartConversionTimerSeconds: LiveData<Int> = _restartConversionTimerSeconds
    private val _state = SingleLiveData<ExchangeConverterViewState>()
    val state = _state

    private val _event = SingleLiveData<ExchangeConverterEvent>()
    val event: LiveData<ExchangeConverterEvent> = _event

    private fun startTimer() {
        _restartConversionTimerSeconds.postValue(CONVERSION_TIME_OUT)
        viewModelScope.launch(Dispatchers.Default) {
            CONVERSION_TIME_OUT.countSecondsDown()
                .onStart { }
                .onCompletion { _state.postValue(ExchangeConverterViewState.RestartSession) }
                .collect { _restartConversionTimerSeconds.postValue(it) }
        }
    }

    init {
        startTimer()
    }

    fun convert() {
        _event.value = ExchangeConverterEvent.Convert(conversionRequest)
    }


    companion object {
        const val CONVERSION_TIME_OUT: Int = 30
    }
}
