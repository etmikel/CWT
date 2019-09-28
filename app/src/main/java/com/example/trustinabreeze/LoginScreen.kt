package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        setSupportActionBar(toolbar)
        val loginClick = findViewById(R.id.addbutton) as Button

        loginClick.setOnClickListener {
            val intent = Intent(this, MainPage2::class.java)
            startActivity(intent)
        }

    }

}
