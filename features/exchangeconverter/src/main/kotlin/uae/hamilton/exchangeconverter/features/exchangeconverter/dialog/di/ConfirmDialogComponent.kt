package uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.di

import uae.hamilton.exchangeconverter.features.exchangeconverter.dialog.ConfirmDialog
import dagger.Component
import uae.hamilton.currencyconversion.core.di.scopes.FeatureScope

@FeatureScope
@Component(
    modules = [ConfirmDialogModule::class]
)
interface ConfirmDialogComponent {

    fun inject(dialog: ConfirmDialog)
}
