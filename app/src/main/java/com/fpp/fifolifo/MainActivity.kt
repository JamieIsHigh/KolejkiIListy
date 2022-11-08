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
        findViewById<TextView>(R.id.listView).text = mushrooms.peek()
        //dodaj do listy
        findViewById<Button>(R.id.button4).setOnClickListener {
            mushrooms.push(findViewById<EditText>(R.id.textInput).text.toString())
            findViewById<TextView>(R.id.listView).text = mushrooms.peek()
        }
        //usun z kolejki
        findViewById<Button>(R.id.button2).setOnClickListener {
            if (!mushrooms.isEmpty()) {
                mushrooms.pop()
                if (mushrooms.size == 0) {
                    findViewById<TextView>(R.id.listView).text = ""
                } else {
                    findViewById<TextView>(R.id.listView).text = mushrooms.peek()
                }
            }
        }

        var ksiazki = LinkedList<String>()
        ksiazki.addAll(listOf("Harry Potter", "Hunger Games"))
        findViewById<TextView>(R.id.textView2).text = ksiazki.peek()
        findViewById<TextView>(R.id.textView3).text = "Długość kolejki: " + ksiazki.size
        //usun z kolejki
        findViewById<Button>(R.id.button3).setOnClickListener {
            if (!ksiazki.isEmpty()) {
                ksiazki.removeFirst()
                if (ksiazki.size == 0) {
                    findViewById<TextView>(R.id.textView2).text = ""
                }
                else {
                    findViewById<TextView>(R.id.textView2).text = ksiazki.peek()
                }
                findViewById<TextView>(R.id.textView3).text = "Długość kolejki: " + ksiazki.size
            }
        }
        //dodaj do kolejki
        findViewById<Button>(R.id.button).setOnClickListener {
            ksiazki.push(findViewById<EditText>(R.id.textInput).text.toString())
            findViewById<TextView>(R.id.textView2).text = ksiazki.peek()
            findViewById<TextView>(R.id.textView3).text = "Długość kolejki: " + ksiazki.size
        }

    }
}