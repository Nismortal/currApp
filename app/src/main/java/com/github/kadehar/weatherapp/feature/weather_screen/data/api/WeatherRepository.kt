package com.github.kadehar.weatherapp.feature.weather_screen.data.api

interface WeatherRepository {
    suspend fun getWeather() : String
}