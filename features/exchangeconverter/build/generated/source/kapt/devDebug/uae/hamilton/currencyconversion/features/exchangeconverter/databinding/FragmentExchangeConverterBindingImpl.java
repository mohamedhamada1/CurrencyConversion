package uae.hamilton.currencyconversion.features.exchangeconverter.databinding;
import uae.hamilton.currencyconversion.features.exchangeconverter.R;
import uae.hamilton.currencyconversion.features.exchangeconverter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExchangeConverterBindingImpl extends FragmentExchangeConverterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.Precedes, 4);
        sViewsWithIds.put(R.id.btnCalculate, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExchangeConverterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentExchangeConverterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.convertFromTV.setTag(null);
        this.convertToTV.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.secondLeft.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRestartConversionTimerSeconds((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRestartConversionTimerSeconds(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelRestartConversionTimerSeconds, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String secondLeftAndroidStringSecondLeftViewModelRestartConversionTimerSeconds = null;
        java.lang.Double viewModelConversionRequestAmountToConvert = null;
        java.lang.Integer viewModelRestartConversionTimerSecondsGetValue = null;
        java.lang.String convertToTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny = null;
        java.lang.String viewModelConversionRequestToCurreny = null;
        java.lang.String doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate = null;
        java.lang.String convertFromTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestFromCurrency = null;
        double viewModelConversionRequestRate = 0.0;
        java.lang.String viewModelConversionRequestFromCurrency = null;
        double viewModelConversionRequestAmountToConvertViewModelConversionRequestRate = 0.0;
        double androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert = 0.0;
        uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel viewModel = mViewModel;
        uae.hamilton.exchangeconverter.features.exchangeconverter.ConversionRequest viewModelConversionRequest = null;
        java.lang.String doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvert = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelRestartConversionTimerSeconds = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

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
                        // read viewModel.conversionRequest.fromCurrency
                        viewModelConversionRequestFromCurrency = viewModelConversionRequest.getFromCurrency();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)
                    androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert = androidx.databinding.ViewDataBinding.safeUnbox(viewModelConversionRequestAmountToConvert);


                    // read (androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)) * (viewModel.conversionRequest.rate)
                    viewModelConversionRequestAmountToConvertViewModelConversionRequestRate = (androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert) * (viewModelConversionRequestRate);
                    // read DoubleExtKt.formatCurrency(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert))
                    doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvert = uae.hamilton.currencyconversion.common.ui.extensions.DoubleExtKt.formatCurrency(androidxDatabindingViewDataBindingSafeUnboxViewModelConversionRequestAmountToConvert);


                    // read DoubleExtKt.formatCurrency((androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conversionRequest.amountToConvert)) * (viewModel.conversionRequest.rate))
                    doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate = uae.hamilton.currencyconversion.common.ui.extensions.DoubleExtKt.formatCurrency(viewModelConversionRequestAmountToConvertViewModelConversionRequestRate);
                    // read @android:string/currency_container
                    convertFromTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestFromCurrency = convertFromTV.getResources().getString(R.string.currency_container, doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvert, viewModelConversionRequestFromCurrency);


                    // read @android:string/currency_container
                    convertToTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny = convertToTV.getResources().getString(R.string.currency_container, doubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRate, viewModelConversionRequestToCurreny);
            }

                if (viewModel != null) {
                    // read viewModel.restartConversionTimerSeconds
                    viewModelRestartConversionTimerSeconds = viewModel.getRestartConversionTimerSeconds();
                }
                updateLiveDataRegistration(0, viewModelRestartConversionTimerSeconds);


                if (viewModelRestartConversionTimerSeconds != null) {
                    // read viewModel.restartConversionTimerSeconds.getValue()
                    viewModelRestartConversionTimerSecondsGetValue = viewModelRestartConversionTimerSeconds.getValue();
                }


                // read @android:string/second_left
                secondLeftAndroidStringSecondLeftViewModelRestartConversionTimerSeconds = secondLeft.getResources().getString(R.string.second_left, viewModelRestartConversionTimerSecondsGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.convertFromTV, convertFromTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestFromCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.convertToTV, convertToTVAndroidStringCurrencyContainerDoubleExtKtFormatCurrencyViewModelConversionRequestAmountToConvertViewModelConversionRequestRateViewModelConversionRequestToCurreny);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondLeft, secondLeftAndroidStringSecondLeftViewModelRestartConversionTimerSeconds);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.restartConversionTimerSeconds
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}