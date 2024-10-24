package com.breezedishanfarm.features.viewAllOrder.orderOptimized

import com.breezedishanfarm.app.domain.ProductOnlineRateTempEntity
import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}