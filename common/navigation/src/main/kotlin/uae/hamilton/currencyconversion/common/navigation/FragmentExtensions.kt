package uae.hamilton.currencyconversion.common.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

const val IS_NAVIGATING_TO_DESTINATION_ARG = "is_nav_to_des_arg"

fun Fragment.popBackStack() {
    findNavController().popBackStack()
}

fun Fragment.navigate(direction: NavDirections) {
    safeNavigate(direction)
    setIsNavigatingArgument()
}


fun Fragment.onBackPressed() {
    requireActivity().onBackPressed()
}

private fun Fragment.safeNavigate(direction: NavDirections) {
    with(findNavController()) {
        val actionId = direction.actionId
        val action = currentDestination?.getAction(actionId) ?: graph.getAction(actionId)
        if (action != null) {
            navigate(direction)
        }
    }
}

fun Fragment.setIsNavigatingArgument() {
    arguments = Bundle().also { newBundle ->
        arguments?.let { newBundle.putAll(it) }
        newBundle.putBoolean(IS_NAVIGATING_TO_DESTINATION_ARG, true)
    }
}