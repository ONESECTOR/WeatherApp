package com.sector.weatherapp.entity.db

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
@JsonClass(generateAdapter = true)
class WeatherData(
    @Json(name = "location")
    val location: Location
): Parcelable

@Keep
@Entity
@Parcelize
@JsonClass(generateAdapter = true)
class Location(
    @PrimaryKey
    @Json(name = "id")
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @Json(name = "name")
    @ColumnInfo(name = "name")
    val name: String
): Parcelable