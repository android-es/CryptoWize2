package com.challenge.cryptowize2.mvvm.model

data class PayloadModel(
    val book: String,
    val minimum_amount: String,
    val maximum_amount: String,
    val minimum_price: String,
    val maximum_price: String,
    val minimum_value: String,
    val maximum_value: String
)

//agregar función...