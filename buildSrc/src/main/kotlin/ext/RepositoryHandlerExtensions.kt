package ext

import org.gradle.api.artifacts.dsl.RepositoryHandler

/**
 * Adds all default repositories used to access to the different declared dependencies
 */
fun RepositoryHandler.applyDefault() {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven { setUrl("https://jitpack.io")}
    maven { setUrl("https://maven.lokalise.co")}

}
