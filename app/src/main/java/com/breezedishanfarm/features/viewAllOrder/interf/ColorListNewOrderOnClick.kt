package com.breezedishanfarm.features.viewAllOrder.interf

import com.breezedishanfarm.app.domain.NewOrderColorEntity
import com.breezedishanfarm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}