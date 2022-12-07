package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter.ExchangeConverterViewModel;

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
public final class ExchangeConverterModule_ProvideViewModelFactory implements Factory<ExchangeConverterViewModel> {
  private final ExchangeConverterModule module;

  public ExchangeConverterModule_ProvideViewModelFactory(ExchangeConverterModule module) {
    this.module = module;
  }

  @Override
  public ExchangeConverterViewModel get() {
    return provideViewModel(module);
  }

  public static ExchangeConverterModule_ProvideViewModelFactory create(
      ExchangeConverterModule module) {
    return new ExchangeConverterModule_ProvideViewModelFactory(module);
  }

  public static ExchangeConverterViewModel provideViewModel(ExchangeConverterModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewModel());
  }
}
