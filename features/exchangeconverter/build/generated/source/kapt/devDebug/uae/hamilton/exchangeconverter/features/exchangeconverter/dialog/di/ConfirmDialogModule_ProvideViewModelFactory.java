package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel;

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
public final class ConfirmDialogModule_ProvideViewModelFactory implements Factory<ConfirmDialogViewModel> {
  private final ConfirmDialogModule module;

  public ConfirmDialogModule_ProvideViewModelFactory(ConfirmDialogModule module) {
    this.module = module;
  }

  @Override
  public ConfirmDialogViewModel get() {
    return provideViewModel(module);
  }

  public static ConfirmDialogModule_ProvideViewModelFactory create(ConfirmDialogModule module) {
    return new ConfirmDialogModule_ProvideViewModelFactory(module);
  }

  public static ConfirmDialogViewModel provideViewModel(ConfirmDialogModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewModel());
  }
}
