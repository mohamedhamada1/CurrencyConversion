package plugins

import org.gradle.kotlin.dsl.apply
import org.jetbrains.dokka.gradle.DokkaPlugin
import org.jetbrains.dokka.gradle.DokkaTask

apply<DokkaPlugin>()

tasks {
    withType<DokkaTask>().configureEach {
        outputDirectory.set(buildDir.resolve("docs"))
        moduleName.set(project.parent?.let { parentProject ->
            if (parentProject.name == rootProject.name) {
                project.name
            } else {
                "${parentProject.name}/${project.name}"
            }
        } ?: run {
            project.name
        })
    }
}
