package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class PrintListActivity : AppCompatActivity() {

    private val wordList: TextView get() = findViewById(R.id.word_list)
    private var words = listOf(
        "Information Desk",
        "Baggage/Freight Services",
        "Lost Property Office",
        "Station Master",
        "Ticket Office",
        "Shops/Restaurants",
        "Arrivals/Departures Boards",
        "Railway",
        "Train Conductor",
        "Trains",
        "Railroad Crossing Signs"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_list)

        wordList.text = combinedWords()
    }

    private fun combinedWords(): String {
        var combined = ""
        for (word in words) {
            combined += "$word\n"
        }
        return combined
    }
}