package uae.hamilton.exchangeconverter.features.exchangeconverter.exchangeconverter

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.transform

private const val SECOND_MILLI = 1000L

internal fun Int.countSecondsDown(): Flow<Int> =
    (this downTo 0).asFlow()
        .onEach { delay(SECOND_MILLI) }
        .conflate()
        .transform {
            emit(it)
        }