package uk.endclothing.task.commons.ui.livedata

import androidx.annotation.MainThread
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import java.util.concurrent.atomic.AtomicBoolean

/**
 * A lifecycle-aware observable that sends only new updates after subscription, used for events
 * like navigation and Snackbar messages.
 *
 * This avoids a common problem with events: on configuration change (like rotation) an update
 * can be emitted if the observer is active. This LiveData only calls the observable if there's an
 * explicit call to setValue() or call().
 *
 * Note that only one observer is going to be notified of changes.
 *
 * @see MutableLiveData
 */
class SingleLiveData<T> : MutableLiveData<T>() {

    private val pending = AtomicBoolean()
    private val observers = mutableMapOf<LifecycleOwner, Observer<in T>>()

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        observers[owner] = observer
        super.observe(
            owner, { t ->
                if (pending.compareAndSet(true, false)) {
                    observers.forEach {
                        if (it.key.lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED))
                            it.value.onChanged(t)
                    }
                }
            }
        )
    }

    @MainThread
    override fun setValue(value: T?) {
        pending.set(true)
        super.setValue(value)
    }
}
