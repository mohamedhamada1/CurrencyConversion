package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/di/ExchangeConverterModule;", "", "fragment", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/FragmentExchangeConverter;", "(Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/FragmentExchangeConverter;)V", "provideViewModel", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/ExchangeConverterViewModel;", "exchangeconverter_devDebug"})
@dagger.Module()
public final class ExchangeConverterModule {
    private final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverter fragment = null;
    
    public ExchangeConverterModule(@org.jetbrains.annotations.NotNull()
    uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverter fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uae.hamilton.currencyconversion.core.di.scopes.FeatureScope()
    public final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel provideViewModel() {
        return null;
    }
}