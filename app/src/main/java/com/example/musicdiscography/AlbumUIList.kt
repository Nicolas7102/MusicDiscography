package com.example.musicdiscography

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AlbumUIList(
    list: List<Album>,
    modifier: Modifier = Modifier
) {
    AlbumUIItem(list[0])
}