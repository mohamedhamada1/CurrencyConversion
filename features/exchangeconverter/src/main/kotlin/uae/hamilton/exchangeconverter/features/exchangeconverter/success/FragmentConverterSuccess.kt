package uae.hamilton.exchangeconverter.features.exchangeconverter.success

import uae.hamilton.currencyconversion.common.ui.base.BaseFragment
import uae.hamilton.currencyconversion.common.ui.extensions.coreComponent
import uae.hamilton.currencyconversion.features.exchangeconverter.R
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentConverterSuccessBinding
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.di.DaggerSuccessConverterComponent
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.di.SuccessConverterModule

class FragmentConverterSuccess :
    BaseFragment<FragmentConverterSuccessBinding, SuccessConverterViewModel>(
        layoutId = R.layout.fragment_converter_success
    ) {

    override fun onInitDataBinding() {
        viewBinding.viewModel = FragmentConverterSuccess@ this.viewModel
    }

    override fun onInitDependencyInjection() {
        DaggerSuccessConverterComponent.builder()
            .successConverterModule(SuccessConverterModule(this))
            .coreComponent(coreComponent)
            .build().inject(this)
    }


}
