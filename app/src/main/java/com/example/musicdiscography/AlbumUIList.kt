package com.example.musicdiscography

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items

@Composable
fun AlbumUIList(
    list: List<Album>,
    modifier: Modifier = Modifier
) {
    AlbumUIItem(list[0])
}