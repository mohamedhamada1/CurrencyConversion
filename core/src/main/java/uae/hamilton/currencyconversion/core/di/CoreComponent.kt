package uae.hamilton.currencyconversion.core.di

import android.app.Application
import android.content.Context
import dagger.Component
import uae.hamilton.currencyconversion.core.di.modules.ContextModule
import uae.hamilton.currencyconversion.core.di.modules.DatabaseModule
import uae.hamilton.currencyconversion.core.di.modules.NetworkModule
import uae.hamilton.currencyconversion.core.di.modules.RepositoryModule
import uae.hamilton.currencyconversion.core.di.scopes.AppScope
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo

@AppScope
@Component(
    modules = [
        ContextModule::class,
        DatabaseModule::class,
        NetworkModule::class,
        RepositoryModule::class
    ]
)
interface CoreComponent {

    fun context(): Context

    fun application(): Application

    fun currencyExchangeRepo(): CurrencyExchangeRepo
}
