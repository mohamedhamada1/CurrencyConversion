package uk.endclothing.task.commons.ui.recyclerview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import uk.endclothing.task.commons.ui.extensions.isAr

class RecyclerViewHorizontalSpaceItemDecoration(
    private val horizontalSpacePx: Int,
    private val topBottomSpacePx: Int
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val pos = parent.getChildAdapterPosition(view)
        if (pos == RecyclerView.NO_POSITION) {
            return
        }

        outRect.top = topBottomSpacePx
        outRect.bottom = topBottomSpacePx

        val isAr = view.context.isAr
        when (pos) {
            0 -> {
                if (isAr) {
                    outRect.left = horizontalSpacePx / 2
                    outRect.right = horizontalSpacePx
                } else {
                    outRect.left = horizontalSpacePx
                    outRect.right = horizontalSpacePx / 2
                }
            }
            state.itemCount - 1 -> {
                if (isAr) {
                    outRect.right = horizontalSpacePx / 2
                    outRect.left = horizontalSpacePx
                } else {
                    outRect.right = horizontalSpacePx
                    outRect.left = horizontalSpacePx / 2
                }
            }
            else -> {
                val space = horizontalSpacePx / 2
                outRect.left = space
                outRect.right = space
            }
        }
    }
}
