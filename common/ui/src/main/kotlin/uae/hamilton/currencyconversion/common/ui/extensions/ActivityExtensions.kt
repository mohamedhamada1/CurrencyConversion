package uae.hamilton.currencyconversion.common.ui.extensions

import uae.hamilton.currencyconversion.core.utils.CoreComponentProvider
import android.app.Activity
import android.content.Intent
import android.graphics.Point
import android.os.Build
import android.util.DisplayMetrics
import uae.hamilton.currencyconversion.core.di.CoreComponent


val Activity.coreComponent: CoreComponent
    get() = (application as CoreComponentProvider).provideCoreComponent()


val Activity.screenDimensions: Point
    get() = Point().apply {
        val metrics = displayMetrics
        x = metrics.widthPixels
        y = metrics.heightPixels
    }
val Activity.displayMetrics: DisplayMetrics
    get() {
        val displayMetrics = DisplayMetrics()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            display?.apply {
                getRealMetrics(displayMetrics)
            }
        } else {
            windowManager?.defaultDisplay?.getMetrics(displayMetrics)
        }
        return displayMetrics
    }