package uae.hamilton.currencyconversion.core.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import uae.hamilton.currencyconversion.core.local.entity.Currency

@Dao
interface CurrencyDao {

    @Query("SELECT * FROM currency")
    suspend fun getAll(): List<Currency>

    @Query("SELECT * FROM currency")
    fun getAllLiveData(): LiveData<List<Currency>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(currency: Currency)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(currency: List<Currency>)

    @Query("DELETE FROM currency")
    suspend fun deleteAll()
}
