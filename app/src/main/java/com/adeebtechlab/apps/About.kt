package com.adeebtechlab.apps

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class About : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)

        // Handle Edge-to-Edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize Buttons (ensure IDs exist in activity_about.xml)
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

        // Initialize WebView
        webView = findViewById(R.id.webView)

// Enable desktop mode
        webView.settings.apply {
            javaScriptEnabled = true // Enable JavaScript
            loadWithOverviewMode = true // Load content to fit the view
            useWideViewPort = true // Enable wide viewport
            setSupportZoom(true) // Enable zoom
            builtInZoomControls = true // Enable zoom controls
            displayZoomControls = false // Hide zoom buttons
        }

// Set custom user agent for desktop mode
        val newUserAgent = webView.settings.userAgentString.replace("Mobile", "Desktop").replace("Android", "Windows")
        webView.settings.userAgentString = newUserAgent

// Load URL
        webView.webViewClient = WebViewClient() // Open links inside WebView
        webView.loadUrl("https://adeebtechlab.blogspot.com/")


    }
}
