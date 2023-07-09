package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.driuft.androidkotlindebugging.R
import java.util.*

class RandomColorActivity : AppCompatActivity() {
    private lateinit var trainHeadImage: ImageView
    private lateinit var trainSectionImage: ImageView
    private lateinit var trainSection2Image: ImageView
    private val rootView: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_color)
        // Changes color of the head of the train.
        trainHeadImage = findViewById(R.id.train_head)
        trainHeadImage.setOnClickListener { trainHeadImage.setColorFilter(getRandomColor()) }

        // Changes color of the car of the train.
        trainSectionImage = findViewById(R.id.train_section)
        trainSectionImage.setOnClickListener { trainSectionImage.setColorFilter(getRandomColor()) }

        // Changes color of the caboose.
        trainSection2Image = findViewById(R.id.train_section2)
        trainSection2Image.setOnClickListener { trainSection2Image.setColorFilter(getRandomColor()) }
    }

    private fun getRandomColor(): Int {
        // Get random color// Get random color// Get random color// Get random color
        val rnd = Random()
        return Color.argb(
            255,
            rnd.nextInt(256),
            rnd.nextInt(256),
            rnd.nextInt(256)
        )
    }
}