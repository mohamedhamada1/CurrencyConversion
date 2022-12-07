package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di

import dagger.Component
import uae.hamilton.currencyconversion.core.di.CoreComponent
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverter


@FeatureScope
@Component(
    modules = [ExchangeConverterModule::class],
    dependencies = [CoreComponent::class]
)
interface ExchangeConverterComponent {
    fun inject(fragment: FragmentExchangeConverter)
}
