package uk.endclothing.task.commons.ui.extensions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.os.ConfigurationCompat


fun Context.getColorCompat(@ColorRes color: Int) =
    ContextCompat.getColor(this, color)
val Context.isAr: Boolean
    get() = resources?.let {
        ConfigurationCompat.getLocales(it.configuration)
            .get(0).language.contains("ar")
    } ?: false