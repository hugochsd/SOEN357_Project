package com.example.soen357

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FrontPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

        val name = intent.getStringExtra("NAME")
        val user = intent.getStringExtra("USER")
        val email = intent.getStringExtra("EMAIL")
        val imageUriString = intent.getStringExtra("IMAGE_URI")

        findViewById<TextView>(R.id.textView2).text = name

        imageUriString?.let {
            val imageUri = Uri.parse(imageUriString)
            findViewById<ImageView>(R.id.imageView2).setImageURI(imageUri)
        }

        findViewById<Button>(R.id.buttonProfile).setOnClickListener {
            val profileIntent = Intent(this, ProfileSetUpActivity::class.java).apply {//CHANGE THIS TO GO TO THE PROFILE ACTIVITY
                putExtra("NAME", name)
                putExtra("USER", user)
                putExtra("EMAIL", email)
                putExtra("IMAGE_URI", imageUriString)
            }
            //startActivity(profileIntent)
            Toast.makeText(this, "Need to connect with variables to profile activity", Toast.LENGTH_SHORT).show()
        }



        // FIND COURT -> pick a sport -> court -> time -> reservation
        findViewById<Button>(R.id.buttonFindCourt).setOnClickListener {
            val profileIntent = Intent(this, ChooseSport::class.java).apply {
                putExtra("JOINorCREATE", false) // False for find court, true for join game
            }
            startActivity(profileIntent)
        }

        // JOIN GAME -> pick a sport -> pick a game -> joined game
        findViewById<Button>(R.id.buttonJoinGame).setOnClickListener {
            val profileIntent = Intent(this, ChooseSport::class.java).apply {
                putExtra("JOINorCREATE", true) // False for find court, true for join game
            }
            startActivity(profileIntent)
        }

        // THESE NEED TO BE ADJUSTED
        findViewById<Button>(R.id.buttonMessages).setOnClickListener {
            // Show a toast indicating that messages activity needs to be added
            Toast.makeText(this, "Add messages activity", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.buttonFindPlayer).setOnClickListener {
            // Show a toast indicating that find player activity needs to be added
            Toast.makeText(this, "Add find player activity", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.buttonMyGames).setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

    }
}