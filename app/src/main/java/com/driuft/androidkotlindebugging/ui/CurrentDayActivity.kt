package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.*

class CurrentDayActivity : AppCompatActivity() {

    private lateinit var currentTimeText: TextView
    private lateinit var currentDayText: TextView
    private lateinit var currentDayWeekText: TextView
    private lateinit var currentMonthText: TextView
    private lateinit var currentYearText: TextView
    private val cal: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        currentTimeText = findViewById(R.id.current_time_text)
        currentTimeText.text = getCurrentTime()

        currentDayText = findViewById(R.id.current_day_text)
        currentDayText.text = getDayOfMonth().toString()

        currentDayWeekText = findViewById(R.id.current_day_week_text)
        currentDayWeekText.text = getDayOfWeek()

        currentMonthText = findViewById(R.id.current_month_text)
        currentMonthText.text = getCurrentMonth()

        currentYearText = findViewById(R.id.current_year_text)
        currentYearText.text = getCurrentYear().toString()
    }

    private fun getDayOfMonth(): Int {
        return cal.get(Calendar.DAY_OF_MONTH)
    }

    private fun getDayOfWeek(): String {
        val week = listOf(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday")
        val day = cal.get(Calendar.DAY_OF_WEEK)
        return week[day - 1]
    }

    private fun getCurrentMonth(): String {
        val months = listOf("January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
        "October",
        "November",
        "December")
        val todaysMonth = cal.get(Calendar.MONTH)
        return months[todaysMonth]
    }

    private fun getCurrentYear(): Int {
        val year = cal.get(Calendar.YEAR)
        return year
    }

    private fun getCurrentTime(): String {
        val hour = cal.get(Calendar.HOUR_OF_DAY)
        val minute = cal.get(Calendar.MINUTE)
        return "${hour}:${minute}"
    }
}