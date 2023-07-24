package com.sakshamrana.cryptoapp.models

data class Platform(
    val id: Int,
    val name: String,
    val symbol: String,
    val slug: String,
    val tokenAddress: String
)
