package com.android.example.livedatabuilder

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitUtil {

    val baseUrl="https://api.apiopen.top/"
    private var okHttpClient: OkHttpClient = okhttp3.OkHttpClient.Builder()
        .readTimeout(1, TimeUnit.MINUTES)
        .writeTimeout(1, TimeUnit.MINUTES)
        .build()
     var  retrofit:Retrofit

    init {
        retrofit = Retrofit.Builder()
             .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().add(
                KotlinJsonAdapterFactory()
            ).build()))
            .baseUrl(baseUrl)
            .build()
    }

    fun fetchLive():LiveApi= retrofit.create(LiveApi::class.java)



}
