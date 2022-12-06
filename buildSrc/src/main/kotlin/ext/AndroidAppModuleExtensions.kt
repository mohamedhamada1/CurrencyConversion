package ext

import BuildAndroidConfig
import com.android.build.api.dsl.ApplicationDefaultConfig
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import java.io.File


fun BaseAppModuleExtension.applyCommonConfigs() {
    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
        getByName("androidTest") {
            java.srcDir("src/androidTest/kotlin")
        }
    }

    lint {
        checkDependencies = false
        checkAllWarnings = false
        warningsAsErrors = false
        lintConfig = File("lint.xml")
        disable.add("MissingTranslation")
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

fun ApplicationDefaultConfig.applyCommonDefaultConfigConfigs() {
    minSdk = BuildAndroidConfig.MIN_SDK_VERSION
    targetSdk = BuildAndroidConfig.TARGET_SDK_VERSION

    vectorDrawables.useSupportLibrary = BuildAndroidConfig.SUPPORT_LIBRARY_VECTOR_DRAWABLES

    testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    testInstrumentationRunnerArguments.putAll(BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER_ARGUMENTS)

    multiDexEnabled = true
}
