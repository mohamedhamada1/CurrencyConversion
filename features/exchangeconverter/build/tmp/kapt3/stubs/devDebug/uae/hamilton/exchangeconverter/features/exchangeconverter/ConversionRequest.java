package uae.hamilton.exchangeconverter.features.exchangeconverter;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006&"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "Landroid/os/Parcelable;", "fromCurrency", "", "toCurreny", "rate", "", "amountToConvert", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;)V", "getAmountToConvert", "()Ljava/lang/Double;", "setAmountToConvert", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFromCurrency", "()Ljava/lang/String;", "getRate", "()D", "getToCurreny", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;)Luae/hamilton/exchangeconverter/features/exchangeconverter/ConversionRequest;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "exchangeconverter_devDebug"})
public final class ConversionRequest implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fromCurrency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String toCurreny = null;
    private final double rate = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double amountToConvert;
    public static final android.os.Parcelable.Creator<uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurreny, double rate, @org.jetbrains.annotations.Nullable()
    java.lang.Double amountToConvert) {
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
    
    public ConversionRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurreny, double rate, @org.jetbrains.annotations.Nullable()
    java.lang.Double amountToConvert) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToCurreny() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getRate() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAmountToConvert() {
        return null;
    }
    
    public final void setAmountToConvert(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest[] newArray(int size) {
            return null;
        }
    }
}