package com.example.mobileprogramming

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)

        val price: TextView = findViewById(R.id.txtPrice)
        val result: TextView = findViewById(R.id.txtResult)
        val gra1: RadioButton = findViewById(R.id.rbGrade1)
        val gra2: RadioButton = findViewById(R.id.rbGrade2)
        val gra3: RadioButton = findViewById(R.id.rbGrade3)
        val calc: Button = findViewById(R.id.btnOK)
        val swr: Switch = findViewById(R.id.swRound)

        calc.setOnClickListener {
            val pr = price.text.toString().toDouble()
            var res: Double = pr

            if (gra1.isChecked) res += pr * 0.2
            if (gra2.isChecked) res += pr * 0.15
            if (gra3.isChecked) res += pr * 0.1
            if (swr.isChecked) res = kotlin.math.ceil(res)

            result.text = res.roundToInt().toString()
        }
    }
}