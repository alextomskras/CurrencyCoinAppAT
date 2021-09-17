package com.dreamer.currencycoinappat.presentation.coin_list

import com.dreamer.currencycoinappat.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
