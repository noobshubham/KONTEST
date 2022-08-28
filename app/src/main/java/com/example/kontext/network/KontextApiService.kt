package com.example.kontext.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://kontests.net/api/v1/"

interface KontextApiService {
    @GET("all")
    fun getKontext(): Call<KontextData>
}

object KontextService {
    val kontextInstance: KontextApiService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        kontextInstance = retrofit.create(KontextApiService::class.java)
    }
}