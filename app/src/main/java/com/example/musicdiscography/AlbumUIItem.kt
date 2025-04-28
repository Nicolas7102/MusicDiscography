package com.example.musicdiscography

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AlbumUIItem(
    album: Album,
) {
    Column {
        Text(
            text = album.name,
        )
        Text(
            text = album.country,
        )
    }
}