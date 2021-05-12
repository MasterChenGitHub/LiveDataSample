package com.android.example.livedatabuilder

import retrofit2.http.GET

interface LiveApi {
    @GET("getJoke?page=1&count=2&type=video")
   suspend fun getLive():LiveResponse
}