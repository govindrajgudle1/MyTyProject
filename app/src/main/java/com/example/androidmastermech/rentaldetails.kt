package com.example.androidmastermech

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class rentaldetails : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var mainbutton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rentaldetails)


        val intent = intent
        if (intent != null && intent.hasExtra("selectedMachine")) {
            val selectedMachine = intent.getStringExtra("selectedMachine")
            // Now you have the selected machine value in the 'selectedMachine' variable
            // You can use it as needed in your "rentaldetails" activity


            when (selectedMachine) {
                "Backhoe Loader" -> setMachineImage(R.drawable.backhoeloader)
                "Dump truck" -> setMachineImage(R.drawable.dumptruck)
                "Excavator" -> setMachineImage(R.drawable.excavator)
                "Crane" -> setMachineImage(R.drawable.crane)
                "Bull dozer" -> setMachineImage(R.drawable.bulldozer)



                // Add cases for other machine typesxxxxxxxxxxxxxxxx
                else -> setMachineImage(R.drawable.car_img) // Default image if not found
            }

            mainbutton = findViewById(R.id.assignnow)
            mainbutton.setOnClickListener {
                // Code to be executed when the operatnew is clicked
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }



        }




    }

    fun setMachineImage(imageResource: Int) {
        imageView = findViewById(R.id.imageviewMAchine)
        imageView.setImageResource(imageResource)



    }

}