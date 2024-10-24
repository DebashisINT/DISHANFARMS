package com.breezedishanfarm.features.nearbyuserlist.api

import com.breezedishanfarm.app.Pref
import com.breezedishanfarm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezedishanfarm.features.newcollection.model.NewCollectionListResponseModel
import com.breezedishanfarm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}