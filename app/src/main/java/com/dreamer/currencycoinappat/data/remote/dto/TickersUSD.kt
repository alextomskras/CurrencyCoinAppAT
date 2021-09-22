package com.dreamer.currencycoinappat.data.remote.dto


import com.dreamer.currencycoinappat.domain.model.USD
import com.google.gson.annotations.SerializedName

data class TickersUSD(
    val price: Double, // 43386.809879257
    @SerializedName("volume_24h")
    val volume24h: Double, // 49221463388.984
    @SerializedName("volume_24h_change_24h")
    val volume24hChange24h: Double, // 2.01
    @SerializedName("market_cap")
    val marketCap: Long, // 816677515048
    @SerializedName("market_cap_change_24h")
    val marketCapChange24h: Double, // 1.46
    @SerializedName("percent_change_15m")
    val percentChange15m: Double, // 0.22
    @SerializedName("percent_change_30m")
    val percentChange30m: Double, // 0.13
    @SerializedName("percent_change_1h")
    val percentChange1h: Double, // 0.74
    @SerializedName("percent_change_6h")
    val percentChange6h: Double, // 3.05
    @SerializedName("percent_change_12h")
    val percentChange12h: Double, // 3.26
    @SerializedName("percent_change_24h")
    val percentChange24h: Double, // 1.46
    @SerializedName("percent_change_7d")
    val percentChange7d: Double, // -10.16
    @SerializedName("percent_change_30d")
    val percentChange30d: Double, // -12.81
    @SerializedName("percent_change_1y")
    val percentChange1y: Double, // 312.25
    @SerializedName("ath_price")
    val athPrice: Double, // 65028.97108592
    @SerializedName("ath_date")
    val athDate: String, // 2021-04-14T08:53:23Z
    @SerializedName("percent_from_price_ath")
    val percentFromPriceAth: Double // -33.33
)

fun TickersUSD.toUSD(): USD {
    return USD(
        price = price,

        volume24h = volume24h, // 49221463388.984

        volume24hChange24h = volume24hChange24h, // 2.01

        marketCap = marketCap, // 816677515048


        athPrice = athPrice, // 65028.97108592

        athDate = athDate, // 2021-04-14T08:53:23Z

        percentFromPriceAth = percentFromPriceAth // -33.33
    )
}