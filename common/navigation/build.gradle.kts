import dependencies.Dependencies
import ext.implementation

plugins {
    id("common.android-library")
    id("androidx.navigation.safeargs.kotlin")
}

dependencies {
    implementation(project(BuildModules.CORE))
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
}
