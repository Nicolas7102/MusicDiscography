package com.example.musicdiscography

data class AlbumResponse(
    val artists: List<Album>
)

data class Album(
    val id: String,
    val name: String,
)