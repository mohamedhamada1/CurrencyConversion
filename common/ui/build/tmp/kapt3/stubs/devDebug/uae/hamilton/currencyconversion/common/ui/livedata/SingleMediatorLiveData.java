package uae.hamilton.currencyconversion.common.ui.livedata;

import java.lang.System;

/**
 * @see SingleLiveData
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0017J\u0017\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u0010R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Luae/hamilton/currencyconversion/common/ui/livedata/SingleMediatorLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "()V", "observers", "", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Observer;", "pending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "observer", "setValue", "value", "(Ljava/lang/Object;)V", "ui_devDebug"})
public final class SingleMediatorLiveData<T extends java.lang.Object> extends androidx.lifecycle.MediatorLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean pending = null;
    private final java.util.Map<androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Observer<? super T>> observers = null;
    
    public SingleMediatorLiveData() {
        super();
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    T value) {
    }
}