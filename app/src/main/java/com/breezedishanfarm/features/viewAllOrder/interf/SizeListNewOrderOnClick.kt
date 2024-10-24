package com.breezedishanfarm.features.viewAllOrder.interf

import com.breezedishanfarm.app.domain.NewOrderProductEntity
import com.breezedishanfarm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}