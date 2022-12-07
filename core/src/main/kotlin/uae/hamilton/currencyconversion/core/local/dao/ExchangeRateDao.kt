package uae.hamilton.currencyconversion.core.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import uae.hamilton.currencyconversion.core.local.entity.ExchangeRate

@Dao
interface ExchangeRateDao {

    @Query("SELECT * FROM exchange_rate WHERE baseCode = :currency")
    suspend fun getAllExchangeRateByCurrency(currency: String): ExchangeRate?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(exchangeRate: ExchangeRate)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(exchangeRate: List<ExchangeRate>)

    @Query("DELETE FROM exchange_rate")
    suspend fun deleteAll()
}
