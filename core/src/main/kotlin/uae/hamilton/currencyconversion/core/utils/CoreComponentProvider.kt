package ae.adres.dari.core.utils

import ae.adres.dari.core.di.CoreComponent

interface CoreComponentProvider {

    fun provideCoreComponent(): CoreComponent
}
