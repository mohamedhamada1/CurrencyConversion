import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.addBoolean
import ext.addInt
import ext.addString
import ext.api
import ext.implementation
import ext.kapt

plugins {
    id("common.android-library")
}

android {
    productFlavors.forEach {
        it.addString(
            "BASE_URL",
            when (Flavor.flavor(it.name)) {
                Flavor.Development -> "https://gateway.dev.dari.ae/"
                Flavor.QA -> "https://gateway.qa.dari.ae/"
                Flavor.Production -> "https://api.dari.ae/"
            }
        )
        it.addBoolean(
            "IS_PROD",
            when (Flavor.flavor(it.name)) {
                Flavor.Development -> false
                Flavor.QA -> false
                Flavor.Production -> true
            }
        )
    }

    buildTypes.forEach {
        it.addBoolean("DATABASE_EXPORT_SCHEMA", true)
        it.addString("DATABASE_NAME", "currencyconversion-db")
        it.addInt("DATABASE_VERSION", 1)
        it.addString("APP_VERSION_NAME", BuildAndroidConfig.VERSION_NAME)
        it.addString("KEY_VALUE_DATABASE_NAME", "key-value-db")
    }

    defaultConfig {
        kapt {
            arguments { arg("room.schemaLocation", "$projectDir/dbSchemas") }
        }

        // this is needed to use Java 8 time library
        multiDexEnabled = true
    }

    sourceSets {
        getByName("test") {
            assets.srcDirs("$projectDir/dbSchemas")
        }
    }

    // this is needed to use Java 8 time library
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    api(Dependencies.ROOM)
    implementation(Dependencies.ROOM_KTX)
    implementation(Dependencies.LIFECYCLE_LIVE_DATA)
    implementation(Dependencies.PAGING)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    api(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_ADAPTERS)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.LOGGING)

    kapt(AnnotationProcessorsDependencies.ROOM)
    kapt(AnnotationProcessorsDependencies.MOSHI)

    coreLibraryDesugaring(Dependencies.DESUGAR_JDK) // this is needed to use Java 8 time library
}
