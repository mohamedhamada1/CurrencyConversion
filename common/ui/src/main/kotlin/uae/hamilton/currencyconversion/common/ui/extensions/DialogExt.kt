package uae.hamilton.currencyconversion.common.ui.extensions

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

fun DialogFragment.showSafely(fragmentManger: FragmentManager) {
    if (fragmentManger.isStateSaved.not()) {
        show(fragmentManger, tag)
    }
}
