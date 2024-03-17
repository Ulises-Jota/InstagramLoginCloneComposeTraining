package com.byc.instagramclonecomposetraining.login.data.network

import com.byc.instagramclonecomposetraining.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

/**
 * Creates the [Retrofit] client
 */
interface LoginClient {
    @GET("/v3/fd979a00-e6d5-492c-8284-96e9cba1b4e3")
    suspend fun doLogin(): Response<LoginResponse>
}
