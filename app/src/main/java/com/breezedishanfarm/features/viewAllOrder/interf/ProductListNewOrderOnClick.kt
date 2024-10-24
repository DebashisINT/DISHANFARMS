package com.breezedishanfarm.features.viewAllOrder.interf

import com.breezedishanfarm.app.domain.NewOrderGenderEntity
import com.breezedishanfarm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}