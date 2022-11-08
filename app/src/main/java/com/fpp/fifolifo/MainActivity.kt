package com.fpp.fifolifo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mushrooms = Stack<String>()
        mushrooms.addAll(listOf("borowik", "maślak", "kurka"))
    }
}