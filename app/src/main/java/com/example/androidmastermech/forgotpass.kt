package com.example.androidmastermech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgotpass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpass)

        var back = findViewById<Button>(R.id.Rbttn1)
        back.setOnClickListener {
            // Code to be executed when the operatnew is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
    }
}}