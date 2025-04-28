package com.example.musicdiscography

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.musicdiscography.ui.theme.AlbumTheme
import com.google.gson.Gson
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlbumTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AlbumScreen(
                        albumList = getAlbum(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

fun getAlbum() : List<Album> {
    val gson = Gson()
    val albumResponse = gson.fromJson(json, AlbumResponse::class.java)
    Log.d("GSONARTISTS", albumResponse.artists.toString())
    Log.d("GSONARTISTSNAME", albumResponse.artists[0].name)
    return albumResponse.artists
}

var json = """
    {
  "created": "2025-04-24T21:09:51.704Z",
  "count": 2,
  "offset": 0,
  "artists": [
    {
      "id": "056e4f3e-d505-4dad-8ec1-d04f521cbb56",
      "type": "Group",
      "type-id": "e431f5f6-b5d2-343d-8b36-72607fffb74b",
      "score": 100,
      "name": "Daft Punk",
      "sort-name": "Daft Punk",
      "country": "FR",
      "area": {
        "id": "08310658-51eb-3801-80de-5a0739207115",
        "type": "Country",
        "type-id": "06dd0ae4-8c74-30bb-b43d-95dcedf961de",
        "name": "France",
        "sort-name": "France",
        "life-span": {
          "ended": null
        }
      },
      "begin-area": {
        "id": "dc10c22b-e510-4006-8b7f-fecb4f36436e",
        "type": "City",
        "type-id": "6fd8f29a-3d0a-32fc-980d-ea697b69da78",
        "name": "Paris",
        "sort-name": "Paris",
        "life-span": {
          "ended": null
        }
      },
      "disambiguation": "French electronic duo",
      "ipis": [
        "00711797335"
      ],
      "isnis": [
        "0000000123531208"
      ],
      "life-span": {
        "begin": "1993",
        "end": "2021-02-22",
        "ended": true
      },
      "aliases": [
        {
          "sort-name": "ダフト・パンク",
          "type-id": "894afba6-2816-3c24-8072-eadb66bd04bc",
          "name": "ダフト・パンク",
          "locale": "ja",
          "type": "Artist name",
          "primary": true,
          "begin-date": null,
          "end-date": null
        },
        {
          "sort-name": "Daft Punk",
          "type-id": "894afba6-2816-3c24-8072-eadb66bd04bc",
          "name": "Daft Punk",
          "locale": "en",
          "type": "Artist name",
          "primary": true,
          "begin-date": null,
          "end-date": null
        },
        {
          "sort-name": "Duft Punk",
          "name": "Duft Punk",
          "locale": null,
          "type": null,
          "primary": null,
          "begin-date": null,
          "end-date": null
        },
        {
          "sort-name": "Da Funk",
          "name": "Da Funk",
          "locale": null,
          "type": null,
          "primary": null,
          "begin-date": null,
          "end-date": null
        }
      ],
      "tags": [
        {
          "count": 30,
          "name": "electronic"
        },
        {
          "count": 1,
          "name": "synthpop"
        },
        {
          "count": 7,
          "name": "french"
        },
        {
          "count": 2,
          "name": "dance"
        },
        {
          "count": 13,
          "name": "house"
        },
        {
          "count": 1,
          "name": "vocoder"
        },
        {
          "count": 1,
          "name": "funk"
        },
        {
          "count": 2,
          "name": "disco"
        },
        {
          "count": 0,
          "name": "favourite"
        },
        {
          "count": 0,
          "name": "tech house"
        },
        {
          "count": 2,
          "name": "film score"
        },
        {
          "count": 0,
          "name": "wp musicians"
        },
        {
          "count": 1,
          "name": "electroclash"
        },
        {
          "count": 1,
          "name": "european"
        },
        {
          "count": 2,
          "name": "electro house"
        },
        {
          "count": 2,
          "name": "french touch"
        },
        {
          "count": 10,
          "name": "french house"
        },
        {
          "count": 0,
          "name": "dance and electronica"
        },
        {
          "count": 0,
          "name": "thomas bangalter"
        },
        {
          "count": 2,
          "name": "nu-disco"
        },
        {
          "count": 1,
          "name": "french electro"
        }
      ]
    },
    {
      "id": "80846e42-6bba-4fed-9d08-f095b15f28ec",
      "score": 67,
      "name": "Daft Punk NFT",
      "sort-name": "Daft Punk NFT",
      "life-span": {
        "ended": null
      }
    }
  ]
}
""".trimIndent()

