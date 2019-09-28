package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val loginClick = findViewById(R.id.loginbutton) as Button

        loginClick.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
        val registerClick = findViewById(R.id.registerbutton) as Button

        registerClick.setOnClickListener {
            val intent1 = Intent(this, Register::class.java)
            startActivity(intent1)
        }



        }


    }





