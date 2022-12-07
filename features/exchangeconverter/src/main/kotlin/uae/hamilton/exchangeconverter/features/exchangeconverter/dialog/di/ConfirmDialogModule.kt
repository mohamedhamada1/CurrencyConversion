package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di

import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialog
import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialogViewModel
import dagger.Module
import dagger.Provides
import uae.hamilton.currencyconversion.common.ui.extensions.viewModel
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope

@Module
class ConfirmDialogModule(private val dialog: ConfirmDialog) {

    @FeatureScope
    @Provides
    fun provideViewModel() = dialog.viewModel {
        ConfirmDialogViewModel()
    }
}
