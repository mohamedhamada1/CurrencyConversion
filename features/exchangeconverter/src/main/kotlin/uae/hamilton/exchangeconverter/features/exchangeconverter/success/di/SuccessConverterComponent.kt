package uae.hamilton.exchangeconverter.features.exchangeconverter.success.di

import dagger.Component
import uae.hamilton.currencyconversion.core.di.CoreComponent
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccess

@FeatureScope
@Component(
    modules = [SuccessConverterModule::class],
    dependencies = [CoreComponent::class]
)
interface SuccessConverterComponent {
    fun inject(fragment: FragmentConverterSuccess)
}
