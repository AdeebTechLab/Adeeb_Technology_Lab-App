package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Share : AppCompatActivity() {

    // Navigation buttons
    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button

    // App / Sticker / Extension / Software buttons
    private lateinit var downlord_app_bt: Button
    private lateinit var shear_app_bt: Button
    private lateinit var downlord_stiker_app_bt: Button
    private lateinit var shear_stiker_app_bt: Button
    private lateinit var downlord_extention_bt: Button
    private lateinit var shear_extention_bt: Button
    private lateinit var downlord_softwear_bt: Button
    private lateinit var shear_softwear_bt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_share)

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

        // ================= Download & Share Buttons =================
        downlord_app_bt = findViewById(R.id.downlord_app_bt)
        shear_app_bt = findViewById(R.id.shear_app_bt)
        downlord_stiker_app_bt = findViewById(R.id.downlord_stiker_app_bt)
        shear_stiker_app_bt = findViewById(R.id.shear_stiker_app_bt)
        downlord_extention_bt = findViewById(R.id.downlord_extention_bt)
        shear_extention_bt = findViewById(R.id.shear_extention_bt)
        downlord_softwear_bt = findViewById(R.id.downlord_softwear_bt)
        shear_softwear_bt = findViewById(R.id.shear_softwear_bt)

        // ================= Helper function for URL =================
        fun openUrl(url: String) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        fun shareText(message: String) {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, message)
            }
            startActivity(Intent.createChooser(intent, "Share Using"))
        }

        // ================= App Buttons =================
        downlord_app_bt.setOnClickListener {
            openUrl("https://play.google.com/store/apps/details?id=com.adeebtechlab.apps")
        }

        shear_app_bt.setOnClickListener {
            shareText("Download Free Adeeb Technology Lab App: https://play.google.com/store/apps/details?id=com.adeebtechlab.apps")
        }

        downlord_stiker_app_bt.setOnClickListener {
            openUrl("https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker")
        }

        shear_stiker_app_bt.setOnClickListener {
            shareText("Download Free Adeeb Technology Lab WhatsApp Sticker App: https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker")
        }

        downlord_extention_bt.setOnClickListener {
            openUrl("https://chrome.google.com/webstore/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme")
        }

        shear_extention_bt.setOnClickListener {
            shareText("Download Free Adeeb Technology Lab Chrome Extension: https://chrome.google.com/webstore/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme")
        }

        downlord_softwear_bt.setOnClickListener {
            openUrl("https://apps.microsoft.com/detail/9P3369QX7KFX?hl=en-us&gl=PK&ocid=pdpshare")
        }

        shear_softwear_bt.setOnClickListener {
            shareText("Download Free Adeeb Technology Lab Windows Software: https://apps.microsoft.com/detail/9P3369QX7KFX?hl=en-us&gl=PK&ocid=pdpshare")
        }
    }
}
