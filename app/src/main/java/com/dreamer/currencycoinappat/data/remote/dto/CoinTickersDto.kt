package com.dreamer.currencycoinappat.data.remote.dto


import com.dreamer.currencycoinappat.domain.model.CoinTickers
import com.google.gson.annotations.SerializedName

data class CoinTickersDto(
    val id: String, // btc-bitcoin
    val name: String, // Bitcoin
    val symbol: String, // BTC
    val rank: Int, // 1
    @SerializedName("circulating_supply")
    val circulatingSupply: Int, // 18823175
    @SerializedName("total_supply")
    val totalSupply: Int, // 18823175
    @SerializedName("max_supply")
    val maxSupply: Int, // 21000000
    @SerializedName("beta_value")
    val betaValue: Double, // 0.931197
    @SerializedName("first_data_at")
    val firstDataAt: String, // 2010-07-17T00:00:00Z
    @SerializedName("last_updated")
    val lastUpdated: String, // 2021-09-22T16:45:44Z
    val quotes: Quotes
)

fun CoinTickersDto.toCoinTickers(): CoinTickers {
    return CoinTickers(
        coinId = id,
        name = name,
        symbol = symbol,
        rank = rank,
        quotes = quotes
    )
}