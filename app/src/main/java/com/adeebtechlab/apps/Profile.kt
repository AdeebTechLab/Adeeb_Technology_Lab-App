package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {

    // Bottom Navigation Buttons
    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button

    // Cards
    private lateinit var studentCard: CardView
    private lateinit var internCard: CardView
    private lateinit var jobCard: CardView
    private lateinit var teacherCard: CardView

    // Login Buttons (inside cards)
    private lateinit var studentLoginBtn: Button
    private lateinit var internLoginBtn: Button
    private lateinit var jobLoginBtn: Button
    private lateinit var teacherLoginBtn: Button

    // URL
    private val lmsUrl = "https://lms-adeeb-technology-lab.vercel.app/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // ================= Bottom Nav =================
        homeButton = findViewById(R.id.homeButton)
        downloadButton = findViewById(R.id.downloadButton)
        shareButton = findViewById(R.id.shareButton)
        profileButton = findViewById(R.id.profileButton)
        aboutButton = findViewById(R.id.aboutButton)

        homeButton.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        downloadButton.setOnClickListener {
            startActivity(Intent(this, Download::class.java))
        }

        shareButton.setOnClickListener {
            startActivity(Intent(this, Share::class.java))
        }

        profileButton.setOnClickListener {
            // Already on Profile
        }

        aboutButton.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }

        // ================= Cards =================
        studentCard = findViewById(R.id.youtuber_bt)
        internCard = findViewById(R.id.intern_bt)
        jobCard = findViewById(R.id.Job_bt)
        teacherCard = findViewById(R.id.teacher_bt)

        // ================= Login Buttons =================
        studentLoginBtn = findViewById(R.id.button6)
        internLoginBtn = findViewById(R.id.button7)
        jobLoginBtn = findViewById(R.id.button8)
        teacherLoginBtn = findViewById(R.id.button9)

        // ================= Card Click =================
        studentCard.setOnClickListener { openInBrowser(lmsUrl) }
        internCard.setOnClickListener { openInBrowser(lmsUrl) }
        jobCard.setOnClickListener { openInBrowser(lmsUrl) }
        teacherCard.setOnClickListener { openInBrowser(lmsUrl) }

        // ================= Button Click (FIXED ISSUE) =================
        studentLoginBtn.setOnClickListener { openInBrowser(lmsUrl) }
        internLoginBtn.setOnClickListener { openInBrowser(lmsUrl) }
        jobLoginBtn.setOnClickListener { openInBrowser(lmsUrl) }
        teacherLoginBtn.setOnClickListener { openInBrowser(lmsUrl) }

        // ================= Edge to Edge =================
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }
    }

    // ================= Open Link =================
    private fun openInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}
