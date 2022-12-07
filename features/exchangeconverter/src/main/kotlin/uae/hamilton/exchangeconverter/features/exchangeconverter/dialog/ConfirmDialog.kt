package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog

import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import uae.hamilton.currencyconversion.common.ui.base.BaseDialog
import uae.hamilton.currencyconversion.common.ui.bindings.visible
import uae.hamilton.currencyconversion.common.ui.extensions.observe
import uae.hamilton.currencyconversion.common.ui.extensions.showSafely
import uae.hamilton.currencyconversion.features.exchangeconverter.R
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.DialogConfirmBinding
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di.ConfirmDialogModule
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di.DaggerConfirmDialogComponent

class ConfirmDialog :
    BaseDialog<DialogConfirmBinding, ConfirmDialogViewModel>(layoutId = R.layout.dialog_confirm) {

    private var onDismiss: () -> Unit = {}
    private var onConfirm: () -> Unit = {}

    override fun onInitDependencyInjection() {
        DaggerConfirmDialogComponent
            .builder()
            .confirmDialogModule(ConfirmDialogModule(this))
            .build().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(viewModel.event, this::handleEvent)
        isCancelable = false
        viewBinding.title = arguments?.getString(PARAM_TITLE) ?: ""
        viewBinding.desc = arguments?.getString(PARAM_DESC) ?: ""
        viewBinding.confirm = arguments?.getString(PARAM_CONFIRM) ?: getString(R.string.okay)
        arguments?.getString(PARAM_DISMISS)?.let {
            viewBinding.dismiss = it
        } ?: run {
            viewBinding.dismissBtn.visible = false
        }
    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = viewModel
    }

    private fun handleEvent(event: ConfirmDialogEvent) {
        when (event) {
            ConfirmDialogEvent.Dismiss -> {
                onDismiss()
                dismiss()
            }
            ConfirmDialogEvent.Confirm -> {
                onConfirm()
                dismiss()
            }
        }
    }

    companion object {
        private const val PARAM_TITLE = "title"
        private const val PARAM_DESC = "desc"
        private const val PARAM_CONFIRM = "confirm"
        private const val PARAM_DISMISS = "dismiss"

        fun show(
            fragmentManager: FragmentManager,
            title: String,
            desc: String,
            confirm: String? = null,
            dismiss: String? = null,
            onDismiss: () -> Unit = {},
            onConfirm: () -> Unit = {}
        ) {
            ConfirmDialog().let { dialog ->
                dialog.arguments = Bundle().apply {
                    putString(PARAM_TITLE, title)
                    putString(PARAM_DESC, desc)
                    putString(PARAM_CONFIRM, confirm)
                    putString(PARAM_DISMISS, dismiss)
                }
                dialog.onDismiss = onDismiss
                dialog.onConfirm = onConfirm
                dialog.showSafely(fragmentManager)
            }
        }
    }
}
