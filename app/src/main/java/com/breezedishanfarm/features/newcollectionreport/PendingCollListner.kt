package com.breezedishanfarm.features.newcollectionreport

import com.breezedishanfarm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}