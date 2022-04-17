package com.mahendrimd.dailyquote.network

import com.squareup.moshi.Json

data class Quote(
    @Json(name = "q") val text: String,
    @Json(name = "a") val author: String,
    @Json(name = "h") val formatHtml: String
)
