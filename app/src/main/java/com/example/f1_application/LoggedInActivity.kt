package com.example.f1_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoggedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val textViewWelcome: TextView = findViewById(R.id.textViewWelcome)
        val btnLogout: Button = findViewById(R.id.btn_logout)

        val username = intent.getStringExtra("USERNAME")

        textViewWelcome.text = "Welcome, $username!"

        btnLogout.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}

