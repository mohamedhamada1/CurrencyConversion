package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u001fJ\u0006\u0010/\u001a\u00020*J\u0016\u00100\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001fJ\b\u00101\u001a\u00020*H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010!\"\u0004\b(\u0010#\u00a8\u00063"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "exchangeRateRepo", "Luae/hamilton/currencyconversion/core/repo/CurrencyExchangeRepo;", "(Luae/hamilton/currencyconversion/core/repo/CurrencyExchangeRepo;)V", "_currency", "Landroidx/lifecycle/MutableLiveData;", "", "Luae/hamilton/currencyconversion/core/local/entity/Currency;", "_data", "Luae/hamilton/currencyconversion/core/local/entity/ExchangeRate;", "_event", "Luae/hamilton/currencyconversion/common/ui/livedata/SingleLiveData;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "_state", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "conversionRequest", "Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "getConversionRequest", "()Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "setConversionRequest", "(Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;)V", "currency", "Landroidx/lifecycle/LiveData;", "getCurrency", "()Landroidx/lifecycle/LiveData;", "data", "getData", "event", "getEvent", "fromCurrencyPosition", "", "getFromCurrencyPosition", "()I", "setFromCurrencyPosition", "(I)V", "state", "getState", "toCurrencyPosition", "getToCurrencyPosition", "setToCurrencyPosition", "calculate", "", "amount", "", "convert", "position", "dismissScreen", "loadCurrency", "loadCurrencyList", "Companion", "exchangeconverter_devDebug"})
public final class ExchangeSelectorViewModel extends androidx.lifecycle.ViewModel {
    private final uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo exchangeRateRepo = null;
    private final androidx.lifecycle.MutableLiveData<uae.hamilton.currencyconversion.core.local.entity.ExchangeRate> _data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uae.hamilton.currencyconversion.core.local.entity.ExchangeRate> data = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<uae.hamilton.currencyconversion.core.local.entity.Currency>> _currency = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<uae.hamilton.currencyconversion.core.local.entity.Currency>> currency = null;
    private final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState> state = null;
    @org.jetbrains.annotations.Nullable()
    private uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest;
    private int fromCurrencyPosition = 0;
    private int toCurrencyPosition = 0;
    private final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent> event = null;
    @org.jetbrains.annotations.NotNull()
    public static final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENCY_USD = "USD";
    
    public ExchangeSelectorViewModel(@org.jetbrains.annotations.NotNull()
    uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo exchangeRateRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uae.hamilton.currencyconversion.core.local.entity.ExchangeRate> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<uae.hamilton.currencyconversion.core.local.entity.Currency>> getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest getConversionRequest() {
        return null;
    }
    
    public final void setConversionRequest(@org.jetbrains.annotations.Nullable()
    uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest p0) {
    }
    
    public final int getFromCurrencyPosition() {
        return 0;
    }
    
    public final void setFromCurrencyPosition(int p0) {
    }
    
    public final int getToCurrencyPosition() {
        return 0;
    }
    
    public final void setToCurrencyPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent> getEvent() {
        return null;
    }
    
    private final void loadCurrencyList() {
    }
    
    public final void loadCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency, int position) {
    }
    
    public final void convert(@org.jetbrains.annotations.NotNull()
    uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest, int position) {
    }
    
    public final void calculate(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
    }
    
    public final void dismissScreen() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewModel$Companion;", "", "()V", "CURRENCY_USD", "", "exchangeconverter_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}