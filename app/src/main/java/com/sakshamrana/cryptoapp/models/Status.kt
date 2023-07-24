package com.sakshamrana.cryptoapp.models

data class Status(
    val timestamp: String,
    val errorCode: String,
    val errorMessage: String,
    val elapsed: String,
    val creditCount: Int
)
