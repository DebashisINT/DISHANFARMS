package com.breezedishanfarm.features.login.model.opportunitymodel

import com.breezedishanfarm.app.domain.OpportunityStatusEntity
import com.breezedishanfarm.app.domain.ProductListEntity
import com.breezedishanfarm.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}