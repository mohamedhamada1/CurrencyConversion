package uae.hamilton.currencyconversion.core.utils

import uae.hamilton.currencyconversion.core.remote.Result
import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataScope
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.withContext

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

fun <T : Any, A : Any> resultFlow(
    localCall: () -> Flow<T>,
    networkCall: suspend () -> Result<A>,
    saveCallResult: suspend (A) -> Unit
): Flow<Result<T>> =
    merge(
        flowOf(Result.loading()),
        localCall().map {
            Result.success(it)
        },
        flow {
            when (val networkResult = networkCall()) {
                is Result.Success -> saveCallResult(networkResult.data)
                is Result.Error -> emit(networkResult)
                Result.Loading -> {}
            }
        }
    ).flowOn(Dispatchers.IO)

fun <T : Any, A : Any> networkOnlyFlow(
    networkCall: suspend () -> Result<A>,
    mapFun: suspend (A) -> T
): Flow<Result<T>> =
    flow {
        emit(Result.loading())
        when (val networkResult = networkCall()) {
            is Result.Success -> emit(Result.success(mapFun(networkResult.data)))
            is Result.Error -> emit(networkResult)
            Result.Loading -> {}
        }
    }.flowOn(Dispatchers.IO)

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

suspend fun <T : Any, A : Any> networkOnlySuspend(
    networkCall: suspend () -> Result<A>,
    mapFun: suspend (A) -> T
): Result<T> = withContext(Dispatchers.IO) {
    when (val response = networkCall()) {
        is Result.Success -> Result.success(mapFun(response.data))
        is Result.Error -> response.copy()
        else -> Result.loading()
    }
}

fun <T : Any, A : Any> mediatorLivedata(
    localCall: () -> LiveData<T>,
    networkCall: suspend () -> Result<A>,
    callback: suspend (A, LiveDataScope<Result<T>>) -> Unit
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        val localSource = localCall().map { Result.success(it) }
        emitSource(localSource)

        when (val networkResponse = networkCall()) {
            is Result.Success -> callback(networkResponse.data, this)
            is Result.Error -> {
                emit(networkResponse)
                emitSource(localSource)
            }
            else -> {}
        }
    }
