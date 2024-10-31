package com.example.mod7demo1

import android.util.Log
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date

private const val TAG = "DateConverter"
object DateConverter {
    val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S")

    @ToJson
    fun convertDateToSimpleString(date : Date): String {
        return formatter.format(date)
    }

    @FromJson
    fun convertStringToSimpleDate(text : String): Date {
        var date = Date()
        try {

            date = formatter.parse(text)
        }catch (e: ParseException){
            Log.i(TAG, "convertStringToSimpleDate: ${e.message}")
        }
        return date
    }


}