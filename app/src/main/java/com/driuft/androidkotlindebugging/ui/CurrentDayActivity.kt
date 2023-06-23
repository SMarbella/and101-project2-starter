package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.*

class CurrentDayActivity : AppCompatActivity() {

    private lateinit var currentTimeText: TextView
    private lateinit var currentDayWeekText: TextView
    private lateinit var currentDateText: TextView
    private val cal: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        currentTimeText = findViewById(R.id.current_time_text)
        currentTimeText.text = getCurrentTime()

        currentDayWeekText = findViewById(R.id.current_day_week_text)
        currentDayWeekText.text = getDayOfWeek()

        currentDateText = findViewById(R.id.current_date_text)
        currentDateText.text = getFormattedDate()
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
        return "Today is\n${week[day - 1]}"
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

    private fun getFormattedDate(): String {
        val day = getDayOfMonth()
        val month = getCurrentMonth()
        val year = getCurrentYear()
        return "$month $day, $year"
    }

    private fun getCurrentTime(): String {
        // 24-hour clock format
        val hour = cal.get(Calendar.HOUR_OF_DAY)
        val minute = cal.get(Calendar.MINUTE)
        var correctedHour = hour.toString()
        var correctedMinute = minute.toString()
        if (hour < 10) {
            correctedHour = "0$hour"
        }
        if (minute < 10) {
            correctedMinute = "0$minute"
        }

        // 12-hour clock format
        val amPmList = listOf("AM", "PM")

        val amPmHour = cal.get(Calendar.HOUR)
        val amPm = cal.get(Calendar.AM_PM)

        val morningOrAfternoon = amPmList[amPm]
        return """.::Military time::.
            |${correctedHour}${correctedMinute}
            |
            |.::24-hour::.
            |${correctedHour}:${correctedMinute}
            |
            |.::12-hour::.
            |${amPmHour}:${correctedMinute} ${morningOrAfternoon}""".trimMargin()
    }
}