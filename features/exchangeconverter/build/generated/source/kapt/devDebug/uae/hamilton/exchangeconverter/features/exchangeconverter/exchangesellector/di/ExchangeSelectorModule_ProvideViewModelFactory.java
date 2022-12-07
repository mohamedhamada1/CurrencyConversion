package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangesellector.ExchangeSelectorViewModel;

@ScopeMetadata("uae.hamilton.currencyconversion.core.di.scopes.FeatureScope")
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
public final class ExchangeSelectorModule_ProvideViewModelFactory implements Factory<ExchangeSelectorViewModel> {
  private final ExchangeSelectorModule module;

  private final Provider<CurrencyExchangeRepo> currencyExchangeRepoProvider;

  public ExchangeSelectorModule_ProvideViewModelFactory(ExchangeSelectorModule module,
      Provider<CurrencyExchangeRepo> currencyExchangeRepoProvider) {
    this.module = module;
    this.currencyExchangeRepoProvider = currencyExchangeRepoProvider;
  }

  @Override
  public ExchangeSelectorViewModel get() {
    return provideViewModel(module, currencyExchangeRepoProvider.get());
  }

  public static ExchangeSelectorModule_ProvideViewModelFactory create(ExchangeSelectorModule module,
      Provider<CurrencyExchangeRepo> currencyExchangeRepoProvider) {
    return new ExchangeSelectorModule_ProvideViewModelFactory(module, currencyExchangeRepoProvider);
  }

  public static ExchangeSelectorViewModel provideViewModel(ExchangeSelectorModule instance,
      CurrencyExchangeRepo currencyExchangeRepo) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewModel(currencyExchangeRepo));
  }
}
