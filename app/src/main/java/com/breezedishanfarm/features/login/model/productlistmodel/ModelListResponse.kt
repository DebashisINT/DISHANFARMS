package com.breezedishanfarm.features.login.model.productlistmodel

import com.breezedishanfarm.app.domain.ModelEntity
import com.breezedishanfarm.app.domain.ProductListEntity
import com.breezedishanfarm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}