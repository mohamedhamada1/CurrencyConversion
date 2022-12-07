package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "Luae/hamilton/currencyconversion/common/ui/base/BaseViewState;", "()V", "Failure", "Loaded", "Loading", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Failure;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Loaded;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Loading;", "exchangeconverter_devDebug"})
public abstract class ExchangeSelectorViewState implements uae.hamilton.currencyconversion.common.ui.base.BaseViewState {
    
    private ExchangeSelectorViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Loaded;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "()V", "exchangeconverter_devDebug"})
    public static final class Loaded extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState {
        @org.jetbrains.annotations.NotNull()
        public static final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState.Loaded INSTANCE = null;
        
        private Loaded() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Loading;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "()V", "exchangeconverter_devDebug"})
    public static final class Loading extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState {
        @org.jetbrains.annotations.NotNull()
        public static final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState$Failure;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorViewState;", "error", "Luae/hamilton/currencyconversion/core/remote/Result$Error;", "(Luae/hamilton/currencyconversion/core/remote/Result$Error;)V", "getError", "()Luae/hamilton/currencyconversion/core/remote/Result$Error;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "exchangeconverter_devDebug"})
    public static final class Failure extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState {
        @org.jetbrains.annotations.NotNull()
        private final uae.hamilton.currencyconversion.core.remote.Result.Error error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewState.Failure copy(@org.jetbrains.annotations.NotNull()
        uae.hamilton.currencyconversion.core.remote.Result.Error error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Failure(@org.jetbrains.annotations.NotNull()
        uae.hamilton.currencyconversion.core.remote.Result.Error error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.currencyconversion.core.remote.Result.Error component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.currencyconversion.core.remote.Result.Error getError() {
            return null;
        }
    }
}