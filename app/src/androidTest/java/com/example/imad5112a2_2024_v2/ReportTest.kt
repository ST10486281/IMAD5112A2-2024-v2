package com.example.imad5112a2_2024_v2

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReportTest {
    private lateinit var activityScenario: ActivityScenario<Report>
    @Before
    fun setup() {
        // Launch the activity before each test
        activityScenario = ActivityScenario.launch(Report::class.java)
    }

    @Test
    fun test1() {
        activityScenario.onActivity { activity ->
            //
        }
    }
}
