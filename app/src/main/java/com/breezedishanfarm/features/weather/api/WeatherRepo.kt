package com.breezedishanfarm.features.weather.api

import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.task.api.TaskApi
import com.breezedishanfarm.features.task.model.AddTaskInputModel
import com.breezedishanfarm.features.weather.model.ForeCastAPIResponse
import com.breezedishanfarm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}