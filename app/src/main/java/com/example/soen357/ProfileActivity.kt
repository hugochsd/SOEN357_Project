package com.example.soen357

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private var name: String = ""
    private var imageUri: Uri? = null
    private var isFromLoginPage: Boolean = false

    private val getImageContent =
        registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            uri?.let {
                // Image selected, set it to the ImageView
                imageUri = uri
                findViewById<ImageView>(R.id.imageView).setImageURI(uri)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Check if the activity was opened from the login page
        isFromLoginPage = intent.getBooleanExtra("FROM_LOGIN_PAGE", false)

        val backButton = findViewById<Button>(R.id.button)
        val saveButton = findViewById<Button>(R.id.buttonLogIn2)
        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val isFromLoginPage = intent.getBooleanExtra("FROM_LOGIN_PAGE", true)

        // Retrieve the name and image URI from the intent extras
        name = intent.getStringExtra("NAME") ?: ""
        val imageUriString = intent.getStringExtra("IMAGE_URI")
        imageUri = imageUriString?.let { Uri.parse(it) }

        // Set the name in the EditText
        nameEditText.setText(name)

        // Set the image in the ImageView
        imageUri?.let { imageView.setImageURI(it) }

        backButton.setOnClickListener {
            if (isFromLoginPage) {
                // If opened from the login page, go back to the login page
                startActivity(Intent(this, LoginActivity::class.java))
            } else {
                // If opened from the front page, go back to the front page
                val intent = Intent(this, FrontPageActivity::class.java).apply {
                    putExtra("NAME", name)
                    putExtra("IMAGE_URI", imageUri?.toString())
                }
                startActivity(intent)
            }
        }

        saveButton.setOnClickListener {
            name = nameEditText.text.toString()

            if (name.isNotEmpty()) {
                Toast.makeText(this, "Name saved: $name", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, FrontPageActivity::class.java).apply {
                    putExtra("NAME", name)
                    putExtra("IMAGE_URI", imageUri?.toString())
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()
            }
        }

        imageView.setOnClickListener {
            getImageContent.launch("image/*")
        }
    }

    fun onSelectImageClicked(view: ImageView) {
        getImageContent.launch("image/*")
    }
}