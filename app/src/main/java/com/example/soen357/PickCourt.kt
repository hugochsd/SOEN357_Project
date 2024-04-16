package com.example.soen357

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.sql.Time

class PickCourt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pick_court)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backButton = findViewById<Button>(R.id.button3)

        backButton.setOnClickListener {
            finish()
        }

        val buttonIds = listOf(
            R.id.button12,
            R.id.button11,
            R.id.button7,
            R.id.button6,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button5,
            R.id.button4
        )

        for (buttonId in buttonIds) {
            val button = findViewById<Button>(buttonId)
            button.setOnClickListener {
                val intent = Intent(this, TimeActivity::class.java)
                startActivity(intent)
            }
        }

    }
}