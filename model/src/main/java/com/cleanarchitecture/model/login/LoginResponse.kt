package com.cleanarchitecture.model.login

data class LoginResponse(
    val message: String,
    val status: String,
    val user: LoginModel
)