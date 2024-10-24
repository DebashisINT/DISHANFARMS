package com.breezedishanfarm.features.document.api

import com.breezedishanfarm.features.dymanicSection.api.DynamicApi
import com.breezedishanfarm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}