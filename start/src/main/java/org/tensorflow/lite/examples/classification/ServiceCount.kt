package org.tensorflow.lite.examples.classification

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryService {
    @GET("info/{code}.json")
    fun getCountry(@Path("code") codeCountry: String): Call<Country>
}