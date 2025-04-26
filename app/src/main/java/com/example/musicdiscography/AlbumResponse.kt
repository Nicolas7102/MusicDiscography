package com.example.musicdiscography

data class AlbumResponse(
    val artists: List<Album>
)

data class Album(
    val name: String,
    val country: String,
)