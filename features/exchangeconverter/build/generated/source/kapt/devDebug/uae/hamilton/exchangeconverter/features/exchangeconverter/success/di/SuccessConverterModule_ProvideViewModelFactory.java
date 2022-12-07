package uae.hamilton.exchangeconverter.features.exchangeconverter.success.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import uae.hamilton.exchangeconverter.features.exchangeconverter.success.SuccessConverterViewModel;

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
public final class SuccessConverterModule_ProvideViewModelFactory implements Factory<SuccessConverterViewModel> {
  private final SuccessConverterModule module;

  public SuccessConverterModule_ProvideViewModelFactory(SuccessConverterModule module) {
    this.module = module;
  }

  @Override
  public SuccessConverterViewModel get() {
    return provideViewModel(module);
  }

  public static SuccessConverterModule_ProvideViewModelFactory create(
      SuccessConverterModule module) {
    return new SuccessConverterModule_ProvideViewModelFactory(module);
  }

  public static SuccessConverterViewModel provideViewModel(SuccessConverterModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewModel());
  }
}
