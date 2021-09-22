package com.dreamer.currencycoinappat.presentation.coin_detail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: com.dreamer.currencycoinappat.domain.model.CoinDetail? = null,
    val error: String = ""
)
