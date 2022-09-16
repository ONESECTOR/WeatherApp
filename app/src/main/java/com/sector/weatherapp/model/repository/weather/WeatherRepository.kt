package com.sector.weatherapp.model.repository.weather

import com.sector.weatherapp.entity.db.WeatherData
import retrofit2.Response

interface WeatherRepository {

    suspend fun loadWeather(city: String): Response<WeatherData>
}