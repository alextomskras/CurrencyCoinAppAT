package com.dreamer.currencycoinappat.domain.use_case.get_tickers

import com.dreamer.currencycoinappat.common.Resource
import com.dreamer.currencycoinappat.data.remote.dto.toCoinTickers
import com.dreamer.currencycoinappat.domain.model.CoinTickers
import com.dreamer.currencycoinappat.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetTickersUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<CoinTickers>> = flow {
        try {
            emit(Resource.Loading<CoinTickers>())
            val coin = repository.getCoinsTickers().toCoinTickers()
            emit(Resource.Success<CoinTickers>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinTickers>(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinTickers>("Couldn't reach server. Check your internet connection."))
        }
    }
}