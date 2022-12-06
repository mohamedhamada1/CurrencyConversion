package uk.endclothing.task.commons.ui.extensions

import uk.endclothing.task.core.utils.CoreComponentProvider
import android.app.Activity
import android.content.Intent
import uk.endclothing.task.core.di.CoreComponent


val Activity.coreComponent: CoreComponent
    get() = (application as CoreComponentProvider).provideCoreComponent()


fun Activity.restart() {
    val className = this::class.qualifiedName ?: return
    startActivity(Intent().setClassName(packageName, className))
    finish()
}
