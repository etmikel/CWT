package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contact3.*

class Contacts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)
        val loginClick = findViewById(R.id.addbutton) as Button

        loginClick.setOnClickListener {
            val intent = Intent(this, editContact::class.java)
            startActivity(intent)
        }

    }




}
