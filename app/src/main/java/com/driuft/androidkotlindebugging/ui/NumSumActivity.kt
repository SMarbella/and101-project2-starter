package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IAxisValueFormatter

class NumSumActivity : AppCompatActivity() {
    lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_sum)

        setLineGraph()
    }

    private fun setLineGraph() {
        lineChart = findViewById(R.id.chart)

        // United Kingdom data set.
        val ukEntries = ArrayList<Entry>()
        ukEntries.add(Entry(1804F, 5F))
        ukEntries.add(Entry(1814F, 10F))
        ukEntries.add(Entry(1829F, 30F))
        ukEntries.add(Entry(1830F, 30F))
        ukEntries.add(Entry(1850F, 78F))
        ukEntries.add(Entry(1857F, 60F))
        ukEntries.add(Entry(1904F, 102.3F))
        ukEntries.add(Entry(1932F, 71F))
        ukEntries.add(Entry(1933F, 92F))
        ukEntries.add(Entry(1934F, 100F))
        ukEntries.add(Entry(1938F, 126F))
        ukEntries.add(Entry(1973F, 143F))
        ukEntries.add(Entry(1987F, 148F))
        ukEntries.add(Entry(2003F, 208F))
        ukEntries.add(Entry(2007F, 137F))
        ukEntries.add(Entry(2023F, 186F))

        // United States data set.
        val usEntries = ArrayList<Entry>()
        usEntries.add(Entry(1828F, 15F))
        usEntries.add(Entry(1830F, 13F))
        usEntries.add(Entry(1831F, 25F))
        usEntries.add(Entry(1833F, 30F))
        usEntries.add(Entry(1857F, 60F))
        usEntries.add(Entry(1870F, 80F))
        usEntries.add(Entry(1893F, 112F))
        usEntries.add(Entry(1895F, 92.3F))
        usEntries.add(Entry(1905F, 80F))
        usEntries.add(Entry(1930F, 97F))
        usEntries.add(Entry(1934F, 123F))
        usEntries.add(Entry(1935F, 113F))
        usEntries.add(Entry(1939F, 81F))
        usEntries.add(Entry(1941F, 112F))
        usEntries.add(Entry(1966F, 184F))
        usEntries.add(Entry(1967F, 171F))
        usEntries.add(Entry(1971F, 100F))
        usEntries.add(Entry(1974F, 256F))
        usEntries.add(Entry(2012F, 150F))
        usEntries.add(Entry(2022F, 186F))
        usEntries.add(Entry(2023F, 155F))

        // Germany data set.
        val deEntries = ArrayList<Entry>()
        deEntries.add(Entry(1835F, 30F))
        deEntries.add(Entry(1883F, 29.8F))
        deEntries.add(Entry(1901F, 101F))
        deEntries.add(Entry(1903F, 131F))
        deEntries.add(Entry(1914F, 20F))
        deEntries.add(Entry(1936F, 127F))
        deEntries.add(Entry(1988F, 253F))
        deEntries.add(Entry(1998F, 124F))
        deEntries.add(Entry(2000F, 226F))
        deEntries.add(Entry(2006F, 222F))
        deEntries.add(Entry(2011F, 342F))
        deEntries.add(Entry(2023F, 286F))

        // Italy data set.
        val itEntries = ArrayList<Entry>()
        itEntries.add(Entry(1839F, 31.1F))
        itEntries.add(Entry(1937F, 125F))
        itEntries.add(Entry(1938F, 126F))
        itEntries.add(Entry(1939F, 126F))
        itEntries.add(Entry(1960F, 120F))
        itEntries.add(Entry(2008F, 131F))
        itEntries.add(Entry(2009F, 225F))
        itEntries.add(Entry(2016F, 245F))
        itEntries.add(Entry(2023F, 248F))

        // France data set.
        val frEntries = ArrayList<Entry>()
        frEntries.add(Entry(1823F, 30F))
        frEntries.add(Entry(1854F, 80F))
        frEntries.add(Entry(1870F, 112F))
        frEntries.add(Entry(1955F, 206F))
        frEntries.add(Entry(1981F, 236F))
        frEntries.add(Entry(1990F, 320F))
        frEntries.add(Entry(1995F, 158F))
        frEntries.add(Entry(1997F, 186F))
        frEntries.add(Entry(2005F, 164F))
        frEntries.add(Entry(2007F, 357F))
        frEntries.add(Entry(2010F, 199F))
        frEntries.add(Entry(2023F, 350F))

        // South Africa data set.
        val zaEntries = ArrayList<Entry>()
        zaEntries.add(Entry(1859F, 60F))
        zaEntries.add(Entry(1860F, 60F))
        zaEntries.add(Entry(1978F, 152F))
        zaEntries.add(Entry(1980F, 152F))
        zaEntries.add(Entry(2002F, 56F))
        zaEntries.add(Entry(2012F, 100F))
        zaEntries.add(Entry(2023F, 100F))

        // Japan data set.
        val jpEntries = ArrayList<Entry>()
        jpEntries.add(Entry(1872F, 14.3F))
        jpEntries.add(Entry(1954F, 80F))
        jpEntries.add(Entry(1957F, 90F))
        jpEntries.add(Entry(1959F, 101F))
        jpEntries.add(Entry(1960F, 109F))
        jpEntries.add(Entry(1963F, 159F))
        jpEntries.add(Entry(1972F, 178F))
        jpEntries.add(Entry(1979F, 198F))
        jpEntries.add(Entry(1993F, 264F))
        jpEntries.add(Entry(1996F, 275F))
        jpEntries.add(Entry(1997F, 163F))
        jpEntries.add(Entry(1999F, 343F))
        jpEntries.add(Entry(2003F, 361F))
        jpEntries.add(Entry(2005F, 186F))
        jpEntries.add(Entry(2015F, 375F))
        jpEntries.add(Entry(2019F, 250F))
        jpEntries.add(Entry(2023F, 375F))

        // China data set.
        val cnEntries = ArrayList<Entry>()
        cnEntries.add(Entry(1877F, 62F))
        cnEntries.add(Entry(1993F, 29.9F))
        cnEntries.add(Entry(1995F, 40.3F))
        cnEntries.add(Entry(2003F, 311F))
        cnEntries.add(Entry(2010F, 303F))
        cnEntries.add(Entry(2018F, 197F))
        cnEntries.add(Entry(2023F, 268F))

        // Russia data set.
        val ruEntries = ArrayList<Entry>()
        ruEntries.add(Entry(1837F, 37F))
        ruEntries.add(Entry(1842F, 49.7F))
        ruEntries.add(Entry(1851F, 49.7F))
        ruEntries.add(Entry(1890F, 24.9F))
        ruEntries.add(Entry(1916F, 24.9F))
        ruEntries.add(Entry(1921F, 87F))
        ruEntries.add(Entry(1970F, 124.3F))
        ruEntries.add(Entry(1993F, 168F))
        ruEntries.add(Entry(2009F, 155F))
        ruEntries.add(Entry(2023F, 180F))

        // Plots data of train speeds from different countries.
        var ukSpeed = LineDataSet(ukEntries, "United Kingdom")
        var usSpeed = LineDataSet(usEntries, "United States")
        var deSpeed = LineDataSet(deEntries, "Germany")
        var itSpeed = LineDataSet(itEntries, "Italy")
        var frSpeed = LineDataSet(frEntries, "France")
        var zaSpeed = LineDataSet(zaEntries, "South Africa")
        var jpSpeed = LineDataSet(jpEntries, "Japan")
        var cnSpeed = LineDataSet(cnEntries, "China")
        var ruSpeed = LineDataSet(ruEntries, "Russia")

        // Creates line from data sets.
        val countriesData = LineData(
            ukSpeed,
            usSpeed,
            deSpeed,
            itSpeed,
            frSpeed,
            zaSpeed,
            jpSpeed,
            cnSpeed,
            ruSpeed
        )
        lineChart.data = countriesData

        // Sets colors of lines and circles.
        ukSpeed.color = resources.getColor(R.color.blue)
        ukSpeed.resetCircleColors()
        ukSpeed.circleColors.addAll(listOf(Color.RED))
        usSpeed.color = resources.getColor(R.color.purple_200)
        usSpeed.resetCircleColors()
        usSpeed.circleColors.addAll(listOf(Color.RED))
        deSpeed.color = resources.getColor(R.color.orange)
        deSpeed.resetCircleColors()
        deSpeed.circleColors.addAll(listOf(Color.RED))
        itSpeed.color = resources.getColor(R.color.green)
        itSpeed.resetCircleColors()
        itSpeed.circleColors.addAll(listOf(Color.RED))
        frSpeed.color = resources.getColor(R.color.yellow)
        frSpeed.resetCircleColors()
        frSpeed.circleColors.addAll(listOf(Color.RED))
        zaSpeed.color = resources.getColor(R.color.pink)
        zaSpeed.resetCircleColors()
        zaSpeed.circleColors.addAll(listOf(Color.RED))
        jpSpeed.color = resources.getColor(R.color.brown)
        jpSpeed.resetCircleColors()
        jpSpeed.circleColors.addAll(listOf(Color.RED))
        cnSpeed.color = resources.getColor(R.color.teal_200)
        cnSpeed.resetCircleColors()
        cnSpeed.circleColors.addAll(listOf(Color.RED))
        ruSpeed.color = resources.getColor(R.color.light_grey)
        ruSpeed.resetCircleColors()
        ruSpeed.circleColors.addAll(listOf(Color.RED))

        lineChart.getDescription().setText("Speed of trains worldwide over the centuries.")
        lineChart.animateY(500)
        lineChart.getLegend().setWordWrapEnabled(true)

        // Sets X Axis Years to bottom.
        var xAxis = lineChart.getXAxis()
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM)


    }
}