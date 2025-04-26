package com.example.musicdiscography

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AlbumUIList(
    albumList: List<Album>,
    modifier: Modifier = Modifier
) {
    AlbumUIItem(albumList[0])
}