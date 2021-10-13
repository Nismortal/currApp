package com.github.kadehar.weatherapp.feature.weather_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.kadehar.weatherapp.feature.weather_screen.domain.WeatherInteractor
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val interactor: WeatherInteractor) : ViewModel() {

    val livedata : MutableLiveData<String> = MutableLiveData("")

    fun requestWeather() {
        viewModelScope.launch {
            livedata.postValue(interactor.getWeather())


        }

    }

}