package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/dialog/ConfirmDialog;", "Luae/hamilton/currencyconversion/common/ui/base/BaseDialog;", "Luae/hamilton/currencyconversion/features/exchangeconverter/databinding/DialogConfirmBinding;", "Luae/hamilton/exchangeconverter/features/exchangeconverter/dialog/ConfirmDialogViewModel;", "()V", "onConfirm", "Lkotlin/Function0;", "", "onDismiss", "handleEvent", "event", "Luae/hamilton/exchangeconverter/features/exchangeconverter/dialog/ConfirmDialogEvent;", "onInitDataBinding", "onInitDependencyInjection", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "exchangeconverter_devDebug"})
public final class ConfirmDialog extends uae.hamilton.currencyconversion.common.ui.base.BaseDialog<uae.hamilton.currencyconversion.features.exchangeconverter.databinding.DialogConfirmBinding, uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel> {
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm;
    @org.jetbrains.annotations.NotNull()
    public static final uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialog.Companion Companion = null;
    private static final java.lang.String PARAM_TITLE = "title";
    private static final java.lang.String PARAM_DESC = "desc";
    private static final java.lang.String PARAM_CONFIRM = "confirm";
    private static final java.lang.String PARAM_DISMISS = "dismiss";
    
    public ConfirmDialog() {
        super(0);
    }
    
    @java.lang.Override()
    public void onInitDependencyInjection() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInitDataBinding() {
    }
    
    private final void handleEvent(uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JV\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Luae/hamilton/exchangeconverter/features/exchangeconverter/dialog/ConfirmDialog$Companion;", "", "()V", "PARAM_CONFIRM", "", "PARAM_DESC", "PARAM_DISMISS", "PARAM_TITLE", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "title", "desc", "confirm", "dismiss", "onDismiss", "Lkotlin/Function0;", "onConfirm", "exchangeconverter_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.Nullable()
        java.lang.String confirm, @org.jetbrains.annotations.Nullable()
        java.lang.String dismiss, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm) {
        }
    }
}