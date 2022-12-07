package uae.hamilton.exchangeconverter.features.exchangeconverter.success.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uae.hamilton.currencyconversion.common.ui.base.BaseFragment_MembersInjector;
import uae.hamilton.currencyconversion.core.di.CoreComponent;
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.FragmentConverterSuccess;
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSuccessConverterComponent {
  private DaggerSuccessConverterComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private SuccessConverterModule successConverterModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder successConverterModule(SuccessConverterModule successConverterModule) {
      this.successConverterModule = Preconditions.checkNotNull(successConverterModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public SuccessConverterComponent build() {
      Preconditions.checkBuilderRequirement(successConverterModule, SuccessConverterModule.class);
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new SuccessConverterComponentImpl(successConverterModule, coreComponent);
    }
  }

  private static final class SuccessConverterComponentImpl implements SuccessConverterComponent {
    private final SuccessConverterComponentImpl successConverterComponentImpl = this;

    private Provider<SuccessConverterViewModel> provideViewModelProvider;

    private SuccessConverterComponentImpl(SuccessConverterModule successConverterModuleParam,
        CoreComponent coreComponentParam) {

      initialize(successConverterModuleParam, coreComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SuccessConverterModule successConverterModuleParam,
        final CoreComponent coreComponentParam) {
      this.provideViewModelProvider = DoubleCheck.provider(SuccessConverterModule_ProvideViewModelFactory.create(successConverterModuleParam));
    }

    @Override
    public void inject(FragmentConverterSuccess fragment) {
      injectFragmentConverterSuccess(fragment);
    }

    private FragmentConverterSuccess injectFragmentConverterSuccess(
        FragmentConverterSuccess instance) {
      BaseFragment_MembersInjector.injectViewModel(instance, provideViewModelProvider.get());
      return instance;
    }
  }
}
