package uk.endclothing.task.commons.ui.livedata

import androidx.annotation.MainThread
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import java.util.concurrent.atomic.AtomicBoolean

/**
 * @see SingleLiveData
 */
class SingleMediatorLiveData<T> : MediatorLiveData<T>() {

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
