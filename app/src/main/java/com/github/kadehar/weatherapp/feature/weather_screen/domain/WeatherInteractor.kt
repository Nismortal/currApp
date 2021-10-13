package com.github.kadehar.weatherapp.feature.weather_screen.domain

import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherRepository

class WeatherInteractor(private val repository: WeatherRepository) {

    suspend fun getWeather() : String {

        return repository.getWeather()

    }
}