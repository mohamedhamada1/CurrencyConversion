import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.addTestsDependencies
import ext.applyCommonConfigs
import ext.applyCommonDefaultConfigConfigs
import ext.implementation

plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.KOTLIN_ALLOPEN)
    id(BuildPlugins.NAVIGATION_SAFE_ARGS)
    id(BuildPlugins.GRAPH_GENERATOR)
}

allOpen {
    annotation("com.example.com.modular.core.annotations.OpenClass")
}

android {
    applyCommonConfigs()

    buildToolsVersion = BuildAndroidConfig.BUILD_TOOLS_VERSION

    defaultConfig {
        applyCommonDefaultConfigConfigs()

        applicationId = BuildAndroidConfig.APPLICATION_ID
        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME
    }

    signingConfigs {
        create(BuildType.RELEASE) {
            storeFile = file("currency_conversion.jks")
            storePassword = "test21"
            keyAlias = "end"
            keyPassword = "test21"
            enableV2Signing = true
        }
    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            isTestCoverageEnabled = BuildTypeRelease.isTestCoverageEnabled
            signingConfig = signingConfigs.getByName(BuildType.RELEASE)
        }

        getByName(BuildType.DEBUG) {
            versionNameSuffix = BuildTypeDebug.versionNameSuffix
            isTestCoverageEnabled = BuildTypeDebug.isTestCoverageEnabled
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            signingConfig = signingConfigs.getByName(BuildType.RELEASE)
        }
    }

    flavorDimensions.add(BuildDimensions.ENVIRONMENT)
    productFlavors {
        FlavorDevelopment.appCreate(this)
        FlavorQA.appCreate(this)
        FlavorProduction.appCreate(this)
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation(project(BuildModules.CORE))
    implementation(project(BuildModules.Commons.NAVIGATION))
    implementation(project(BuildModules.Commons.UI))
    //=== Features ===
    // implementation(project(BuildModules.Features.CATALOG))
    //===============
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.TIMBER)
    implementation(Dependencies.MULTIDEX)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.MATERIAL)

    coreLibraryDesugaring(Dependencies.DESUGAR_JDK) // this is needed to use Java 8 time library

//    debugImplementation(DebugDependencies.LEAKCANARY)
    addTestsDependencies()

}
