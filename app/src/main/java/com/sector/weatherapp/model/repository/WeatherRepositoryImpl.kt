package com.sector.weatherapp.model.repository

import com.sector.weatherapp.di.provider.DatabaseProvider
import com.sector.weatherapp.entity.Weather
import com.sector.weatherapp.entity.db.WeatherData
import com.sector.weatherapp.model.data.network.WeatherApi
import retrofit2.Response
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val databaseProvider: DatabaseProvider,
    private val weatherApi: WeatherApi
): WeatherRepository {

    override suspend fun getWeather(): WeatherData =
        databaseProvider.weatherDao().getWeather()

    override suspend fun loadWeather(): Response<WeatherData> =
        weatherApi.getWeatherApi()

}