package com.dreamer.currencycoinappat.presentation.coin_detail

import com.dreamer.currencycoinappat.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
