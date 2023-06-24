package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

private const val TAG = "HelloWorldActivity"

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
    }

    fun nameTrain(view: View) {
        val trainEditText = findViewById<EditText>(R.id.getUserInput)
        var trainName = trainEditText.text.toString()
        val randomTrains = listOf("AirTrain JFK", "Buffalo Metro Rail", "Polar Express",
            "Dinosaur Train", "New York City Subway", "Port Authority Trans-Hudson",
            "Staten Island Railway", "Acela Express", "Admiral", "Advance Commodore Vanderbilt",
            "Advance Denver Zephyr", "Advance Empire State Express", "Advance Florida Special",
            "Advance Flyer", "Baltimore-Washington Night Express", "Baltimore Day Express",
            "Berkshire Hills Express", "Boardwalk Flyer", "Boston Express", "Buffalo Train",
            "Albany Express", "Brazil and Mudlavia Express", "Butte Express", "Butte Special",
            "Brainerd and International Falls Express", "Atlantic Express", "Jacksonville Express",
            "Birmingham Special", "Atlanta Owl")
        if (trainName == "") {
            trainName = randomTrains.random()
        }
        val trainTextViewer = findViewById<TextView>(R.id.textView)
        val phrase = "All aboard the $trainName!"
        trainTextViewer.text = phrase
    }

}