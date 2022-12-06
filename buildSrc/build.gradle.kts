plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

object PluginsVersions {
    const val GRADLE_ANDROID = "7.3.1"
    const val GRADLE_VERSIONS = "0.38.0"
    const val KOTLIN = "1.7.20"
    const val NAVIGATION = "2.5.0"
    const val GRAPH_GENERATOR = "0.5.0"
    const val DOKKA = "1.4.30"
    const val KTLINT = "11.0.0"
    const val SPOTLESS = "6.8.0"
    const val DETEKT = "1.21.0"
    const val HILT = "2.37"
    const val GOOGLE_SERVICES = "4.3.13"
    const val CRASHLYTICS_PLUGIN = "2.9.1"
    const val FIREBASE_PERF_MONITOR_PLUGIN = "1.4.1"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation("com.google.firebase:perf-plugin:${PluginsVersions.FIREBASE_PERF_MONITOR_PLUGIN}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${PluginsVersions.GRADLE_VERSIONS}") // update-dependencies.gradle.kts
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${PluginsVersions.KOTLIN}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${PluginsVersions.HILT}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginsVersions.NAVIGATION}")
    implementation("com.vanniktech:gradle-dependency-graph-generator-plugin:${PluginsVersions.GRAPH_GENERATOR}") // `generateDependencyGraph`
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${PluginsVersions.DOKKA}") // dokka.gradle.kts, `dokkaHtml`
    implementation("org.jlleitschuh.gradle:ktlint-gradle:${PluginsVersions.KTLINT}") // ktlint.gradle.kts, `ktlintCheck`, .circleci.yml, .editorconfig
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${PluginsVersions.SPOTLESS}") //spotless.gradle.kts, .circleci.yml
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.DETEKT}") //detekt.gradle.kts, .circleci.yml
    implementation("com.google.gms:google-services:${PluginsVersions.GOOGLE_SERVICES}") // google services plugin for firebase system
    implementation("com.google.firebase:firebase-crashlytics-gradle:${PluginsVersions.CRASHLYTICS_PLUGIN}")
}
