package com.sector.weatherapp.di.module

import androidx.room.Room
import com.sector.weatherapp.di.provider.DatabaseProvider
import com.sector.weatherapp.presentation.App
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provide(app: App): DatabaseProvider {
        return Room
            .databaseBuilder(
                app,
                DatabaseProvider::class.java,
                DatabaseProvider.DATABASE_NAME
            )
            .fallbackToDestructiveMigration()
            .build()
    }
}