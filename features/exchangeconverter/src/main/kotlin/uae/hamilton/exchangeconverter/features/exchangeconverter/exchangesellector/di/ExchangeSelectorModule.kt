package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di

import dagger.Module
import dagger.Provides
import uae.hamilton.currencyconversion.common.ui.extensions.viewModel
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.FragmentExchangeSelector

@Module
class ExchangeSelectorModule(private val fragment: FragmentExchangeSelector) {
    @FeatureScope
    @Provides
    fun provideViewModel(currencyExchangeRepo: CurrencyExchangeRepo) = fragment.viewModel {
        ExchangeSelectorViewModel(
            currencyExchangeRepo
        )
    }
}
