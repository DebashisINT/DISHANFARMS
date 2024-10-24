package com.breezedishanfarm.features.dashboard.presentation.api.dayStartEnd

import com.breezedishanfarm.features.stockCompetetorStock.api.AddCompStockApi
import com.breezedishanfarm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}