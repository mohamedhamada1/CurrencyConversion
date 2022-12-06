package uk.endclothing.task.commons.ui.extensions


import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import uk.endclothing.task.core.di.CoreComponent


@Suppress("UNCHECKED_CAST")
inline fun <reified VM : ViewModel> Fragment.viewModel(
    crossinline factory: () -> VM
): VM {
    val viewModelProviderFactory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return factory() as T
        }
    }

    return ViewModelProvider(this, viewModelProviderFactory)[VM::class.java]
}

val Fragment.coreComponent: CoreComponent
    get() = requireActivity().coreComponent



val Fragment.actualParentFragment: Fragment?
    get() {
        var parent: Fragment? = parentFragment
        while (parent != null && parent is NavHostFragment) {
            parent = parent.parentFragment
        }
        return parent
    }




