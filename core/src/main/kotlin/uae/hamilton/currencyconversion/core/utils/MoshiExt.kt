package uae.hamilton.currencyconversion.core.utils

import uae.hamilton.currencyconversion.core.remote.parser.DateAndTime
import uae.hamilton.currencyconversion.core.remote.parser.DateAndTimeJasonAdapter
import uae.hamilton.currencyconversion.core.remote.parser.DateJasonAdapter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.util.Date

inline fun <reified T> String.parseAs(): T? =
    try {
        getMoshiAdapter<T>().fromJson(this)
    } catch (_: JsonDataException) {
        null
    }

inline fun <reified T> List<T>.parseAs(): String? =
    try {
        getMoshiListAdapter<T>()
            .toJson(this).toString()
    } catch (_: JsonDataException) {
        null
    }

inline fun <reified T> String.parseToList(): List<T>? =
    try {
        getMoshiListAdapter<T>().fromJson(this)
    } catch (_: JsonDataException) {
        null
    }

fun Map<String, Double>.parseAs(): String? =
    try {
        getMoshiAdapter<Map<String, Double>>()
            .toJson(this).toString()
    } catch (_: JsonDataException) {
        null
    }

fun String.parseToMap(): Map<String, Double>? =
    try {
        getMoshiAdapter<Map<String, Double>>().fromJson(this)
    } catch (_: JsonDataException) {
        null
    }

fun getMoshiObject(): Moshi =
    Moshi.Builder()
        .add(Date::class.java, DateJasonAdapter().nullSafe())
        .add(DateAndTime::class.java, DateAndTimeJasonAdapter().nullSafe())
        .build()

inline fun <reified T> getMoshiAdapter(): JsonAdapter<T> =
    getMoshiObject().adapter(T::class.java)

inline fun <reified T> getMoshiListAdapter(): JsonAdapter<List<T>> =
    getMoshiObject().adapter(Types.newParameterizedType(List::class.java, T::class.java))
