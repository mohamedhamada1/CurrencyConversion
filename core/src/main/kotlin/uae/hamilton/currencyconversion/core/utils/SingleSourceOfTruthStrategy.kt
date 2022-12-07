package uae.hamilton.currencyconversion.core.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import kotlinx.coroutines.Dispatchers
import uae.hamilton.currencyconversion.core.remote.Result

fun <T : Any, A : Any> resultLiveData(
    localCall: () -> LiveData<T>,
    networkCall: suspend () -> Result<A>,
    saveCallResult: suspend (A) -> Unit
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        val localSource = localCall().map { Result.success(it) }
        emitSource(localSource)

        when (val networkResult = networkCall()) {
            is Result.Success -> saveCallResult(networkResult.data)
            is Result.Error -> {
                emit(networkResult)
                emitSource(localSource)
            }
            else -> {}
        }
    }


fun <T : Any, A : Any> networkOnlyLiveData(
    networkCall: suspend () -> Result<A>,
    mapFun: suspend (A) -> T
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        when (val response = networkCall()) {
            is Result.Success -> emit(Result.success(mapFun(response.data)))
            is Result.Error -> emit(response)
            else -> {}
        }
    }
