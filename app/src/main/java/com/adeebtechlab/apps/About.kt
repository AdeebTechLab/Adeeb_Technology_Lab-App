package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class About : AppCompatActivity() {

    // Navigation buttons
    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button

    // Social media button
    private lateinit var sochealMediaButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)

        // ================= Navigation Buttons =================
        homeButton = findViewById(R.id.homeButton)
        downloadButton = findViewById(R.id.downloadButton)
        shareButton = findViewById(R.id.shareButton)
        profileButton = findViewById(R.id.profileButton)
        aboutButton = findViewById(R.id.aboutButton)

        homeButton.setOnClickListener { startActivity(Intent(this, Home::class.java)) }
        downloadButton.setOnClickListener { startActivity(Intent(this, Download::class.java)) }
        shareButton.setOnClickListener { startActivity(Intent(this, Share::class.java)) }
        profileButton.setOnClickListener { startActivity(Intent(this, Profile::class.java)) }
        aboutButton.setOnClickListener { startActivity(Intent(this, About::class.java)) }

        // ================= Social Media Button =================
        sochealMediaButton = findViewById(R.id.socheal_media_bt)
        sochealMediaButton.setOnClickListener {
            val url = "https://www.adeebtechlab.com/" // Replace with your social media link
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        // ================= Edge-to-Edge Insets =================
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }
    }
}
