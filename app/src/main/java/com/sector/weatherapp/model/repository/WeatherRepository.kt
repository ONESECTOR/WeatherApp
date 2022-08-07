package com.sector.weatherapp.model.repository

import com.sector.weatherapp.entity.db.WeatherData
import retrofit2.Response

interface WeatherRepository {
    // Room
    //suspend fun getLocation(): Location

    //suspend fun saveLocation(location: Location)

    // Network
    suspend fun loadWeather(): Response<WeatherData>
}