package com.github.coutinhonobre.githublanguage.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ItemResponseData(
    @SerialName("name")
    val name: String,
    @SerialName("stargazers_count")
    val stargazersCount: Long,
    @SerialName("forks_count")
    val forksCount: Long,
    @SerialName("owner")
    val owner: OwnerResponseData?
)
