package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class libpage : AppCompatActivity() {

    val player = "player"
    val word_1 = "word_1"
    val word_2 = "word_2"
    val word_3 = "word_3"
    val word_4 = "word_4"
    val word_5 = "word_5"
    val word_6 = "word_6"
    val word_7 = "word_7"
    val word_8 = "word_8"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libpage)

        val playerName = intent.getStringExtra(player)
        val text_1 = intent.getStringExtra(word_1)
        val text_2 = intent.getStringExtra(word_2)
        val text_3 = intent.getStringExtra(word_3)
        val text_4 = intent.getStringExtra(word_4)
        val text_5 = intent.getStringExtra(word_5)
        val text_6 = intent.getStringExtra(word_6)
        val text_7 = intent.getStringExtra(word_7)
        val text_8 = intent.getStringExtra(word_8)


        val message1 = findViewById<TextView>(R.id.message1).apply{
            text = text_1
        }
        val message2 = findViewById<TextView>(R.id.message2).apply{
            text = text_2
        }
        val message3 = findViewById<TextView>(R.id.message3).apply{
            text = text_3
        }
        val message4 = findViewById<TextView>(R.id.message4).apply{
            text = text_4
        }
        val message5 = findViewById<TextView>(R.id.message5).apply{
            text = text_5
        }
        val message6 = findViewById<TextView>(R.id.message6).apply{
            text = text_6
        }
        val message7 = findViewById<TextView>(R.id.message7).apply{
            text = text_7
        }
        val message8 = findViewById<TextView>(R.id.message8).apply{
            text = text_8
        }
        val playerView = findViewById<TextView>(R.id.playerView).apply {
            text = playerName
        }
    }
}
//create