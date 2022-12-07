package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uae.hamilton.currencyconversion.common.ui.base.BaseFragment_MembersInjector;
import uae.hamilton.currencyconversion.core.di.CoreComponent;
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.FragmentExchangeSelector;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerExchangeSelectorComponent {
  private DaggerExchangeSelectorComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ExchangeSelectorModule exchangeSelectorModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder exchangeSelectorModule(ExchangeSelectorModule exchangeSelectorModule) {
      this.exchangeSelectorModule = Preconditions.checkNotNull(exchangeSelectorModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public ExchangeSelectorComponent build() {
      Preconditions.checkBuilderRequirement(exchangeSelectorModule, ExchangeSelectorModule.class);
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new ExchangeSelectorComponentImpl(exchangeSelectorModule, coreComponent);
    }
  }

  private static final class ExchangeSelectorComponentImpl implements ExchangeSelectorComponent {
    private final ExchangeSelectorComponentImpl exchangeSelectorComponentImpl = this;

    private Provider<CurrencyExchangeRepo> currencyExchangeRepoProvider;

    private Provider<ExchangeSelectorViewModel> provideViewModelProvider;

    private ExchangeSelectorComponentImpl(ExchangeSelectorModule exchangeSelectorModuleParam,
        CoreComponent coreComponentParam) {

      initialize(exchangeSelectorModuleParam, coreComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ExchangeSelectorModule exchangeSelectorModuleParam,
        final CoreComponent coreComponentParam) {
      this.currencyExchangeRepoProvider = new CurrencyExchangeRepoProvider(coreComponentParam);
      this.provideViewModelProvider = DoubleCheck.provider(ExchangeSelectorModule_ProvideViewModelFactory.create(exchangeSelectorModuleParam, currencyExchangeRepoProvider));
    }

    @Override
    public void inject(FragmentExchangeSelector fragment) {
      injectFragmentExchangeSelector(fragment);
    }

    private FragmentExchangeSelector injectFragmentExchangeSelector(
        FragmentExchangeSelector instance) {
      BaseFragment_MembersInjector.injectViewModel(instance, provideViewModelProvider.get());
      return instance;
    }

    private static final class CurrencyExchangeRepoProvider implements Provider<CurrencyExchangeRepo> {
      private final CoreComponent coreComponent;

      CurrencyExchangeRepoProvider(CoreComponent coreComponent) {
        this.coreComponent = coreComponent;
      }

      @Override
      public CurrencyExchangeRepo get() {
        return Preconditions.checkNotNullFromComponent(coreComponent.currencyExchangeRepo());
      }
    }
  }
}
