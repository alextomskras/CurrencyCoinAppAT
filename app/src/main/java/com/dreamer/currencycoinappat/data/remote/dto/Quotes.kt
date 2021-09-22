package com.dreamer.currencycoinappat.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Quotes(
    @SerializedName("USD")
    val uSD: TickersUSD
)