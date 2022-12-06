package plugins

import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintPlugin
import utils.getUpdatedFilesCommaSeparated

apply<KtlintPlugin>()

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    android.set(true)
    filter {
        includes.clear()
        include(project.getUpdatedFilesCommaSeparated())
        exclude("**/generated/**", "**/build/**", "ae/adres/dari/core/local/migrations/DariDatabaseMigrations.kt")
    }
}
