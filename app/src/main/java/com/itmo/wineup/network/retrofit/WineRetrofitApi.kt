package com.itmo.wineup.network.retrofit

import com.itmo.wineup.network.retrofit.data.WinePositionResponse
import com.itmo.wineup.network.retrofit.data.WineResponse
import retrofit2.http.GET
import retrofit2.http.Headers

interface WineRetrofitApi {

    @Headers("accessToken: 123")
    @GET("wine/true")
    suspend fun getWineList(): List<WineResponse>

    @Headers("accessToken: 123")
    @GET("position/true")
    suspend fun getWinePositionList(): List<WinePositionResponse>

}