package com.bicutoru.contactlist

import androidx.annotation.DrawableRes

@kotlinx.serialization.Serializable
data class Contact(
    val name: String,
    val phone: String,
    var newMessages: Int,
    @DrawableRes val icon: Int,
)