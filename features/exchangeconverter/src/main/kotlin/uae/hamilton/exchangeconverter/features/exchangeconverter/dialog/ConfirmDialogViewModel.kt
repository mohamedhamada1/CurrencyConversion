package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData

class ConfirmDialogViewModel : ViewModel() {

    private val _event = SingleLiveData<ConfirmDialogEvent>()
    val event: LiveData<ConfirmDialogEvent> = _event

    fun dismissDialog() {
        _event.value = ConfirmDialogEvent.Dismiss
    }

    fun clickConfirm() {
        _event.value = ConfirmDialogEvent.Confirm
    }

    fun clickDismiss() {
        _event.value = ConfirmDialogEvent.Dismiss
    }
}
