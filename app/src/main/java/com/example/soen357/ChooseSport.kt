package com.example.soen357

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChooseSport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_choose_sport)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton = findViewById<Button>(R.id.button2)
        val JoinOrCreate = intent.getBooleanExtra("JOINorCREATE", false)
        backButton.setOnClickListener {
            finish()
        }

        val buttonBadminton = findViewById<Button>(R.id.buttonBadmitten)
        val buttonPickleBall = findViewById<Button>(R.id.buttonPickleBall)
        val buttonSquash = findViewById<Button>(R.id.buttonSquash)
        val buttonPingPong = findViewById<Button>(R.id.buttonPingPong)
        val buttonTennis = findViewById<Button>(R.id.buttonTennis)

        val buttonIds = listOf(
            buttonBadminton,
            buttonPickleBall,
            buttonSquash,
            buttonPingPong,
            buttonTennis
        )

        buttonIds.forEach { button ->
            button.setOnClickListener {
                if (JoinOrCreate){
                    val intent = Intent(this, PickCourt::class.java)
                    intent.putExtra("SPORT_ID", button.id)
                    startActivity(intent)
                }
                else{
                    val intent = Intent(this, PickCourt::class.java) // NEEDS TO BE CHANGED FOR THE PICK A GAME ACTIVITY
                    intent.putExtra("SPORT_ID", button.id)
                    startActivity(intent)
                }

            }
        }
    }
}