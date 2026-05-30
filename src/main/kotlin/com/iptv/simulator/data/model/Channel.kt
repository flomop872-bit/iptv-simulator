package com.iptv.simulator.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Channel(
    val id: Int,
    val name: String,
    val logo: String,
    val url: String,
    val category: String,
    val country: String = "USA",
    val countryCode: String = "US",
    val language: String = "EN",
    val decade: String = "2020s",
    val epgId: String? = null
)

@Serializable
data class ChannelList(
    val channels: List<Channel>
)

data class Country(
    val name: String,
    val code: String,
    val flag: String
)

data class Decade(
    val name: String,
    val range: String,
    val emoji: String
)