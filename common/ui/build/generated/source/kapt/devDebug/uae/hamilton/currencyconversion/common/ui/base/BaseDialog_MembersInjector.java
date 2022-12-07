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
public final class BaseDialog_MembersInjector<B extends ViewDataBinding, M extends ViewModel> implements MembersInjector<BaseDialog<B, M>> {
  private final Provider<M> viewModelProvider;

  public BaseDialog_MembersInjector(Provider<M> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static <B extends ViewDataBinding, M extends ViewModel> MembersInjector<BaseDialog<B, M>> create(
      Provider<M> viewModelProvider) {
    return new BaseDialog_MembersInjector<B, M>(viewModelProvider);
  }

  @Override
  public void injectMembers(BaseDialog<B, M> instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("uae.hamilton.currencyconversion.common.ui.base.BaseDialog.viewModel")
  public static <B extends ViewDataBinding, M extends ViewModel> void injectViewModel(
      BaseDialog<B, M> instance, M viewModel) {
    instance.viewModel = viewModel;
  }
}
