package uk.endclothing.task.commons.navigation


import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

const val IS_NAVIGATING_TO_DESTINATION_ARG = "is_nav_to_des_arg"



fun Fragment.popBackStack() {
    findNavController().popBackStack()
}
