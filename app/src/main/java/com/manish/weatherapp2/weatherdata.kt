package com.manish.weatherapp2


import com.google.gson.annotations.SerializedName

data class weatherdata(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location,
    @SerializedName("request")
    val request: Request
)