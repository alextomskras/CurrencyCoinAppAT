package com.dreamer.currencycoinappat.di

import com.dreamer.currencycoinappat.common.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): com.dreamer.currencycoinappat.data.remote.CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(com.dreamer.currencycoinappat.data.remote.CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: com.dreamer.currencycoinappat.data.remote.CoinPaprikaApi): com.dreamer.currencycoinappat.domain.repository.CoinRepository {
        return com.dreamer.currencycoinappat.data.repository.CoinRepositoryImpl(api)
    }
}