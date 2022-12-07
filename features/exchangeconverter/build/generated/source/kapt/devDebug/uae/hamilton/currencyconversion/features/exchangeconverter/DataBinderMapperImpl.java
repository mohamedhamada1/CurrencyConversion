package uae.hamilton.currencyconversion.features.exchangeconverter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.DialogConfirmBindingImpl;
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentConverterSuccessBindingImpl;
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentExchangeConverterBindingImpl;
import uae.hamilton.currencyconversion.features.exchangeconverter.databinding.FragmentExchangeSelectorBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_DIALOGCONFIRM = 1;

  private static final int LAYOUT_FRAGMENTCONVERTERSUCCESS = 2;

  private static final int LAYOUT_FRAGMENTEXCHANGECONVERTER = 3;

  private static final int LAYOUT_FRAGMENTEXCHANGESELECTOR = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.dialog_confirm, LAYOUT_DIALOGCONFIRM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_converter_success, LAYOUT_FRAGMENTCONVERTERSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_exchange_converter, LAYOUT_FRAGMENTEXCHANGECONVERTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_exchange_selector, LAYOUT_FRAGMENTEXCHANGESELECTOR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_DIALOGCONFIRM: {
          if ("layout/dialog_confirm_0".equals(tag)) {
            return new DialogConfirmBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_confirm is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONVERTERSUCCESS: {
          if ("layout/fragment_converter_success_0".equals(tag)) {
            return new FragmentConverterSuccessBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_converter_success is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCHANGECONVERTER: {
          if ("layout/fragment_exchange_converter_0".equals(tag)) {
            return new FragmentExchangeConverterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exchange_converter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCHANGESELECTOR: {
          if ("layout/fragment_exchange_selector_0".equals(tag)) {
            return new FragmentExchangeSelectorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exchange_selector is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(4);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new uae.hamilton.currencyconversion.common.navigation.DataBinderMapperImpl());
    result.add(new uae.hamilton.currencyconversion.common.ui.DataBinderMapperImpl());
    result.add(new uae.hamilton.currencyconversion.core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "confirm");
      sKeys.put(2, "desc");
      sKeys.put(3, "dismiss");
      sKeys.put(4, "title");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/dialog_confirm_0", uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.dialog_confirm);
      sKeys.put("layout/fragment_converter_success_0", uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_converter_success);
      sKeys.put("layout/fragment_exchange_converter_0", uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_exchange_converter);
      sKeys.put("layout/fragment_exchange_selector_0", uae.hamilton.currencyconversion.features.exchangeconverter.R.layout.fragment_exchange_selector);
    }
  }
}
