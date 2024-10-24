package com.breezedishanfarm.features.orderList.model

import com.breezedishanfarm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}