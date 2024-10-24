package com.breezedishanfarm.features.viewAllOrder.interf

import com.breezedishanfarm.app.domain.NewOrderGenderEntity
import com.breezedishanfarm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}