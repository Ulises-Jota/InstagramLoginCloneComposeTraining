package com.byc.instagramclonecomposetraining.login.data.network

import com.byc.instagramclonecomposetraining.core.network.RetrofitHelper
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

/**
 * It is in charge of calling all the endpoints that the client has.
 * Contains the [Retrofit] object created in [RetrofitHelper.getRetrofit] function
 * (when we don't use Dependencies Injection).
 *
 * Otherwise, it uses an injected [LoginClient] dependency.
 */
class LoginService @Inject constructor(
    private val loginClient: LoginClient
) {
//    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}
