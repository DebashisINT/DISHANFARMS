package com.breezedishanfarm.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedishanfarm.app.FileUtils
import com.breezedishanfarm.app.Pref
import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.addshop.model.AddLogReqData
import com.breezedishanfarm.features.addshop.model.AddShopRequestData
import com.breezedishanfarm.features.addshop.model.AddShopResponse
import com.breezedishanfarm.features.addshop.model.LogFileResponse
import com.breezedishanfarm.features.addshop.model.UpdateAddrReq
import com.breezedishanfarm.features.contacts.CallHisDtls
import com.breezedishanfarm.features.contacts.CompanyReqData
import com.breezedishanfarm.features.contacts.ContactMasterRes
import com.breezedishanfarm.features.contacts.SourceMasterRes
import com.breezedishanfarm.features.contacts.StageMasterRes
import com.breezedishanfarm.features.contacts.StatusMasterRes
import com.breezedishanfarm.features.contacts.TypeMasterRes
import com.breezedishanfarm.features.dashboard.presentation.DashboardActivity
import com.breezedishanfarm.features.login.model.WhatsappApiData
import com.breezedishanfarm.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}