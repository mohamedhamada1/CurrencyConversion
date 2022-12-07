package uae.hamilton.currencyconversion

import android.app.Application
import timber.log.Timber
import uae.hamilton.currencyconversion.core.di.CoreComponent
import uae.hamilton.currencyconversion.core.di.DaggerCoreComponent
import uae.hamilton.currencyconversion.core.di.modules.ContextModule
import uae.hamilton.currencyconversion.core.utils.CoreComponentProvider

class MyApplication : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent = coreComponent


    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        coreComponent = initCoreDependencyInjection()
    }

    private fun initCoreDependencyInjection(): CoreComponent {
        return DaggerCoreComponent.builder()
            .contextModule(ContextModule(this))
            .build()
    }
}