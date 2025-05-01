package com.example.imad5112a2_2024_v2

import android.content.Intent
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReportTest {

    @Test
    fun test1() {
        val intent = Intent(Intent.ACTION_MAIN).apply {
            setClassName(
                "com.example.imad5112a2_2024_v2",
                "com.example.imad5112a2_2024_v2.Report"
            )
            putExtra("daysArray", arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"))
            putExtra("gramsArray", intArrayOf(100, 100, 100, 100, 100, 100, 100))
        }

        val scenario = ActivityScenario.launch<Report>(intent)

        scenario.onActivity { activity ->
            val reportView = activity.findViewById<TextView>(R.id.reportTextView)
            assertTrue(reportView.text.contains("Total: 700"))
        }
    }
}
