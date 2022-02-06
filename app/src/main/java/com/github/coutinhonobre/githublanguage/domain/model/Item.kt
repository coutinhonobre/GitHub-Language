package com.github.coutinhonobre.githublanguage.domain.model


internal data class Item(
    val name: String,
    val stargazersCount: Long,
    val forksCount: Long,
    val owner: Owner?
)
