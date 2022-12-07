package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di

import androidx.navigation.fragment.navArgs
import dagger.Module
import dagger.Provides
import uae.hamilton.currencyconversion.common.ui.extensions.viewModel
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverter
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverterArgs


@Module
class ExchangeConverterModule(private val fragment: FragmentExchangeConverter) {
    @FeatureScope
    @Provides
    fun provideViewModel() = fragment.viewModel {
        val arg by fragment.navArgs<FragmentExchangeConverterArgs>()
        ExchangeConverterViewModel(
            arg.conversionRequest
        )
    }
}
