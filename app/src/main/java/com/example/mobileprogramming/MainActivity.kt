package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOK = findViewById<Button>(R.id.btnOK)
        val imgDice = findViewById<ImageView>(R.id.imgDice)

        btnOK.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val imgDice = findViewById<ImageView>(R.id.imgDice)

        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDice.setImageResource(drawableResource)

 /*       val luckyNumber = 4
        var mess = ""
        when(randomInt) {
            luckyNumber -> mess = "이겼습니다!"
            1 -> mess = "미안하네요! 1이 나왔습니다!"
            2 -> mess = "슬픕니다!! 2가 나왔습니다!"
            3 -> mess = "안돼!! 3이 나왔습니다!"
            5 -> mess = "울지 말아요! 5가 나왔습니다!"
            6 -> mess = "오! 6이 나왔습니다!"
        }
        Toast.makeText(this, mess, Toast.LENGTH_SHORT).show()*/
    }
}