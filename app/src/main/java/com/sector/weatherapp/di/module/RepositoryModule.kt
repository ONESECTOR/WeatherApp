package com.sector.weatherapp.di.module

import com.sector.weatherapp.di.provider.DatabaseProvider
import com.sector.weatherapp.model.data.network.WeatherApi
import com.sector.weatherapp.model.repository.WeatherRepository
import com.sector.weatherapp.model.repository.WeatherRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(
        weatherApi: WeatherApi,
        databaseProvider: DatabaseProvider
    ): WeatherRepository =
        WeatherRepositoryImpl(
            databaseProvider = databaseProvider,
            weatherApi = weatherApi
        )
}