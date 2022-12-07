package uae.hamilton.exchangeconverter.features.exchangeconverter.success.di

import androidx.navigation.fragment.navArgs
import dagger.Module
import dagger.Provides
import uae.hamilton.currencyconversion.common.ui.extensions.viewModel
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccess
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccessArgs
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel

@Module
class SuccessConverterModule(private val fragment: FragmentConverterSuccess) {
    @FeatureScope
    @Provides
    fun provideViewModel() = fragment.viewModel {
        val arg by fragment.navArgs<FragmentConverterSuccessArgs>()
        SuccessConverterViewModel(
            arg.conversionRequest
        )
    }
}
