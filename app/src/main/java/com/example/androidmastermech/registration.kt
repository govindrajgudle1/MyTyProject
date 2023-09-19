package com.example.androidmastermech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registration : AppCompatActivity() {
    lateinit var backtoLoginbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        backtoLoginbutton=findViewById(R.id.backtologin)
        backtoLoginbutton.setOnClickListener {
            // Code to be executed when the operatnew is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}