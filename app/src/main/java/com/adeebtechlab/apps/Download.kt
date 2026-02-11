package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Download : AppCompatActivity() {

    // Navigation buttons
    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button

    // URL buttons
    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var b4: Button
    private lateinit var b5: Button
    private lateinit var b6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_download)

        // ================= Edge-to-Edge padding =================
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ================= Navigation buttons =================
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

        // ================= URL buttons =================
        b1 = findViewById(R.id.button1)
        b2 = findViewById(R.id.button2)
        b3 = findViewById(R.id.button3)
        b4 = findViewById(R.id.button4)
        b5 = findViewById(R.id.button5)
        b6 = findViewById(R.id.button6)

        b1.setOnClickListener { openUrl("https://salmanadeeb.wixsite.com/photoshop") }
        b2.setOnClickListener { openUrl("https://adeeb-technology-lab.blogspot.com/") }
        b3.setOnClickListener { openUrl("https://salmanadeeb.wixsite.com/autocad") }
        b4.setOnClickListener { openUrl("https://arduinokituse.blogspot.com/") }
        b5.setOnClickListener { openUrl("https://microsoft-office-data.blogspot.com/") }
        b6.setOnClickListener { openUrl("https://salmanadeeb.wixsite.com/dae-cit-books/bookstore") }
    }

    // ================= Helper function =================
    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
