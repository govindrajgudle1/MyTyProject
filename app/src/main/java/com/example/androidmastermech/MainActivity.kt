package com.example.androidmastermech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.Connection
import java.sql.DriverManager
import android.widget.Button
import androidx.cardview.widget.CardView;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            fun getConnection(): Connection? {
                try {
                    // Load the MySQL JDBC driver
                    Class.forName("com.mysql.jdbc.Driver")
                    // Replace with your MySQL database credentials
                    val url = "jdbc:mysql://your_host:your_port/your_database"
                    val username = "your_username"
                    val password = "your_password"
                    return DriverManager.getConnection(url, username, password)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                return null
            }

    }



}