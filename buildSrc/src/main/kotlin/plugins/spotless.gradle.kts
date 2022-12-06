package plugins

import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessPlugin
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import utils.getUpdatedFilesCommaSeparated

apply<SpotlessPlugin>()

@Suppress("INACCESSIBLE_TYPE")
configure<SpotlessExtension> {
    format("misc") {
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to listOf("**/*.md", "**/.gitignore", "**/*.yaml", "**/*.yml"),
                    "exclude" to listOf(
                        ".gradle/**",
                        ".gradle-cache/**",
                        "**/tools/**",
                        "**/build/**"
                    )
                )
            )
        )
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    format("xml") {
        target("**/res/**/*.xml")
        indentWithSpaces(4)
        trimTrailingWhitespace()
        endWithNewline()
    }

    val updatedFiles = project.getUpdatedFilesCommaSeparated().toList()
    val changedKt = updatedFiles.filter { it.endsWith(".kt") }.takeIf { it.isNotEmpty() } ?: listOf("**/*kt")
    val changedKts = updatedFiles.filter { it.endsWith(".kts") }.takeIf { it.isNotEmpty() } ?: listOf("**/*kts")

    kotlin {
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to changedKt,
                    "exclude" to listOf("**/build/**", "**/buildSrc/**", "**/generated/**")
                )
            )
        )
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    kotlinGradle {
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to changedKts,
                    "exclude" to listOf("**/build/**")
                )
            )
        )
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }
}
