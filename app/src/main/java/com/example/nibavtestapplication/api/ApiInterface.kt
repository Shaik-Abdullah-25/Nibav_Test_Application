package com.example.nibavtestapplication.api

import com.example.nibavtestapplication.ListResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("0")
    fun getCategories() : Call<ListResponse>
}