package com.example.mod4demo3

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
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

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                //val application = checkNotNull(extras[APPLICATION_KEY])

                return CandyViewModel(CandyRepository()) as T
            }
        }
    }
}