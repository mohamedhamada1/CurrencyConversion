package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uae.hamilton.currencyconversion.common.ui.base.BaseFragment_MembersInjector;
import uae.hamilton.currencyconversion.core.di.CoreComponent;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.FragmentExchangeConverter;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerExchangeConverterComponent {
  private DaggerExchangeConverterComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ExchangeConverterModule exchangeConverterModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder exchangeConverterModule(ExchangeConverterModule exchangeConverterModule) {
      this.exchangeConverterModule = Preconditions.checkNotNull(exchangeConverterModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public ExchangeConverterComponent build() {
      Preconditions.checkBuilderRequirement(exchangeConverterModule, ExchangeConverterModule.class);
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new ExchangeConverterComponentImpl(exchangeConverterModule, coreComponent);
    }
  }

  private static final class ExchangeConverterComponentImpl implements ExchangeConverterComponent {
    private final ExchangeConverterComponentImpl exchangeConverterComponentImpl = this;

    private Provider<ExchangeConverterViewModel> provideViewModelProvider;

    private ExchangeConverterComponentImpl(ExchangeConverterModule exchangeConverterModuleParam,
        CoreComponent coreComponentParam) {

      initialize(exchangeConverterModuleParam, coreComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ExchangeConverterModule exchangeConverterModuleParam,
        final CoreComponent coreComponentParam) {
      this.provideViewModelProvider = DoubleCheck.provider(ExchangeConverterModule_ProvideViewModelFactory.create(exchangeConverterModuleParam));
    }

    @Override
    public void inject(FragmentExchangeConverter fragment) {
      injectFragmentExchangeConverter(fragment);
    }

    private FragmentExchangeConverter injectFragmentExchangeConverter(
        FragmentExchangeConverter instance) {
      BaseFragment_MembersInjector.injectViewModel(instance, provideViewModelProvider.get());
      return instance;
    }
  }
}
