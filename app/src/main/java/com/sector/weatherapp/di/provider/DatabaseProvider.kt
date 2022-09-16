package com.sector.weatherapp.di.provider

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sector.weatherapp.entity.db.Location
import com.sector.weatherapp.model.dao.WeatherDao

@Database(
    entities = [
        Location::class
    ],
    version = 7,
    exportSchema = false
)
abstract class DatabaseProvider: RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "weatherapp.db"
    }

    abstract fun weatherDao(): WeatherDao
}