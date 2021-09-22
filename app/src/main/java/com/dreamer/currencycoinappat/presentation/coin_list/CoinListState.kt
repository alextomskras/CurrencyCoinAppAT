package com.dreamer.currencycoinappat.presentation.coin_list

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<com.dreamer.currencycoinappat.domain.model.Coin> = emptyList(),
    val error: String = ""
)
