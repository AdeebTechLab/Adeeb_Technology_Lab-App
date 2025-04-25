package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {

    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)



// Initialize Buttons inside onCreate AFTER setContentView
        homeButton = findViewById(R.id.homeButton)
        downloadButton = findViewById(R.id.downloadButton)
        shareButton = findViewById(R.id.shareButton)
        profileButton = findViewById(R.id.profileButton)
        aboutButton = findViewById(R.id.aboutButton)




        // Set click listeners
        homeButton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        downloadButton.setOnClickListener {
            val intent = Intent(this, Download::class.java)
            startActivity(intent)
        }

        shareButton.setOnClickListener {
            val intent = Intent(this, Share::class.java)
            startActivity(intent)
        }

        profileButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        aboutButton.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }



        // Button ko initialize karen
        val socialMediaButton: Button = findViewById(R.id.socheal_media_bt)

        // Button click listener
        socialMediaButton.setOnClickListener {
            // Website URL define karen
            val websiteUrl = "https://adeebtechlab.blogspot.com/"

            // Intent ke zariye URL open karen
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}