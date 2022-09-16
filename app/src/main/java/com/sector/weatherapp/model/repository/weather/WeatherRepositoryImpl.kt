package com.sector.weatherapp.model.repository.weather

import com.sector.weatherapp.di.provider.DatabaseProvider
import com.sector.weatherapp.entity.db.WeatherData
import com.sector.weatherapp.model.data.network.WeatherApi
import com.sector.weatherapp.model.repository.weather.WeatherRepository
//import com.sector.weatherapp.entity.BaseNetworkRepository
import retrofit2.Response
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val databaseProvider: DatabaseProvider,
    private val weatherApi: WeatherApi
):  WeatherRepository {

    override suspend fun loadWeather(city: String): Response<WeatherData> =
        weatherApi.loadWeather(city)

}