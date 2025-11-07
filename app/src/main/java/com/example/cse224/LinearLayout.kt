package com.example.cse224

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linear_layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nameEt = findViewById<EditText>(R.id.et_name)
        val ageEt = findViewById<EditText>(R.id.et_age)
        val regEt = findViewById<EditText>(R.id.et_regno)

        val btnSignup = findViewById<Button>(R.id.btn_signup)
        val btnReset = findViewById<Button>(R.id.btn_reset)

        val result = findViewById<TextView>(R.id.result)

        btnSignup.setOnClickListener {
            "${nameEt.text}, ${ageEt.text}".also { result.text = it }
        }

        btnReset.setOnClickListener {
            val linearActivity = Intent(this, RelativeLayout_Calculator::class.java)
            startActivity(linearActivity);
        }
    }
}