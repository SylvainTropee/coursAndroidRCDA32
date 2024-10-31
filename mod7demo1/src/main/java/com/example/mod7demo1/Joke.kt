package com.example.mod7demo1

import com.squareup.moshi.Json
import java.util.Date

data class Joke(
    val id : String,
    val value : String,
    @Json(name = "icon_url")
    val iconUrl : String,
    @Json(name = "created_at")
    val createdDate : Date
)
