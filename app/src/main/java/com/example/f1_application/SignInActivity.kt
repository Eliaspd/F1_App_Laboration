package com.example.f1_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnLogIn: Button = findViewById(R.id.btn_logIn)
        val editTextUsername: EditText = findViewById(R.id.editTextUsername)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)

        btnLogIn.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()


            val validUsers = mapOf(

                "1234"  to "0000",
                "user1" to "password1",
                "user2" to "password2"

            )

            if (validUsers.containsKey(username) && validUsers[username] == password) {

                val intent = Intent(this, LoggedInActivity::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)

            } else {
                // Ogiltig inloggning
                Toast.makeText(this, "Ogiltig inloggning", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
