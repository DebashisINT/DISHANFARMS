package com.breezedishanfarm.features.location.shopRevisitStatus

import com.breezedishanfarm.features.location.shopdurationapi.ShopDurationApi
import com.breezedishanfarm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}