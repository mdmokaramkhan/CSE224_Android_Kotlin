package com.example.cse224

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.get

class EligibilityChecker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eligibility_checker)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etTenth = findViewById<EditText>(R.id.et_ten_marks)
        val etTwelth = findViewById<EditText>(R.id.et_twelfth_marks)
        val etCgpa = findViewById<EditText>(R.id.et_current_cgpa)

        val rdYes = findViewById<RadioGroup>(R.id.rd_group)

        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val btnReset = findViewById<Button>(R.id.btn_reset)

        btnSubmit.setOnClickListener {

            if(etTenth.text.isEmpty())
                etTenth.setError("Required")
            if (etTwelth.text.isEmpty())
                etTwelth.setError("Required")
            if (etCgpa.text.isEmpty())
                etCgpa.setError("Required")

            if(!etTenth.text.isEmpty() && !etTwelth.text.isEmpty() && !etCgpa.text.isEmpty()) {
                val ten = etTenth.text.toString().toDouble()
                val two = etTwelth.text.toString().toDouble()
                val cgpa = etCgpa.text.toString().toDouble()

                if (ten > 75 && two > 75 && cgpa > 7.5) {
                    println("Eligible")
                } else {
                    println("Not eligible")
                }
            }
        }

        btnReset.setOnClickListener {
            etTenth.setText("")
            etTwelth.setText("")
            etCgpa.setText("")
            rdYes.clearCheck()
        }
    }
}