package com.example.trustinabreeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_edit_contact.*

class editContact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_contact)
        setSupportActionBar(toolbar)



        val loginClick = findViewById(R.id.savebutton) as Button

        loginClick.setOnClickListener {
            val intent = Intent(this, MainPage2::class.java)
            startActivity(intent)
        }
    }

}
