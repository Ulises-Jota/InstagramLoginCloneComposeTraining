package com.byc.instagramclonecomposetraining.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("success")
    val success: Boolean
)
