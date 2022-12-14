// Generated by data binding compiler. Do not edit!
package uae.hamilton.currencyconversion.features.exchangeconverter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import uae.hamilton.currencyconversion.features.exchangeconverter.R;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel;

public abstract class FragmentExchangeSelectorBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatEditText amountValueET;

  @NonNull
  public final AppCompatButton btnCalculate;

  @NonNull
  public final AppCompatSpinner fromCurrencySpinner;

  @NonNull
  public final AppCompatSpinner toCurrencySpinner;

  @Bindable
  protected ExchangeSelectorViewModel mViewModel;

  protected FragmentExchangeSelectorBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatEditText amountValueET, AppCompatButton btnCalculate,
      AppCompatSpinner fromCurrencySpinner, AppCompatSpinner toCurrencySpinner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amountValueET = amountValueET;
    this.btnCalculate = btnCalculate;
    this.fromCurrencySpinner = fromCurrencySpinner;
    this.toCurrencySpinner = toCurrencySpinner;
  }

  public abstract void setViewModel(@Nullable ExchangeSelectorViewModel viewModel);

  @Nullable
  public ExchangeSelectorViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentExchangeSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exchange_selector, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExchangeSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentExchangeSelectorBinding>inflateInternal(inflater, R.layout.fragment_exchange_selector, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentExchangeSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exchange_selector, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExchangeSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentExchangeSelectorBinding>inflateInternal(inflater, R.layout.fragment_exchange_selector, null, false, component);
  }

  public static FragmentExchangeSelectorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentExchangeSelectorBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentExchangeSelectorBinding)bind(component, view, R.layout.fragment_exchange_selector);
  }
}
