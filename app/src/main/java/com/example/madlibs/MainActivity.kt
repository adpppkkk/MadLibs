package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

val player = "player"
val word_1 = "word_1"
val word_2 = "word_2"
val word_3 = "word_3"
val word_4 = "word_4"
val word_5 = "word_5"
val word_6 = "word_6"
val word_7 = "word_7"
val word_8 = "word_8"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun createMadLib(view: View) {
        val playerName = findViewById<EditText>(R.id.player).text.toString()
        val input1 = findViewById<EditText>(R.id.text1).text.toString()
        val input2 = findViewById<EditText>(R.id.text2).text.toString()
        val input3 = findViewById<EditText>(R.id.text3).text.toString()
        val input4 = findViewById<EditText>(R.id.text4).text.toString()
        val input5 = findViewById<EditText>(R.id.text5).text.toString()
        val input6 = findViewById<EditText>(R.id.text6).text.toString()
        val input7 = findViewById<EditText>(R.id.text7).text.toString()
        val input8 = findViewById<EditText>(R.id.text8).text.toString()

        val intent = Intent(this,libpage::class.java).apply {
            putExtra(player, playerName)
            putExtra(word_1, input1)
            putExtra(word_2, input2)
            putExtra(word_3, input3)
            putExtra(word_4, input4)
            putExtra(word_5, input5)
            putExtra(word_6, input6)
            putExtra(word_7, input7)
            putExtra(word_8, input8)

        }
        startActivity(intent)

    }
}
