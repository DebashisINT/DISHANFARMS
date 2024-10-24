package com.breezedishanfarm.features.viewAllOrder.interf

import com.breezedishanfarm.app.domain.NewOrderGenderEntity
import com.breezedishanfarm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}