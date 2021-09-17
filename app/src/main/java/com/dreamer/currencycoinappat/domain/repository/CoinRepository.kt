package com.dreamer.currencycoinappat.domain.repository

import com.dreamer.currencycoinappat.data.remote.dto.CoinDetailDto
import com.dreamer.currencycoinappat.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}