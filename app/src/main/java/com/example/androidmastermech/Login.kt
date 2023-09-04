package com.example.androidmastermech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbutton=findViewById<Button>(R.id.LoginBtn)
        loginbutton.setOnClickListener {
            // Code to be executed when the entmac is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val registrationbutton=findViewById<Button>(R.id.Rbttn)
        registrationbutton.setOnClickListener {
            // Code to be executed when the entmac is clicked
            val intent = Intent(this, registration::class.java)
            startActivity(intent)
        }



    }
}