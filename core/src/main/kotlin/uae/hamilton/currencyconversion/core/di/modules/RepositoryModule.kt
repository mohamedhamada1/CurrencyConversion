package uae.hamilton.currencyconversion.core.di.modules

import dagger.Binds
import dagger.Module
import uae.hamilton.currencyconversion.core.di.scopes.AppScope
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepo
import uae.hamilton.currencyconversion.core.repo.CurrencyExchangeRepoImpl

@Module
abstract class RepositoryModule {
    @AppScope
    @Binds
    abstract fun bindCurrencyExchangeRepo(repo: CurrencyExchangeRepoImpl): CurrencyExchangeRepo

}
