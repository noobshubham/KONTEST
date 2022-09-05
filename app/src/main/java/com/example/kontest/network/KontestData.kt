package com.example.kontest.network

data class KontestData(
    val name: String,
    val url: String,
    val start_time: String,
    val end_time: String,
    val duration: String,
    val site: String,
    val in_24_hours: String,
    val status: String
)
