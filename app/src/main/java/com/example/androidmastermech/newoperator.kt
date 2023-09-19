package com.example.androidmastermech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox


class newoperator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newoperator)

        val checkBox11 = findViewById<CheckBox>(R.id.checkBox11)
        val checkBox12 = findViewById<CheckBox>(R.id.checkBox12)
        val checkBox13 = findViewById<CheckBox>(R.id.checkBox13)
        val checkBox14 = findViewById<CheckBox>(R.id.checkBox14)
        val checkBox15 = findViewById<CheckBox>(R.id.checkBox15)
        val checkBox18 = findViewById<CheckBox>(R.id.checkBox18)
        val checkBox19 = findViewById<CheckBox>(R.id.checkBox19)
        val checkBox20 = findViewById<CheckBox>(R.id.checkBox20)
        val uploadDataButton = findViewById<Button>(R.id.operatorNew)

        // List of checkboxes
        val checkBoxes = listOf(
            checkBox11, checkBox12, checkBox13, checkBox14,
            checkBox15, checkBox18, checkBox19, checkBox20
        )

        // Set an OnClickListener for the "Upload Data" button
        uploadDataButton.setOnClickListener {
            // Handle the button click event here
            // This code will run when the button is clicked.
        }

        // Set OnCheckedChangeListener for each checkbox
        for (checkBox in checkBoxes) {
            checkBox.setOnCheckedChangeListener { _, _ ->
                // Check if at least one checkbox is checked
                val atLeastOneChecked = checkBoxes.any { it.isChecked }

                // Show or hide the "Upload Data" button accordingly
                uploadDataButton.visibility = if (atLeastOneChecked) View.VISIBLE else View.GONE
            }
        }

        var newOpt = findViewById<Button>(R.id.operatorNew)
        newOpt.setOnClickListener{
            // Code to be executed when the operatnew is clicked
            val intent = Intent(this, machineselection::class.java)
            startActivity(intent)
    }
}}




