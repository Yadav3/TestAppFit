package com.test.aryapp.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class PhotosItem(
    @SerializedName("albumId")
    val albumId: String,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,

) : Serializable