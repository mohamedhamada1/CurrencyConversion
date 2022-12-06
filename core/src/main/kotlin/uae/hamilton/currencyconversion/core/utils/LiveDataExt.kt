package ae.adres.dari.core.utils

import ae.adres.dari.core.remote.Result
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.currentVersion

object LiveDataResultSuccess : MutableLiveData<Result<Any>>() {
    init {
        value = Result.success(Any())
    }
}

class LiveDataResultSuccessInstance : MutableLiveData<Result<Any>>() {
    init {
        value = Result.success(Any())
    }
}

object LiveDataResultLoading : MutableLiveData<Result<Any>>() {
    init {
        value = Result.Loading
    }
}

object LiveDataResultError : MutableLiveData<Result<Any>>() {
    init {
        value = Result.error()
    }
}

fun <T> LiveData<List<T>>.first(): LiveData<T> =
    MediatorLiveData<T>().also { mediator ->
        mediator.addSource(this) { list ->
            list.takeIf { it.isNotEmpty() }?.let { mediator.postValue(it.first()) }
        }
    }

fun <T> LiveData<T>.filter(predicate: (T) -> Boolean): LiveData<T> =
    MediatorLiveData<T>().also { mediator ->
        mediator.addSource(this) {
            if (predicate(it))
                mediator.postValue(it)
        }
    }

fun <T, K, R> LiveData<T>.join(
    other: LiveData<K>,
    joinFun: (T, K) -> R
): LiveData<R> {
    return MediatorLiveData<R>().also { mediator ->
        var emittedT: T? = null
        var emittedK: K? = null

        fun checkAndEmit() {
            if (emittedT != null && emittedK != null) {
                mediator.value = joinFun(emittedT!!, emittedK!!)
            }
        }

        mediator.addSource(this) {
            emittedT = it
            checkAndEmit()
        }
        mediator.addSource(other) {
            emittedK = it
            checkAndEmit()
        }
    }
}

fun <T, K, R> LiveData<T>.zip(
    other: LiveData<K>,
    joinFun: (T, K) -> R
): LiveData<R> {
    return MediatorLiveData<R>().also { mediator ->
        var emittedT: T? = null
        var emittedK: K? = null

        fun checkAndEmit() {
            if (emittedT != null && emittedK != null) {
                mediator.value = joinFun(emittedT!!, emittedK!!)
                emittedT = null
                emittedK = null
            }
        }

        mediator.addSource(this) {
            emittedT = it
            checkAndEmit()
        }
        mediator.addSource(other) {
            emittedK = it
            checkAndEmit()
        }
    }
}

fun <T, K, R> LiveData<T>.any(
    other: LiveData<K>,
    joinFun: (T?, K?) -> R
): LiveData<R> {
    return MediatorLiveData<R>().also { mediator ->
        var emittedT: T? = null
        var emittedK: K? = null

        fun checkAndEmit() {
            if (emittedT != null || emittedK != null) {
                mediator.value = joinFun(emittedT, emittedK)
            }
        }

        mediator.addSource(this) {
            emittedT = it
            checkAndEmit()
        }
        mediator.addSource(other) {
            emittedK = it
            checkAndEmit()
        }
    }
}

/**
 * Will only emit data if [Result] is [Result.Success]
 */
fun <T : Any> LiveData<Result<T>>.data(): LiveData<T> {
    val mediator = MediatorLiveData<T>()

    mediator.addSource(this) {
        if (it is Result.Success) {
            mediator.postValue(it.data)
        }
    }

    return mediator
}

fun <T : Any> LiveData<Result<T>>.ignoreError(): LiveData<Result<Any>> {
    val mediator = MediatorLiveData<Result<Any>>()

    mediator.addSource(this) {
        when (it) {
            is Result.Error -> mediator.postValue(Result.success(Any()))
            else -> mediator.postValue(it)
        }
    }

    return mediator
}

fun <T> LiveData<T>.once(): LiveData<T> {
    val mediator = MediatorLiveData<T>()

    mediator.addSource(this) {
        mediator.postValue(it)
        mediator.removeSource(this)
    }

    return mediator
}

fun <T> LiveData<T?>.filterNotNull(): LiveData<T> {
    val mediator = MediatorLiveData<T>()

    mediator.addSource(this) {
        if (it != null) {
            mediator.postValue(it)
        }
    }

    return mediator
}

fun <T> LiveData<T>.unique(): LiveData<T> =
    unique { old, new ->
        new != null && old != new
    }

fun <T> LiveData<T>.unique(predicate: (old: T?, new: T) -> Boolean): LiveData<T> {
    val mediator = MediatorLiveData<T>()
    var cached: T? = value

    mediator.addSource(this) {
        if (predicate(cached, it)) {
            cached = it
            mediator.postValue(it)
        }
    }

    return mediator
}

fun <T> T.asLiveData(): LiveData<T> =
    MutableLiveData<T>().also {
        it.value = this
    }

fun <T> cached(): MutableLiveData<T> {
    return object : MutableLiveData<T>() {
        private val cachedValues = mutableListOf<T>()

        override fun setValue(value: T) {
            if (hasActiveObservers())
                super.setValue(value)
            else cachedValues.add(value)
        }

        override fun onActive() {
            cachedValues.forEach {
                setValue(it)
            }
            cachedValues.clear()
            super.onActive()
        }
    }
}

fun <T : Any, Y : Any> LiveData<Result<T>>.switchMapOnSuccess(other: (T) -> LiveData<Result<Y>>): LiveData<Result<Y>> =
    MediatorLiveData<Result<Y>>().also { mediator ->
        mediator.addSource(this) { thisResult ->
            when (thisResult) {
                is Result.Success -> {
                    mediator.removeSource(this)
                    mediator.addSource(other(thisResult.data)) { otherResult ->
                        mediator.postValue(otherResult)
                    }
                }

                is Result.Error -> mediator.postValue(thisResult.copy())
                Result.Loading -> mediator.postValue(Result.Loading)
            }
        }
    }

fun <T> LiveData<T>.ignoreOldData(): LiveData<T> {
    val mediator = MediatorLiveData<T>()
    var latestVersion = currentVersion

    mediator.addSource(this) {
        if (currentVersion > latestVersion) {
            mediator.postValue(it)
            latestVersion = currentVersion
        }
    }

    return mediator
}

fun <T : Any> LiveData<Result<T>>.doOnSuccess(action: (T) -> Unit): LiveData<Result<T>> =
    MediatorLiveData<Result<T>>().also { mediator ->
        mediator.addSource(this) { thisResult ->
            when (thisResult) {
                is Result.Success -> {
                    mediator.postValue(thisResult)
                    action(thisResult.data)
                }
                is Result.Error -> mediator.postValue(thisResult.copy())
                Result.Loading -> mediator.postValue(Result.Loading)
            }
        }
    }
