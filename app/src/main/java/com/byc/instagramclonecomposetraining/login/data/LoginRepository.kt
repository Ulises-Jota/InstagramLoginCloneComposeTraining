package com.byc.instagramclonecomposetraining.login.data

import com.byc.instagramclonecomposetraining.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val api: LoginService
) {
    suspend fun doLogin(user: String, password: String): Boolean =
        api.doLogin(user, password)
}
