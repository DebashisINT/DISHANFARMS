package com.breezedishanfarm.features.location.api

import com.breezedishanfarm.features.location.shopdurationapi.ShopDurationApi
import com.breezedishanfarm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}