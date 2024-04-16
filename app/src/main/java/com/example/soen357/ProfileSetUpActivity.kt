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

class ProfileSetUpActivity : AppCompatActivity() {
    private var name: String = ""
    private var user: String = ""
    private var email: String = ""
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
        setContentView(R.layout.activity_profile_set_up)

        val backButton = findViewById<Button>(R.id.button)
        val saveButton = findViewById<Button>(R.id.buttonLogIn2)
        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val emailEditText = findViewById<EditText>(R.id.editTextUser2)
        val usernameEditText = findViewById<EditText>(R.id.editTextUser)
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Retrieve the name and image URI from the intent extras
        name = intent.getStringExtra("NAME") ?: ""
        user = intent.getStringExtra("USER") ?: ""
        email = intent.getStringExtra("EMAIL") ?: ""
        val imageUriString = intent.getStringExtra("IMAGE_URI")
        imageUri = imageUriString?.let { Uri.parse(it) }
        user = intent.getStringExtra("USER") ?: ""

        // Set the name in the EditText
        nameEditText.setText(name)
        usernameEditText.setText(user)
        emailEditText.setText(email)

        // Set the image in the ImageView
        imageUri?.let { imageView.setImageURI(it) }

        backButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        saveButton.setOnClickListener {
            name = nameEditText.text.toString()
            user = usernameEditText.text.toString()
            email = emailEditText.text.toString()

            if (name.isNotEmpty() && user.isNotEmpty() && email.isNotEmpty()) {
                Toast.makeText(this, "Name saved: $name", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, FrontPageActivity::class.java).apply {
                    putExtra("NAME", name)
                    putExtra("USER", user)
                    putExtra("EMAIL", email)
                    putExtra("IMAGE_URI", imageUri?.toString())
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Fill your info first", Toast.LENGTH_SHORT).show()
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