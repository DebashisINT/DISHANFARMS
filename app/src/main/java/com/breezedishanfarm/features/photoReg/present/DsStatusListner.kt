package com.breezedishanfarm.features.photoReg.present

import com.breezedishanfarm.app.domain.ProspectEntity
import com.breezedishanfarm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}