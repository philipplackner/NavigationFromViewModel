package com.plcoding.navigationfromviewmodel

import kotlinx.serialization.Serializable

sealed interface Destination {
    @Serializable
    data object HomeGraph: Destination

    @Serializable
    data object AuthGraph: Destination

    @Serializable
    data object LoginScreen: Destination

    @Serializable
    data object HomeScreen: Destination

    @Serializable
    data class DetailScreen(val id: String): Destination
}