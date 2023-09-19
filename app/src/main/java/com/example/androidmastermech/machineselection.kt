package com.example.androidmastermech

import android.widget.*
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View

class machineselection : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var enterMachineButton: Button
    lateinit var removeMachineButton: Button
    lateinit var machineContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machineselection)

        val spinner11 = findViewById<Spinner>(R.id.spinnernumber)
        val spinnermachine = findViewById<Spinner>(R.id.machinetype)
        enterMachineButton = findViewById(R.id.entroptr)
        removeMachineButton = findViewById(R.id.removemac)
        machineContainer = findViewById(R.id.machineContainer)

        // Initially, make the buttons invisible
        enterMachineButton.visibility = View.INVISIBLE
        removeMachineButton.visibility = View.INVISIBLE

        val options = arrayOf(
            "Backhoe Loader",
            "Poclain",
            "Dump truck",
            "Excavator",
            "Crane",
            "Bull dozer"
        )

        // Create an ArrayAdapter and set it as the Spinner's adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnermachine.adapter = adapter

        spinner11.setSelection(0)

        // Handle spinner item selection
        spinner11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                val numberOfMachines = position

                // Clear existing input fields
                machineContainer.removeAllViews()

                // Generate the desired number of input fields for machines 1 to 9
                for (i in 1..numberOfMachines.coerceIn(1, 9)) {
                    val machineEditText = EditText(this@machineselection)
                    machineEditText.setTextColor(Color.WHITE)
                    machineEditText.setBackgroundColor(Color.WHITE)
                    machineEditText.hint = "Machine $i Plate Number"
                    machineEditText.addTextChangedListener(object : TextWatcher {
                        override fun afterTextChanged(s: Editable?) {
                            // Check if all EditText views are filled
                            val allFilled = areAllEditTextsFilled()
                            if (allFilled) {
                                // If all filled, make the buttons visible
                                enterMachineButton.visibility = View.VISIBLE
                                removeMachineButton.visibility = View.VISIBLE
                            } else {
                                // If not all filled, make the buttons invisible
                                enterMachineButton.visibility = View.INVISIBLE
                                removeMachineButton.visibility = View.INVISIBLE
                            }
                        }

                        override fun beforeTextChanged(
                            s: CharSequence?,
                            start: Int,
                            count: Int,
                            after: Int
                        ) {
                        }

                        override fun onTextChanged(
                            s: CharSequence?,
                            start: Int,
                            before: Int,
                            count: Int
                        ) {
                        }
                    })
                    machineContainer.addView(machineEditText)
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                // Handle when nothing is selected
            }
        }
    }

    private fun areAllEditTextsFilled(): Boolean {
        for (i in 0 until machineContainer.childCount) {
            val editText = machineContainer.getChildAt(i) as EditText
            if (editText.text.toString().trim().isEmpty()) {
                return false
            }
        }
        return true
    }
}
//  ------------------------------------------------------------------------

// Determine which machine image to display
//                    when (selectedMachine) {
//                        "Backhoe Loader" -> setMachineImage(R.drawable.backhoeloader)
//                        "Dump truck" -> setMachineImage(R.drawable.dumptruck)
//                        "Excavator" -> setMachineImage(R.drawable.excavator)
//                        "Crane" -> setMachineImage(R.drawable.crane)
//                        "Bull dozer" -> setMachineImage(R.drawable.bulldozer)
//
//
//
//                        // Add cases for other machine typesxxxxxxxxxxxxxxxx
//                        else -> setMachineImage(R.drawable.car_img) // Default image if not found
//                    }



// Handle item selection here
// val selectedItem = parentView.getItemAtPosition(position).toString()
// Do something with the selected item

//
//                fun setMachineImage(imageResource: Int) {
//                    imageView = findViewById(R.id.imageviewMAchine)
//                    imageView.setImageResource(imageResource)
//
//
//
//                }
