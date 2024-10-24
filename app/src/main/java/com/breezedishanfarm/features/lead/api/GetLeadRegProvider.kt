package com.breezedishanfarm.features.lead.api

import com.breezedishanfarm.features.NewQuotation.api.GetQuotListRegRepository
import com.breezedishanfarm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}