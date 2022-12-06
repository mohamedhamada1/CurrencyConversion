package uae.hamilton.currencyconversion.common.ui.base;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseFragment_MembersInjector<B extends ViewDataBinding, M extends ViewModel> implements MembersInjector<BaseFragment<B, M>> {
  private final Provider<M> viewModelProvider;

  public BaseFragment_MembersInjector(Provider<M> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static <B extends ViewDataBinding, M extends ViewModel> MembersInjector<BaseFragment<B, M>> create(
      Provider<M> viewModelProvider) {
    return new BaseFragment_MembersInjector<B, M>(viewModelProvider);
  }

  @Override
  public void injectMembers(BaseFragment<B, M> instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("uae.hamilton.currencyconversion.common.ui.base.BaseFragment.viewModel")
  public static <B extends ViewDataBinding, M extends ViewModel> void injectViewModel(
      BaseFragment<B, M> instance, M viewModel) {
    instance.viewModel = viewModel;
  }
}
