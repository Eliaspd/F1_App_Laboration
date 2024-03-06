package com.example.f1_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.f1_application.MainActivity
import com.example.f1_application.R

class LoggedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val textViewWelcome: TextView = findViewById(R.id.textViewWelcome)
        val btnLogout: Button = findViewById(R.id.btn_logout)

        // Retrieve the username from Intent
        val username = intent.getStringExtra("USERNAME")

        // Update textViewWelcome with the actual username
        textViewWelcome.text = "Welcome, $username!"

        btnLogout.setOnClickListener {
            // Navigate back to the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish the current activity to remove it from the stack
        }
    }
}

