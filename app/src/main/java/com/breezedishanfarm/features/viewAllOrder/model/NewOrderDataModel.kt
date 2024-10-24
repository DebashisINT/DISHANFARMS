package com.breezedishanfarm.features.viewAllOrder.model

import com.breezedishanfarm.app.domain.NewOrderColorEntity
import com.breezedishanfarm.app.domain.NewOrderGenderEntity
import com.breezedishanfarm.app.domain.NewOrderProductEntity
import com.breezedishanfarm.app.domain.NewOrderSizeEntity
import com.breezedishanfarm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

