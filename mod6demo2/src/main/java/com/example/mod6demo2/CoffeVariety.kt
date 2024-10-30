package com.example.mod6demo2

import android.provider.BaseColumns

enum class CoffeeType{
    ROBUSTA, ARABICA, HYBRID
}

data class CoffeVariety(
    val name : String,
    val id : Long = 0,
    val origin : String,
    val type : CoffeeType
)

object CoffeeVarietyContract{

    val TABLE_NAME = "coffee_variety"
    val COLUMN_NAME = "name"
    val COLUMN_ORIGIN = "origin"
    val COLUMN_TYPE = "type"

    val DATABASE_NAME = "coffee"
    val DATABASE_VERSION = 1

    val CREATE_TABLE_QUERY = """
        CREATE TABLE $TABLE_NAME (
            ${BaseColumns._ID} INTEGER PRIMARY KEY,
            $COLUMN_NAME TEXT,
            $COLUMN_ORIGIN TEXT,
            $COLUMN_TYPE TEXT
        )        
        """

    val DROP_TABLE_QUERY = "DROP TABLE IF EXISTS $TABLE_NAME"

}

