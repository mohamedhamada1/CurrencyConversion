package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di

import dagger.Component
import uae.hamilton.currencyconversion.core.di.CoreComponent
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.FragmentExchangeSelector

@FeatureScope
@Component(
    modules = [ExchangeSelectorModule::class],
    dependencies = [CoreComponent::class]
)
interface ExchangeSelectorComponent {
    fun inject(fragment: FragmentExchangeSelector)
}
