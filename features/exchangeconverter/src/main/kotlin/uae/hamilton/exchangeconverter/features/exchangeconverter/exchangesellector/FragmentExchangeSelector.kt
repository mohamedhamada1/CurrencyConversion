package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import uae.hamilton.currencyconversion.common.navigation.navigate
import uae.hamilton.currencyconversion.common.ui.base.BaseFragment
import uae.hamilton.currencyconversion.common.ui.extensions.coreComponent
import uae.hamilton.currencyconversion.common.ui.extensions.observe
import uae.hamilton.currencyconversion.core.local.entity.Currency
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate
import uae.hamilton.currencyconversion.features.exchangeconverter.R
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentExchangeSelectorBinding
import uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di.DaggerExchangeSelectorComponent
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di.ExchangeSelectorModule


/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class CatalogEvent ,CatalogState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
class FragmentExchangeSelector :
    BaseFragment<FragmentExchangeSelectorBinding, ExchangeSelectorViewModel>(
        layoutId = R.layout.fragment_exchange_selector
    ) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(viewModel.state, ::handleViewState)
        observe(viewModel.data, ::handleData)
        observe(viewModel.currency, ::handleCurrencyList)
        observe(viewModel.event, ::handleEvent)
    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = FragmentExchangeSelector@ this.viewModel
    }

    override fun onInitDependencyInjection() {
        DaggerExchangeSelectorComponent.builder()
            .exchangeSelectorModule(ExchangeSelectorModule(this))
            .coreComponent(coreComponent)
            .build().inject(this)
    }


    private fun handleData(data: ExchangeRate?) = viewBinding.run {
        data?.let {
            with(viewBinding.toCurrencySpinner) {
                val listOfCurrency = data.conversionRates.keys.toList()
                this.adapter = ArrayAdapter(
                    requireContext(),
                    android.R.layout.simple_spinner_item, listOfCurrency
                )
                setSelection(viewModel?.toCurrencyPosition ?: 0, false)
                onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View,
                        position: Int,
                        id: Long
                    ) {
                        viewModel?.convert(
                            ConversionRequest(
                                data.baseCode,
                                listOfCurrency[position],
                                data.conversionRates[listOfCurrency[position]] ?: 0.0
                            ), position
                        )
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                }
            }
        }

    }

    private fun handleCurrencyList(data: List<Currency>?) = viewBinding.run {
        data?.let {
            with(viewBinding.fromCurrencySpinner) {
                this.adapter = ArrayAdapter(
                    requireContext(),
                    android.R.layout.simple_spinner_item, data.map { it.baseCode }
                )
                setSelection(viewModel?.fromCurrencyPosition ?: 0, false)
                onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View,
                        position: Int,
                        id: Long
                    ) {
                        viewModel?.loadCurrency(data[position].baseCode, position)
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                }
            }
        }

    }

    private fun handleViewState(state: ExchangeSelectorViewState) =
        when (state) {
            ExchangeSelectorViewState.Loading -> {

            }
            ExchangeSelectorViewState.Loaded -> {

            }
            is ExchangeSelectorViewState.Failure -> {
                Toast.makeText(
                    requireContext(),
                    state.error.errorCause.toString(),
                    Toast.LENGTH_SHORT
                )
                    .show()// for sure this would be something better like micro interaction.. so If i have more time i would create view module to create all custom views

            }

        }

    private fun handleEvent(event: ExchangeSelectorEvent) {
        when (event) {
            ExchangeSelectorEvent.Dismiss -> {}
            is ExchangeSelectorEvent.OpenSelectorScreen -> {
                navigate(
                    FragmentExchangeSelectorDirections.toConverter(
                        event.conversionRequest
                    )
                )
            }
            else -> Unit
        }
    }
}
