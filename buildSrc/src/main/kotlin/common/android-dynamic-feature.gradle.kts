package common

import BuildModules
import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.addTestsDependencies
import ext.implementation
import ext.kapt

// because all `plugins` clauses are executed first by gradle plugin, we have to use static strings, which sucks
plugins {
    id("common.android-library")
    id("androidx.navigation.safeargs.kotlin")
}

dependencies {
    implementation(project(BuildModules.CORE))
    implementation(project(BuildModules.Commons.UI))
    implementation(project(BuildModules.Commons.NAVIGATION))
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.LIFECYCLE_LIVE_DATA)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.MULTIDEX)
    implementation(Dependencies.ANDROID_SDP)
    implementation(Dependencies.PERMISSION_DISPATCHER)
    implementation(Dependencies.GOOGLE_TAG_MANAGER)

    kapt(AnnotationProcessorsDependencies.ROOM)
}
