package com.sector.weatherapp.model

import androidx.room.Dao
import androidx.room.Query
import com.sector.weatherapp.entity.db.WeatherData

@Dao
interface WeatherDao {

    @Query("SELECT * FROM Location")
    suspend fun getWeather(): WeatherData
}