package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/di/ExchangeSelectorComponent;", "", "inject", "", "fragment", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/FragmentExchangeSelector;", "exchangeconverter_devDebug"})
@dagger.Component(modules = {uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di.ExchangeSelectorModule.class}, dependencies = {uae.hamilton.currencyconversion.core.di.CoreComponent.class})
@uae.hamilton.currencyconversion.core.di.scopes.FeatureScope()
public abstract interface ExchangeSelectorComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.FragmentExchangeSelector fragment);
}