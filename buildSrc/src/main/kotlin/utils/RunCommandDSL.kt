package utils


import org.apache.commons.io.output.ByteArrayOutputStream
import org.gradle.api.Project
import java.io.File


fun Project.runCommand(command: String, currentWorkingDir: File = file("./")): String {
    val byteOut = ByteArrayOutputStream()

    exec {
        workingDir = currentWorkingDir
        commandLine = command.split("\\s".toRegex())
        standardOutput = byteOut
    }

    return String(byteOut.toByteArray()).trim()
}

fun Project.getUpdatedFilesCommaSeparated(): Iterable<String> {
    runCommand("git add --all")
    return runCommand("git diff --staged --name-only")
        .trim()
        .split("\n")
        .asSequence()
        .map { it.split("kotlin/") }
        .filter { it.size >= 2 && (it[1].endsWith(".kt") || it[1].endsWith(".kts")) }
        .map {
            "**/${it[1]}"
        }.asIterable()
}
