package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uae.hamilton.currencyconversion.common.ui.base.BaseDialog_MembersInjector;
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialog;
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerConfirmDialogComponent {
  private DaggerConfirmDialogComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ConfirmDialogModule confirmDialogModule;

    private Builder() {
    }

    public Builder confirmDialogModule(ConfirmDialogModule confirmDialogModule) {
      this.confirmDialogModule = Preconditions.checkNotNull(confirmDialogModule);
      return this;
    }

    public ConfirmDialogComponent build() {
      Preconditions.checkBuilderRequirement(confirmDialogModule, ConfirmDialogModule.class);
      return new ConfirmDialogComponentImpl(confirmDialogModule);
    }
  }

  private static final class ConfirmDialogComponentImpl implements ConfirmDialogComponent {
    private final ConfirmDialogComponentImpl confirmDialogComponentImpl = this;

    private Provider<ConfirmDialogViewModel> provideViewModelProvider;

    private ConfirmDialogComponentImpl(ConfirmDialogModule confirmDialogModuleParam) {

      initialize(confirmDialogModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ConfirmDialogModule confirmDialogModuleParam) {
      this.provideViewModelProvider = DoubleCheck.provider(ConfirmDialogModule_ProvideViewModelFactory.create(confirmDialogModuleParam));
    }

    @Override
    public void inject(ConfirmDialog dialog) {
      injectConfirmDialog(dialog);
    }

    private ConfirmDialog injectConfirmDialog(ConfirmDialog instance) {
      BaseDialog_MembersInjector.injectViewModel(instance, provideViewModelProvider.get());
      return instance;
    }
  }
}
