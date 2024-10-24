package com.breezedishanfarm.features.weather.api

import com.breezedishanfarm.features.task.api.TaskApi
import com.breezedishanfarm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}