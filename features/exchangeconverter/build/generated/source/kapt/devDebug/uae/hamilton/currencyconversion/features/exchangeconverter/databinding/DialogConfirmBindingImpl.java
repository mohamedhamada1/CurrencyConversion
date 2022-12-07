package uae.hamilton.currencyconversion.features.exchangeconverter.databinding;
import uae.hamilton.currencyconversion.features.exchangeconverter.R;
import uae.hamilton.currencyconversion.features.exchangeconverter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogConfirmBindingImpl extends DialogConfirmBinding implements uae.hamilton.currencyconversion.features.exchangeconverter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogConfirmBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogConfirmBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.closeBtn.setTag(null);
        this.confirmBtn.setTag(null);
        this.descTV.setTag(null);
        this.dismissBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleTV.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new uae.hamilton.currencyconversion.features.exchangeconverter.generated.callback.OnClickListener(this, 3);
        mCallback1 = new uae.hamilton.currencyconversion.features.exchangeconverter.generated.callback.OnClickListener(this, 1);
        mCallback2 = new uae.hamilton.currencyconversion.features.exchangeconverter.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.confirm == variableId) {
            setConfirm((java.lang.String) variable);
        }
        else if (BR.desc == variableId) {
            setDesc((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.dismiss == variableId) {
            setDismiss((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConfirm(@Nullable java.lang.String Confirm) {
        this.mConfirm = Confirm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.confirm);
        super.requestRebind();
    }
    public void setDesc(@Nullable java.lang.String Desc) {
        this.mDesc = Desc;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.desc);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setDismiss(@Nullable java.lang.String Dismiss) {
        this.mDismiss = Dismiss;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.dismiss);
        super.requestRebind();
    }
    public void setViewModel(@Nullable uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String confirm = mConfirm;
        java.lang.String desc = mDesc;
        java.lang.String title = mTitle;
        java.lang.String dismiss = mDismiss;
        uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x21L) != 0) {
        }
        if ((dirtyFlags & 0x22L) != 0) {
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.closeBtn.setOnClickListener(mCallback1);
            this.confirmBtn.setOnClickListener(mCallback2);
            this.dismissBtn.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.confirmBtn, confirm);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descTV, desc);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dismissBtn, dismiss);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTV, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickDismiss();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.dismissDialog();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickConfirm();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): confirm
        flag 1 (0x2L): desc
        flag 2 (0x3L): title
        flag 3 (0x4L): dismiss
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}