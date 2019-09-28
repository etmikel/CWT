package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main_page2.*

class MainPage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page2)
        setSupportActionBar(toolbar)



        val contactClick = findViewById(R.id.contactButton) as Button

        contactClick.setOnClickListener {
            val intent = Intent(this, Contacts::class.java)
            startActivity(intent)
        }

        val custClick = findViewById(R.id.custbutton) as Button

        custClick.setOnClickListener {
            val intent = Intent(this, MainPage2::class.java)
            startActivity(intent)
        }

    }

}
