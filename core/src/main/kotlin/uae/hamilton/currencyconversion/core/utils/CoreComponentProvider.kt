package uae.hamilton.currencyconversion.core.utils
import uae.hamilton.currencyconversion.core.di.CoreComponent

interface CoreComponentProvider {
    fun provideCoreComponent(): CoreComponent
}
