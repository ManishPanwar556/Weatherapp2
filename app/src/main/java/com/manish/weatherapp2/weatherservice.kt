package com.manish.weatherapp2

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val base_url = "http://api.weatherstack.com/"

const val api_key = "62e3936f3eaa38bca39dec97b690d157"

interface weatherservice {

    @GET("$api_key")
    fun getdata(@Query("q") location: String, @Query("language") languagecode: String = "en"): Response<List<weatherdata>>

}