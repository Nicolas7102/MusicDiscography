package com.example.musicdiscography

import com.google.gson.annotations.SerializedName

//data class AlbumResponse (
//    val data: List<Song>
//)
//
//data class Song (
//    val count: Int,
//    val offset: Int

//    val id: String,
//    val title: String,
//    @SerializedName("first-release-date")
//    val releaseDate: String
//)

data class AlbumResponse(
    @SerializedName("release-groups") val artists: List<Album>
)

data class Album(
    val name: String,
    val id: String,
)