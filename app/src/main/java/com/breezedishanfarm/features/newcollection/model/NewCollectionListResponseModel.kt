package com.breezedishanfarm.features.newcollection.model

import com.breezedishanfarm.app.domain.CollectionDetailsEntity
import com.breezedishanfarm.base.BaseResponse
import com.breezedishanfarm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}