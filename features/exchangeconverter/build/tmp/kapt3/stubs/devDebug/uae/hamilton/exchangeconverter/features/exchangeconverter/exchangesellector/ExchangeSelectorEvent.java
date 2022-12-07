package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "", "()V", "Dismiss", "LoadCurrency", "OpenSelectorScreen", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$Dismiss;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$LoadCurrency;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$OpenSelectorScreen;", "exchangeconverter_devDebug"})
public abstract class ExchangeSelectorEvent {
    
    private ExchangeSelectorEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$LoadCurrency;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "currency", "", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "exchangeconverter_devDebug"})
    public static final class LoadCurrency extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currency = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent.LoadCurrency copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currency) {
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
        
        public LoadCurrency(@org.jetbrains.annotations.NotNull()
        java.lang.String currency) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrency() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$OpenSelectorScreen;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "conversionRequest", "Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "(Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;)V", "getConversionRequest", "()Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "exchangeconverter_devDebug"})
    public static final class OpenSelectorScreen extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent {
        @org.jetbrains.annotations.NotNull()
        private final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent.OpenSelectorScreen copy(@org.jetbrains.annotations.NotNull()
        uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest) {
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
        
        public OpenSelectorScreen(@org.jetbrains.annotations.NotNull()
        uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest conversionRequest) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest getConversionRequest() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent$Dismiss;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/exchangesellector/ExchangeSelectorEvent;", "()V", "exchangeconverter_devDebug"})
    public static final class Dismiss extends uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorEvent.Dismiss INSTANCE = null;
        
        private Dismiss() {
            super();
        }
    }
}