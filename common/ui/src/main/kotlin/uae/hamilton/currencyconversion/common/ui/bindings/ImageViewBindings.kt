package uk.endclothing.task.commons.ui.bindings

import uk.endclothing.task.commons.ui.extensions.getColorCompat
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import coil.Coil
import coil.load
import coil.request.ImageRequest
import coil.target.PoolableViewTarget
import coil.transform.CircleCropTransformation
import uk.endclothing.task.commons.ui.R

@BindingAdapter("imageUrl", "imagePlaceholder", "imageFail", "isCircle", requireAll = false)
fun ImageView.imageUrl(
    url: String?,
    placeholder: Drawable? = null,
    fallback: Drawable? = null,
    isCircle: Boolean = false
) {
    load(url?.takeIf { it.isNotBlank() }) {
        crossfade(true)

        placeholder(placeholder ?: run { ColorDrawable(context.getColorCompat(R.color.image_placeholder)) })

        fallback(fallback ?: run { ColorDrawable(context.getColorCompat(R.color.image_placeholder)) })

        if (isCircle) {
            transformations(CircleCropTransformation())
        }
    }
}

// to handle string resource like R.drawable.ic_icon
@BindingAdapter("loadIntResource")
fun ImageView.loadIntResource(@DrawableRes res: Int) {
    setImageResource(res)
}

@BindingAdapter("tintColorResource")
fun ImageView.tintColor(color: Int) {
    setColorFilter(color)
}

fun ImageView.loadImageAsBitmap(
    url: String,
    onLoaded: (Bitmap?) -> Unit,
    onClear: () -> Unit
) {
    val request = ImageRequest.Builder(context)
        .data(url)
        .target(object : PoolableViewTarget<ImageView> {
            override val view: ImageView
                get() = this@loadImageAsBitmap

            override fun onClear() {
                view.setImageDrawable(null)
                onClear()
            }

            override fun onSuccess(result: Drawable) {
                super.onSuccess(result)
                onLoaded((result as? BitmapDrawable)?.bitmap)
            }
        }).build()
    Coil.imageLoader(context).enqueue(request)
}
