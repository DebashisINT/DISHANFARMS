package com.breezedishanfarm.features.survey.api

import com.breezedishanfarm.features.photoReg.api.GetUserListPhotoRegApi
import com.breezedishanfarm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}