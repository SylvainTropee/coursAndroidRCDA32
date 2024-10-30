package com.example.mod6demo2

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class CoffeeVarietyDAO(
    val dbw: SQLiteDatabase,
    val dbr: SQLiteDatabase
) {

    fun insertCoffeeVariety(coffeVariety: CoffeVariety): Long {

        val values = ContentValues()
        values.put(CoffeeVarietyContract.COLUMN_NAME, coffeVariety.name)
        values.put(CoffeeVarietyContract.COLUMN_ORIGIN, coffeVariety.origin)
        values.put(CoffeeVarietyContract.COLUMN_TYPE, coffeVariety.type.toString())

        val id = dbw.insert(CoffeeVarietyContract.TABLE_NAME, null, values)
        return id
    }

    fun findAllCoffeeVariety(): List<CoffeVariety> {


        val coffeeVarieties = mutableListOf<CoffeVariety>()

        val projection = arrayOf(
            BaseColumns._ID,
            CoffeeVarietyContract.COLUMN_NAME,
            CoffeeVarietyContract.COLUMN_ORIGIN,
            CoffeeVarietyContract.COLUMN_TYPE,
        )

        val cursor = dbr.query(
            CoffeeVarietyContract.TABLE_NAME,
            projection,
            //Clause Where
            //"CoffeeVarietyContract.COLUMN_NAME = ?",
            //Paramète de la clause where
            //arrayOf("Grand-mère")
            null,
            null,
            null,
            null,
            null
        )

        with(cursor) {
            while (moveToNext()) {
                val cf = CoffeVariety(
                    id = getLong(getColumnIndexOrThrow(BaseColumns._ID)),
                    name = getString(getColumnIndexOrThrow(CoffeeVarietyContract.COLUMN_NAME)),
                    origin = getString(getColumnIndexOrThrow(CoffeeVarietyContract.COLUMN_ORIGIN)),
                    type = CoffeeType.valueOf(getString(getColumnIndexOrThrow(CoffeeVarietyContract.COLUMN_TYPE)))
                )

                coffeeVarieties.add(cf)
            }
        }

        cursor.close()
        return coffeeVarieties
    }

}