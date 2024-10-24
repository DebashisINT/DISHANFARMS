package com.breezedishanfarm.features.mylearning.apiCall

import com.breezedishanfarm.features.login.api.opportunity.OpportunityListApi
import com.breezedishanfarm.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}