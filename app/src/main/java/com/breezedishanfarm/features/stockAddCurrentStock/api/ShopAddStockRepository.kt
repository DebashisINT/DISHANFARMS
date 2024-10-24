package com.breezedishanfarm.features.stockAddCurrentStock.api

import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.location.model.ShopRevisitStatusRequest
import com.breezedishanfarm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedishanfarm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezedishanfarm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezedishanfarm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}