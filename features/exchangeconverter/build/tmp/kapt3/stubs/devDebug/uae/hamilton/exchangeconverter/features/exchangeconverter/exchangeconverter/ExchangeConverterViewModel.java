package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/ExchangeConverterViewModel;", "Landroidx/lifecycle/ViewModel;", "conversionRequest", "Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "(Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;)V", "_event", "Luae/hamilton/currencyconversion/common/ui/livedata/SingleLiveData;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/ExchangeConverterEvent;", "_restartConversionTimerSeconds", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_state", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/ExchangeConverterViewState;", "getConversionRequest", "()Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "restartConversionTimerSeconds", "getRestartConversionTimerSeconds", "state", "getState", "()Luae/hamilton/currencyconversion/common/ui/livedata/SingleLiveData;", "convert", "", "startTimer", "Companion", "exchangeconverter_devDebug"})
public final class ExchangeConverterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _restartConversionTimerSeconds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> restartConversionTimerSeconds = null;
    private final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewState> state = null;
    private final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterEvent> event = null;
    @org.jetbrains.annotations.NotNull()
    public static final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel.Companion Companion = null;
    public static final int CONVERSION_TIME_OUT = 30;
    
    public ExchangeConverterViewModel(@org.jetbrains.annotations.NotNull()
    uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest getConversionRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getRestartConversionTimerSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uae.hamilton.currencyconversion.common.ui.livedata.SingleLiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterEvent> getEvent() {
        return null;
    }
    
    private final void startTimer() {
    }
    
    public final void convert() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangeconverter/ExchangeConverterViewModel$Companion;", "", "()V", "CONVERSION_TIME_OUT", "", "exchangeconverter_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}