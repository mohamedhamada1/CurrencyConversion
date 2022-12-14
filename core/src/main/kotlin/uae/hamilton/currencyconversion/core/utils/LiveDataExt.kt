package uae.hamilton.currencyconversion.core.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.currentVersion
import uae.hamilton.currencyconversion.core.remote.Result

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


