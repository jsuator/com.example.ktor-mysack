package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Spend(
    val id: String,
    val amount: Long,
    val description: String
)
