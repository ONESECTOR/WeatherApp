package com.sector.weatherapp.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sector.weatherapp.entity.db.Location
import com.sector.weatherapp.entity.db.WeatherData

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveLocation(location: Location)

    @Query("SELECT * FROM Location WHERE id = 0")
    suspend fun getLocation(): Location
}