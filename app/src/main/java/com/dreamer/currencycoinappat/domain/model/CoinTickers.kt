package com.dreamer.currencycoinappat.domain.model

import com.dreamer.currencycoinappat.data.remote.dto.Quotes

data class CoinTickers(
    val coinId: String, // btc-bitcoin
    val name: String, // Bitcoin
    val symbol: String, // BTC
    val rank: Int, // 1
    val quotes: Quotes
)
