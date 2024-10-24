package com.breezedishanfarm.features.stockAddCurrentStock.api

import com.breezedishanfarm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedishanfarm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}