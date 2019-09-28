package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(toolbar)
        val registerClick = findViewById(R.id.registerButton) as Button

        registerClick.setOnClickListener {
            val intent = Intent(this, MainPage2::class.java)
            startActivity(intent)
        }
        val backClick = findViewById(R.id.backButton) as Button

        backClick.setOnClickListener {
            val intent1 = Intent(this, LoginScreen::class.java)
            startActivity(intent1)
        }


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
