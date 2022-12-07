package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import android.os.Bundle
import android.view.View
import uae.hamilton.currencyconversion.common.navigation.navigate
import uae.hamilton.currencyconversion.common.navigation.popBackStack
import uae.hamilton.currencyconversion.common.ui.base.BaseFragment
import uae.hamilton.currencyconversion.common.ui.extensions.coreComponent
import uae.hamilton.currencyconversion.common.ui.extensions.observe
import uae.hamilton.currencyconversion.features.exchangeconverter.R
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentExchangeConverterBinding
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialog
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di.DaggerExchangeConverterComponent
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di.ExchangeConverterModule
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.FragmentExchangeSelectorDirections

class FragmentExchangeConverter :
    BaseFragment<FragmentExchangeConverterBinding, ExchangeConverterViewModel>(
        layoutId = R.layout.fragment_exchange_converter
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(viewModel.state, ::handleViewState)
        observe(viewModel.event, ::handleEvent)

    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = FragmentExchangeConverter@ this.viewModel
        viewBinding.btnCalculate.setOnClickListener {
            showApproveTransactionDialog()
        }
    }

    override fun onInitDependencyInjection() {
        DaggerExchangeConverterComponent.builder()
            .exchangeConverterModule(ExchangeConverterModule(this))
            .coreComponent(coreComponent)
            .build().inject(this)
    }

    private fun showApproveTransactionDialog() {
        ConfirmDialog.show(
            childFragmentManager,
            title = getString(R.string.approval_required),
            desc = getString(R.string.confirm_convert_message).format(
                viewBinding.convertToTV.text.toString(), viewBinding.convertFromTV.text.toString()
            ),
            confirm = getString(R.string.approve),
            dismiss = getString(R.string.cancel),
            onConfirm = {viewModel.convert() },
            onDismiss = {}
        )
    }

    private fun showRestartSessionDialog() {
        ConfirmDialog.show(
            childFragmentManager,
            title = getString(R.string.restart_session),
            desc = getString(R.string.your_session_has_to_restart),
            onConfirm = { popBackStack() },
        )
    }

    private fun handleViewState(state: ExchangeConverterViewState) =
        when (state) {
            is ExchangeConverterViewState.RestartSession -> {
                showRestartSessionDialog()
            }

        }


    private fun handleEvent(event: ExchangeConverterEvent) {
        when (event) {
            ExchangeConverterEvent.Dismiss -> {}
            is ExchangeConverterEvent.Convert -> {
                navigate(
                    FragmentExchangeConverterDirections.toSuccess(
                        event.conversionRequest
                    )
                )
            }
        }
    }

}
