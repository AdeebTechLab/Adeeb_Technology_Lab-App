package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Share : AppCompatActivity() {

    private lateinit var downlord_app_bt: Button
    private lateinit var shear_app_bt: Button
    private lateinit var downlord_stiker_app_bt: Button
    private lateinit var shear_stiker_app_bt: Button
    private lateinit var downlord_extention_bt: Button
    private lateinit var shear_extention_bt: Button
    private lateinit var downlord_softwear_bt: Button
    private lateinit var shear_softwear_bt: Button



    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_share)

        // Handle Edge-to-Edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



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



        // Initialize Buttons
        downlord_app_bt = findViewById(R.id.downlord_app_bt)
        shear_app_bt = findViewById(R.id.shear_app_bt)
        downlord_stiker_app_bt = findViewById(R.id.downlord_stiker_app_bt)
        shear_stiker_app_bt = findViewById(R.id.shear_stiker_app_bt)
        downlord_extention_bt = findViewById(R.id.downlord_extention_bt)
        shear_extention_bt = findViewById(R.id.shear_extention_bt)
        downlord_softwear_bt = findViewById(R.id.downlord_softwear_bt)
        shear_softwear_bt = findViewById(R.id.shear_softwear_bt)

        // Downloader Button - b1
        downlord_app_bt.setOnClickListener {
            val url = "https://play.google.com/store/apps/details?id=com.adeebtechlab.apps"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Share Button - b11
        shear_app_bt.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Download Free Adeeb Technology Lab App: https://play.google.com/store/apps/details?id=com.adeebtechlab.apps")
            }
            startActivity(Intent.createChooser(intent, "Share Using"))
        }

        // Toast Message for b2
        downlord_stiker_app_bt.setOnClickListener {
            val url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Toast Message for b22
        shear_stiker_app_bt.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Download Free Adeeb Technology Lab Whatsapp Sticker app: https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker")
            }
            startActivity(Intent.createChooser(intent, "Share Using"))
        }

        // Downloader Button - b3
        downlord_extention_bt.setOnClickListener {
            val url = "https://chromewebstore.google.com/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Share Button - b33
        shear_extention_bt.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Download Free Adeeb Technology Lab Chrome Extension: https://chromewebstore.google.com/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme")
            }
            startActivity(Intent.createChooser(intent, "Share Using"))
        }

        // Downloader Button - b4
        downlord_softwear_bt.setOnClickListener {
            val url = "https://apps.microsoft.com/detail/9P3369QX7KFX?hl=en-us&gl=PK&ocid=pdpshare"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Share Button - b44
        shear_softwear_bt.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Download Free Adeeb Technology Lab Window Softwear: https://apps.microsoft.com/detail/9P3369QX7KFX?hl=en-us&gl=PK&ocid=pdpshare")
            }
            startActivity(Intent.createChooser(intent, "Share Using"))
        }
    }
}
