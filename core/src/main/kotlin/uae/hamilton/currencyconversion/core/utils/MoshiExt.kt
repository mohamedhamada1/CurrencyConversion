package ae.adres.dari.core.utils

import ae.adres.dari.core.remote.parser.ApplicationValidationResponseJsonAdapter
import ae.adres.dari.core.remote.parser.DateAndTime
import ae.adres.dari.core.remote.parser.DateAndTimeJasonAdapter
import ae.adres.dari.core.remote.parser.DateJasonAdapter
import ae.adres.dari.core.remote.response.ApplicationValidationResponse
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

fun getMoshiObject(): Moshi =
    Moshi.Builder()
        .add(Date::class.java, DateJasonAdapter().nullSafe())
        .add(DateAndTime::class.java, DateAndTimeJasonAdapter().nullSafe())
        .add(ApplicationValidationResponse::class.java, ApplicationValidationResponseJsonAdapter().nullSafe())
        .build()

inline fun <reified T> getMoshiAdapter(): JsonAdapter<T> =
    getMoshiObject().adapter(T::class.java)

inline fun <reified T> getMoshiListAdapter(): JsonAdapter<List<T>> =
    getMoshiObject().adapter(Types.newParameterizedType(List::class.java, T::class.java))
