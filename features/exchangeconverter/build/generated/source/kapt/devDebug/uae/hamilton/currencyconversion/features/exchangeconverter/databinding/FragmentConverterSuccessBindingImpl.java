package uae.hamilton.currencyconversion.features.exchangeconverter.databinding;
import uae.hamilton.currencyconversion.features.exchangeconverter.R;
import uae.hamilton.currencyconversion.features.exchangeconverter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConverterSuccessBindingImpl extends FragmentConverterSuccessBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.confirmImg, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConverterSuccessBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentConverterSuccessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            );
        this.TVConversionResult.setTag(null);
        this.TVRate.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.lang.Double viewModelConversionRequestAmountToConvert = null;
        java.lang.String viewModelConversionRequestToCurreny = null;
        java.lang.String doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate = null;
        double viewModelConversionRequestRate = 0.0;
        double viewModelConversionRequestAmountToConvertViewModelConversionRequestRate = 0.0;
        double androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert = 0.0;
        uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel viewModel = mViewModel;
        uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest viewModelConversionRequest = null;
        java.lang.String tVConversionResultAndroidStringGreatNowYouHaveDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny = null;
        java.lang.String tVRateAndroidStringTheRateWasViewModelConversionRequestRate = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.conversionRequest
                    viewModelConversionRequest = viewModel.getConversionRequest();
                }


                if (viewModelConversionRequest != null) {
                    // read viewModel.conversionRequest.amountToConvert
                    viewModelConversionRequestAmountToConvert = viewModelConversionRequest.getAmountToConvert();
                    // read viewModel.conversionRequest.toCurreny
                    viewModelConversionRequestToCurreny = viewModelConversionRequest.getToCurreny();
                    // read viewModel.conversionRequest.rate
                    viewModelConversionRequestRate = viewModelConversionRequest.getRate();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)
                androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert = androidx.databinding.ViewDataBinding.safeUnbox(viewModelConversionRequestAmountToConvert);
                // read @android:string/the_rate_was
                tVRateAndroidStringTheRateWasViewModelConversionRequestRate = TVRate.getResources().getString(R.string.the_rate_was, viewModelConversionRequestRate);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)) * (viewModel.conversionRequest.rate)
                viewModelConversionRequestAmountToConvertViewModelConversionRequestRate = (androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert) * (viewModelConversionRequestRate);


                // read DoubleExtKt.formatCurrency((androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)) * (viewModel.conversionRequest.rate))
                doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate = uae.hamilton.currencyconversion.common.ui.extensions.DoubleExtKt.formatCurrency(viewModelConversionRequestAmountToConvertViewModelConversionRequestRate);


                // read @android:string/great_now_you_have
                tVConversionResultAndroidStringGreatNowYouHaveDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny = TVConversionResult.getResources().getString(R.string.great_now_you_have, doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate, viewModelConversionRequestToCurreny);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TVConversionResult, tVConversionResultAndroidStringGreatNowYouHaveDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TVRate, tVRateAndroidStringTheRateWasViewModelConversionRequestRate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}