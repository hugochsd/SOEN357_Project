package com.example.soen357

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
            startActivity(intent)
        }

        signUpButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordButton.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}
