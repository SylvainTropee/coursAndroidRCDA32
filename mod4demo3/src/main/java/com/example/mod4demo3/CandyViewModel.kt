package com.example.mod4demo3

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CandyViewModel(candyRepository: CandyRepository) : ViewModel() {

    private val _candies = MutableStateFlow<List<String>>(emptyList())
    //val candies : StateFlow<List<String>> = _candies
    val candies = _candies.asStateFlow()

    init {
        _candies.value = candyRepository.getAllCandies()
    }

}