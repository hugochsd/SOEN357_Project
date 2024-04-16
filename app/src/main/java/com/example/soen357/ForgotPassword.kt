package com.example.soen357

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val backButton = findViewById<Button>(R.id.button)
        val sendButton = findViewById<Button>(R.id.buttonSend)
        val emailEditText = findViewById<EditText>(R.id.editTextForgotEmail)


        backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        sendButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isNotEmpty()){
                Toast.makeText(this, "Email with instructions sent", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() //
            }
            else{
                Toast.makeText(this, "Enter your email first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}