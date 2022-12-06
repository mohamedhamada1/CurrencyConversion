package plugins

import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import utils.getUpdatedFilesCommaSeparated

apply<DetektPlugin>()

configure<DetektExtension> {
    source = project.files("src/main/kotlin")
    config = files("$rootDir/.detekt/config.yml")
    parallel = true
    tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
        includes.clear()
        include(project.getUpdatedFilesCommaSeparated())
        reports {
            with(html) {
                required.set(true)
                outputLocation.set(file("build/reports/detekt/report.html"))
            }

            with(xml) {
                required.set(true)
                outputLocation.set(file("build/reports/detekt/report.xml"))
            }
        }
    }
}
