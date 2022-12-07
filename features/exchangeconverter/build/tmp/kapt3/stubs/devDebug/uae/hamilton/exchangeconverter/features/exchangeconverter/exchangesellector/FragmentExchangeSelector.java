package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector;

import java.lang.System;

/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class CatalogEvent ,CatalogState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016\u00a8\u0006\u001b"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/FragmentExchangeSelector;", "Luae/hamilton/currencyconversion/common/ui/base/BaseFragment;", "Luae/hamilton/currencyconversion/features/exchangeconverter/databinding/FragmentExchangeSelectorBinding;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewModel;", "()V", "handleCurrencyList", "", "data", "", "Luae/hamilton/currencyconversion/core/local/entity/Currency;", "(Ljava/util/List;)Lkotlin/Unit;", "handleData", "Luae/hamilton/currencyconversion/core/local/entity/ExchangeRate;", "(Luae/hamilton/currencyconversion/core/local/entity/ExchangeRate;)Lkotlin/Unit;", "handleEvent", "event", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "handleViewState", "state", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "onInitDataBinding", "onInitDependencyInjection", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "exchangeconverter_devDebug"})
public final class FragmentExchangeSelector extends uae.hamilton.currencyconversion.common.ui.base.BaseFragment<uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentExchangeSelectorBinding, uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel> {
    
    public FragmentExchangeSelector() {
        super(0);
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInitDataBinding() {
    }
    
    @java.lang.Override()
    public void onInitDependencyInjection() {
    }
    
    private final kotlin.Unit handleData(uae.hamilton.currencyconversion.core.local.entity.ExchangeRate data) {
        return null;
    }
    
    private final kotlin.Unit handleCurrencyList(java.util.List<uae.hamilton.currencyconversion.core.local.entity.Currency> data) {
        return null;
    }
    
    private final void handleViewState(uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState state) {
    }
    
    private final void handleEvent(uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent event) {
    }
}