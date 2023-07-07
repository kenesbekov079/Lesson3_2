package com.example.lesson3_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var ourFontSize = 14f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_increase = findViewById<Button>(R.id.bt_increase)
        val bt_decrease = findViewById<Button>(R.id.bt_decrease)
        val tv_TEXT = findViewById<TextView>(R.id.tv_TEXT)

        bt_increase.setOnClickListener {
            ourFontSize += 2f
            tv_TEXT.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)
        }

        bt_decrease.setOnClickListener {
            ourFontSize -= 2f
            tv_TEXT.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)
        }
    }
}