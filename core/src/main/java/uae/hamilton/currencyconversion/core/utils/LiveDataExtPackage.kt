@file:Suppress("PackageDirectoryMismatch", "InvalidPackageDeclaration")

package androidx.lifecycle

val LiveData<*>.currentVersion: Int
    get() = this.version
