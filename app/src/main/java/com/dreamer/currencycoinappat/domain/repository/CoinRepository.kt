package com.dreamer.currencycoinappat.domain.repository

import com.dreamer.currencycoinappat.data.remote.dto.CoinDetailDto
import com.dreamer.currencycoinappat.data.remote.dto.CoinDto

//import com.dreamer.currencycoinappat.domain.model.Coin
//import com.dreamer.currencycoinappat.domain.model.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>
//    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetailDto
//    suspend fun getCoinById(coinId: String): CoinDetail
}