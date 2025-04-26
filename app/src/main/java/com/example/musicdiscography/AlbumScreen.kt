package com.example.musicdiscography

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicdiscography.ui.theme.AlbumTheme

@Composable
fun AlbumScreen(albumList: List<Album>, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(
            text = "Lista de algo",
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier,
        )
    }
    Spacer(modifier = Modifier.height(12.dp))
    AlbumUIList(albumList, Modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
fun AlbumScreenPreview() {
    AlbumTheme {
        //MusicDiscographyScreen(List<Album>())
    }
}