package com.challenge.cryptowize2.mvvm.model

class PayloadAskNBidModel(
    val asks: List<AskModel>,
    val bids: List<BidModel>,
    val sequence: String,
    val updated_at: String
)