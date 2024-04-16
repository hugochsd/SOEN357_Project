package com.example.soen357

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.buttonLogIn)
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)
        val forgotPasswordButton = findViewById<Button>(R.id.buttonForgotPw)

        loginButton.setOnClickListener {

            val intent = Intent(this, FrontPageActivity::class.java)
            Toast.makeText(this, "Consider signing up", Toast.LENGTH_SHORT).show()

            startActivity(intent)
            finish()

        }

        signUpButton.setOnClickListener {
            val intent = Intent(this, ProfileSetUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        forgotPasswordButton.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}
