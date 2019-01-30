package com.mahmoud.architecturerecyclerview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Start : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = Button(this)
        button.text = "start"
        setContentView(button)
        button.setOnClickListener {
            startActivity(Intent(this@Start,MainActivity::class.java))
        }
    }
}