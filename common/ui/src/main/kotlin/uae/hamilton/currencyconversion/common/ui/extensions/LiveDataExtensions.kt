package uk.endclothing.task.commons.ui.extensions

import uk.endclothing.task.commons.ui.livedata.SingleMediatorLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

fun <T> LiveData<T>.toSingleMediatorLiveData(
    onEvent: (T, MediatorLiveData<T>) -> Boolean
): LiveData<T> {
    val mediator = SingleMediatorLiveData<T>()

    mediator.addSource(this) { event ->
        if (onEvent(event, mediator).not()) {
            mediator.postValue(event)
        }
    }

    return mediator
}

fun <T> LiveData<T>.toSingleLiveData(): LiveData<T> =
    SingleMediatorLiveData<T>().also {
        it.addSource(this) { data ->
            it.value = data
        }
    }
