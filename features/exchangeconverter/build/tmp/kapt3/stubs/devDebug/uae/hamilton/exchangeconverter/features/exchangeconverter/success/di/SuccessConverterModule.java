package uae.hamilton.exchangeconverter.features.exchangeconverter.success.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/success/di/SuccessConverterModule;", "", "fragment", "Luae/hamilton/exchangeconverter/features/exchangeconverter/success/FragmentConverterSuccess;", "(Luae/hamilton/exchangeconverter/features/exchangeconverter/success/FragmentConverterSuccess;)V", "provideViewModel", "Luae/hamilton/exchangeconverter/features/exchangeconverter/success/SuccessConverterViewModel;", "exchangeconverter_devDebug"})
@dagger.Module()
public final class SuccessConverterModule {
    private final uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccess fragment = null;
    
    public SuccessConverterModule(@org.jetbrains.annotations.NotNull()
    uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccess fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uae.hamilton.currencyconversion.core.di.scopes.FeatureScope()
    public final uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel provideViewModel() {
        return null;
    }
}