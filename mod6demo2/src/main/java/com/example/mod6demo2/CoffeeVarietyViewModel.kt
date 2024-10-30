package com.example.mod6demo2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoffeeVarietyViewModel(private val coffeeRepository: CoffeeRepository) : ViewModel() {

    private val _coffeeVarieties = MutableStateFlow<List<CoffeVariety>>(emptyList())
    val coffeeVarieties = _coffeeVarieties.asStateFlow()

    init {
        val c1 = CoffeVariety(
            name = "Java",
            origin = "Indonésie",
            type = CoffeeType.ARABICA
        )
        val c2 = CoffeVariety(
            name = "Bourbon pointu",
            origin = "Ile de la réunion",
            type = CoffeeType.ROBUSTA
        )

        coffeeRepository.insert(c1)
        coffeeRepository.insert(c2)
        _coffeeVarieties.value = coffeeRepository.findAll()
    }


    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])
                val coffeeDbHelper = CoffeeVarietyDbHelper(application.applicationContext)

                return CoffeeVarietyViewModel(
                    CoffeeRepository(
                        CoffeeVarietyDAO(
                            dbr = coffeeDbHelper.readableDatabase,
                            dbw = coffeeDbHelper.writableDatabase
                        )
                    )
                ) as T
            }
        }
    }


}