package com.example.androidmastermech

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.*

class Login : AppCompatActivity() {
    lateinit var forgotpd:TextView
    private lateinit var loginbutton:Button
    lateinit var forgtpss: TextView
    lateinit var content: SpannableString
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbutton=findViewById(R.id.LoginBtn)



        loginbutton.setOnClickListener {
            // Code to be executed when the operatnew is clicked
            val intent = Intent(this, newoperator::class.java)
            startActivity(intent)


        }

        val registrationbutton=findViewById<Button>(R.id.Rbttn)
        registrationbutton.setOnClickListener {
            // Code to be executed when the operatnew is clicked
            val intent = Intent(this, registration::class.java)
            startActivity(intent)
        }

        forgotpd=findViewById(R.id.forgotpasswd)
        forgotpd.setOnClickListener{
            val intent=Intent(this,forgotpass::class.java)
            startActivity(intent)
        }



    }
        }







