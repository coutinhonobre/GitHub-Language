package com.github.coutinhonobre.githublanguage.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class OwnerResponseData(
    @SerialName("login")
    val login: String,
    @SerialName("avatar_url")
    val avatarUrl: String
)
