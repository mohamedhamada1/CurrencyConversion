package uae.hamilton.currencyconversion.common.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u000f\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H&J\b\u0010%\u001a\u00020\u0019H&J\u001a\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u00028\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Luae/hamilton/currencyconversion/common/ui/base/BaseFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "M", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "isNavigatingToDestination", "", "()Z", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "setViewModel", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/lifecycle/ViewModel;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onInitDataBinding", "onInitDependencyInjection", "onViewCreated", "view", "ui_devDebug"})
public abstract class BaseFragment<B extends androidx.databinding.ViewDataBinding, M extends androidx.lifecycle.ViewModel> extends androidx.fragment.app.Fragment {
    private final int layoutId = 0;
    @javax.inject.Inject()
    public M viewModel;
    public B viewBinding;
    private final boolean isNavigatingToDestination = false;
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    M p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getViewBinding() {
        return null;
    }
    
    public final void setViewBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    protected final boolean isNavigatingToDestination() {
        return false;
    }
    
    public abstract void onInitDependencyInjection();
    
    public abstract void onInitDataBinding();
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}