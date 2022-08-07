package com.sector.weatherapp.model.interactor

import com.sector.weatherapp.entity.db.WeatherData
import com.sector.weatherapp.model.repository.WeatherRepository
import retrofit2.Response
import javax.inject.Inject

class WeatherInteractor @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun loadWeather(): Response<WeatherData> = weatherRepository.loadWeather()

    /*suspend fun saveWeather(weather: WeatherData) = with(weather) {
        weatherRepository.saveLocation(weather.location)
    }*/
}