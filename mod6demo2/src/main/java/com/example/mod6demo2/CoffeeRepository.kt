package com.example.mod6demo2

class CoffeeRepository(private val coffeeVarietyDAO: CoffeeVarietyDAO) {

    fun insert(coffeeVariety: CoffeVariety): Long {
        return coffeeVarietyDAO.insertCoffeeVariety(coffeVariety = coffeeVariety)
    }

    fun findAll() : List<CoffeVariety>{
        return coffeeVarietyDAO.findAllCoffeeVariety()
    }

}