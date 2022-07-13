package com.sector.weatherapp.di.module

import com.sector.weatherapp.model.interactor.WeatherInteractor
import com.sector.weatherapp.model.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class InteractorsModule {

    @Provides
    @Singleton
    fun provideInteractor(
        weatherRepository: WeatherRepository
    ): WeatherInteractor = WeatherInteractor(
        weatherRepository
    )
}