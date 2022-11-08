package com.fpp.fifolifo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mushrooms = Stack<String>()
        mushrooms.addAll(listOf("borowik", "maślak", "kurka"))
        //findViewById<TextView>(R.id.listView).text = mushrooms.peek()

        findViewById<Button>(R.id.button).setOnClickListener {
            mushrooms.push(findViewById<EditText>(R.id.textInput).text.toString())
        }
    }
}