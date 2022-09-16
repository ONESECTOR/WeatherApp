package com.sector.weatherapp.model.dao

import androidx.room.Dao
import androidx.room.Query
import com.sector.weatherapp.entity.db.Location

@Dao
interface WeatherDao {

    /*@Query("SELECT * FROM Location WHERE id = 0")
    suspend fun getLocation(): Location*/
}