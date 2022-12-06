package uae.hamilton.currencyconversion.core.local.convertor

import androidx.room.TypeConverter
import uae.hamilton.currencyconversion.core.utils.parseAs
import uae.hamilton.currencyconversion.core.utils.parseToMap
import java.util.Date

class DBTypeConvertor {

    @TypeConverter
    fun formJson(value: String?): List<Long>? {
        return value?.parseAs<List<Long>>()
    }

    @TypeConverter
    fun toJson(list: List<Long>?): String? {
        return list?.parseAs()
    }

    @TypeConverter
    fun formJson(list: List<String>?): String? {
        return list?.parseAs()
    }

    @TypeConverter
    fun toJson(value: String?): List<String>? {
        return value?.parseAs<List<String>>()
    }

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun stringToMap(value: String): Map<String, Double>? {
        return value.parseToMap()
    }

    @TypeConverter
    fun mapToString(value: Map<String, Double>?): String? {
        return value?.parseAs()
    }
}
