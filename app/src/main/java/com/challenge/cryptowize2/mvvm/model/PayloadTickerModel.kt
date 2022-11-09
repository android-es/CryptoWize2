package com.challenge.cryptowize2.mvvm.model

data class PayloadTickerModel(
        val book: String,
        val volume: String,
        val high: String,
        val last: String,
        val low: String,
        val vwap: String,
        val ask: String,
        val bid: String,
        val created_at: String,

        val change_24: String//??
)
