package com.codepath.pythagoreantheoremcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun calculateResult(): Double {
        var sideAText = findViewById<EditText>(R.id.sideA)
        var sideBText = findViewById<EditText>(R.id.sideB)

        var sideA = sideAText.getText().toString().toDouble()
        var sideB = sideBText.getText().toString().toDouble()

        var sideC: Double = sideA.pow(2.0) + sideB.pow(2.0)
        return sqrt(sideC)
    }

    fun showResult(view: View) {
        var sideCResult = calculateResult()

        var sideCText = findViewById<TextView>(R.id.result)
        var resultText = ("%.2f".format(sideCResult))

        sideCText.setText(resultText)
    }

}