package com.manish.weatherapp2

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.create

object client {

    val gson =
        GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

    val retrofit=Retrofit.Builder().baseUrl("http://api.weatherstack.com/").build()

    val api= retrofit.create<weatherservice>()

}