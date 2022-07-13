package com.sector.weatherapp.model.repository

import com.sector.weatherapp.entity.db.WeatherData
import retrofit2.Response

interface WeatherRepository {
    // Room
    suspend fun getWeather(): WeatherData

    // Network
    suspend fun loadWeather(): Response<WeatherData>
}