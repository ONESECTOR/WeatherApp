package com.sector.weatherapp.entity.db

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
@JsonClass(generateAdapter = true)
class WeatherData(
    //val current: Current,

    @Json(name = "location")
    val location: Location
): Parcelable

/*@Keep
@Parcelize
@Entity
@JsonClass(generateAdapter = true)
class Current(
    val cloud: Int,
    val condition: Condition,
    val feelslike_c: Double,
    val feelslike_f: Double,
    val gust_kph: Double,
    val gust_mph: Double,
    val humidity: Int,
    val is_day: Int,
    val last_updated: String,
    val last_updated_epoch: Int,
    val precip_in: Double,
    val precip_mm: Double,
    val pressure_in: Double,
    val pressure_mb: Double,
    val temp_c: Double,
    val temp_f: Double,
    val uv: Double,
    val vis_km: Double,
    val vis_miles: Double,
    val wind_degree: Int,
    val wind_dir: String,
    val wind_kph: Double,
    val wind_mph: Double
): Parcelable*/

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
    val name: String,

    /*@Json(name = "region")
    @ColumnInfo(name = "region")
    val region: String,

    @Json(name = "country")
    @ColumnInfo(name = "country")
    val country: String,

    @Json(name = "lat")
    @ColumnInfo(name = "lat")
    val lat: Double,

    @Json(name = "lon")
    @ColumnInfo(name = "lon")
    val lon: Double,

    @Json(name = "tz_id")
    @ColumnInfo(name = "tzId")
    val tzId: String,

    @Json(name = "localtime_epoch")
    @ColumnInfo(name = "localtimeEpoch")
    val localtimeEpoch: Int,

    @Json(name = "localtime")
    @ColumnInfo(name = "localtime")
    val localtime: String,*/
): Parcelable

/*
@Keep
@Parcelize
@Entity
@JsonClass(generateAdapter = true)
class Condition(
    val code: Int,
    val icon: String,
    val text: String
): Parcelable*/
