package com.byc.instagramclonecomposetraining.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    /**
     * Creates the [Retrofit] instance (when we don't use Dependencies Injection)
     *
     * @return a [Retrofit] instance
     */
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
