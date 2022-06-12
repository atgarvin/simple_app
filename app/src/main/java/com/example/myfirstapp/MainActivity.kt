package com.example.myfirstapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when the user taps the color button */
    fun changeColor(view: View) {
        val button = findViewById<Button>(view.id)
        button.setBackgroundColor(Color.BLUE)

        val color = (button.background as ColorDrawable).color

        //buttonColor: ColorDrawable = button.background as ColorDrawable
        //val color = buttonColor.color
        /**if(color == Color.YELLOW) {
            button.setBackgroundColor(Color.BLUE)
        } else {
            button.setBackgroundColor(Color.YELLOW)
        }*/
        /**if((button.background as ColorDrawable).color == Color.YELLOW) {
            button.setBackgroundColor(Color.BLUE)
        }*/
    }
}