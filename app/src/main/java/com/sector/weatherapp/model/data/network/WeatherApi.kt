package com.sector.weatherapp.model.data.network

import com.sector.weatherapp.entity.db.WeatherData
import retrofit2.Response
import retrofit2.http.*

interface WeatherApi {

    companion object {
        const val API_PATH = "/v1/current.json?key="
        const val API_KEY = "25d056d1828e4517b77151353221307"
    }

    @GET("$API_PATH$API_KEY&aqi=no")
    suspend fun loadWeather(
        @Query(value = "q") city: String
    ): Response<WeatherData>
}