package com.dreamer.currencycoinappat.data.repository

import com.dreamer.currencycoinappat.data.remote.CoinPaprikaApi
import com.dreamer.currencycoinappat.data.remote.dto.CoinDetailDto
import com.dreamer.currencycoinappat.data.remote.dto.CoinDto
import com.dreamer.currencycoinappat.data.remote.dto.CoinTickersDto
import com.dreamer.currencycoinappat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

    override suspend fun getCoinsTickers(): CoinTickersDto {
        return api.getCoinsTickers()
    }
}