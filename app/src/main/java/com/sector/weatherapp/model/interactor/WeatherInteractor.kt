package com.sector.weatherapp.model.interactor

import com.sector.weatherapp.entity.Weather
import com.sector.weatherapp.entity.db.WeatherData
import com.sector.weatherapp.model.repository.WeatherRepository
import javax.inject.Inject

class WeatherInteractor @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun loadWeather() = weatherRepository.loadWeather()

    suspend fun getWeather(): WeatherData = weatherRepository.getWeather()

}