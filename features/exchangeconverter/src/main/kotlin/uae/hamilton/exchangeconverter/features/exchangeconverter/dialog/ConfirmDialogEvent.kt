package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog

sealed class ConfirmDialogEvent {
    object Dismiss : ConfirmDialogEvent()
    object Confirm : ConfirmDialogEvent()
}
