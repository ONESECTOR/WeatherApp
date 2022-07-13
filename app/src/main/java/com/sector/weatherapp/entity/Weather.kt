package com.sector.weatherapp.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "weather")
@Parcelize
data class Weather(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val city: String
): Parcelable