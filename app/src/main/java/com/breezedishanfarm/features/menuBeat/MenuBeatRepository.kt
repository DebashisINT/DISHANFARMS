package com.breezedishanfarm.features.menuBeat

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedishanfarm.app.FileUtils
import com.breezedishanfarm.app.Pref
import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.addshop.model.*
import com.breezedishanfarm.features.addshop.model.assigntopplist.AddShopUploadImg
import com.breezedishanfarm.features.addshop.model.assigntopplist.AddshopImageMultiReqbody1
import com.breezedishanfarm.features.addshop.presentation.ShopListSubmitResponse
import com.breezedishanfarm.features.addshop.presentation.multiContactRequestData
import com.breezedishanfarm.features.beatCustom.BeatGetStatusModel
import com.breezedishanfarm.features.dashboard.presentation.DashboardActivity
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by saheli on 16-12-2023.
 */
class MenuBeatRepository(val apiService: MenuBeatApi) {

    fun currentTabMenubeat(sessiontoken: String, user_id: String, beat_id: String): Observable<MenuBeatResponse> {
        return apiService.getCurrentTabData(user_id,sessiontoken,beat_id)
    }
    fun hirerchyTabMenubeat(sessiontoken: String, user_id: String): Observable<MenuBeatAreaRouteResponse> {
        return apiService.getHirerchyTabData(user_id,sessiontoken)
    }

}