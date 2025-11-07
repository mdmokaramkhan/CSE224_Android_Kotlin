package com.example.cse224

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("LifeCycle", "onStart Called")
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val hello = findViewById<Button>(R.id.search_go_btn)

        hello.setOnClickListener {
            val linearActivity = Intent(this, LinearLayout::class.java)
            startActivity(linearActivity);
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onStart Called")
        Toast.makeText(this,"onStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop Called")
        Toast.makeText(this, "onStop Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume Called")
        Toast.makeText(this, "OnResume called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onStart Called")
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onStart Called")
        Toast.makeText(this, "onRestart called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy Called")
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_SHORT).show()
    }
}