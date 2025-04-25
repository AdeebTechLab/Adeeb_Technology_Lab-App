package com.adeebtechlab.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {

    private lateinit var homeButton: Button
    private lateinit var downloadButton: Button
    private lateinit var shareButton: Button
    private lateinit var profileButton: Button
    private lateinit var aboutButton: Button


    private lateinit var solutionMore: TextView
    private lateinit var solutionButton: LinearLayout
    private lateinit var cursesMore: TextView
    private lateinit var cursesButton: LinearLayout




    private lateinit var ply_phone: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)



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




        // Handle Edge-to-Edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //    notifcation icon ====================================================================


        // Initialize Button
        val notificationButton: Button = findViewById(R.id.notifcation_bt)

        // Set OnClickListener
        notificationButton.setOnClickListener {
            // Define the URL to open
            val websiteUrl = "https://www.youtube.com/@AdeebTechLab/videos"

            // Create an intent to open the link in the browser
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        //    playlist =============================================================================


        // LinearLayout for Phone
        val plyPhoneLayout: LinearLayout = findViewById(R.id.ply_phone)
        plyPhoneLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWnwn0hSRLrBB6arZiMrdpK"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for Laptop
        val plyLaptopLayout: LinearLayout = findViewById(R.id.ply_laptop)
        plyLaptopLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUx-0I_xU66wpE_7SqWygc3"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for Unboxing
        val plyUnboxingLayout: LinearLayout = findViewById(R.id.ply_unboxing)
        plyUnboxingLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUKxB8g_3npZSowAPOyG62i"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for Internet
        val plyInternetLayout: LinearLayout = findViewById(R.id.ply_net)
        plyInternetLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pU9XHMLe8UIUYIE82IXt6Hz"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for WhatsApp
        val plyWhatsAppLayout: LinearLayout = findViewById(R.id.ply_whatsapp)
        plyWhatsAppLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVeruihPqreaCywHvfkNTaQ"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for Facebook
        val plyFacebookLayout: LinearLayout = findViewById(R.id.ply_facbook)
        plyFacebookLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXiXkq959ql0ObiBdCUIDcI"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // LinearLayout for Game
        val plyGameLayout: LinearLayout = findViewById(R.id.ply_game)
        plyGameLayout.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUmbtCBwA_CA8aX-0-M1THG"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }




        //    Slutions =============================================================================


        // List of CardView IDs and their URLs
        val cardViewMappings = mapOf(
            R.id.phone_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWnwn0hSRLrBB6arZiMrdpK",
            R.id.unboxing_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUKxB8g_3npZSowAPOyG62i",
            R.id.computer_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUx-0I_xU66wpE_7SqWygc3",
            R.id.facebook_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXiXkq959ql0ObiBdCUIDcI",
            R.id.whatsapp_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVeruihPqreaCywHvfkNTaQ",
            R.id.gmail_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUCMAWV03IfhbOlctwXqqNy",
            R.id.game_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUmbtCBwA_CA8aX-0-M1THG",
            R.id.net_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pU9XHMLe8UIUYIE82IXt6Hz",
            R.id.simcard_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXKxiVZTv91OlN81gyBpgZQ",
            R.id.gadgets_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pULOQRYV7WHYVFXrfkW-0RX",
            R.id.onlineearninig_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWoEJbho8mCQJjQo0RJKaP0",
            R.id.tips_bt to "https://www.youtube.com/@AdeebTechLab/shorts",


            //    Curses ===========================================================================

            R.id.youtuber_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWzshzBAkmya5xg1awbQOPa",
            R.id.photosho_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVDUlBhnVwaZNKvoMTOE0tS",
            R.id.iot_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVZmOZlFBi6q8SRzMknZFt0",
            R.id.primearpro_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pW5V-yDyC5cy803bttuStuy",
            R.id.illustrator_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXK2ULiKOTyxn1EsDmWbe7X",
            R.id.aftereffects_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUpnW7jyQpINQgqq1HtOqt8",
            R.id.coreldraw_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXea1K_5lQMADrjiOA-s9iD",
            R.id.inpage_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVDTQDuZHaTqp-UAaYQv7n8",
            R.id.kalilinuxs_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUSTlL0A2_XpTPuClCYNArB",
            R.id.acutocad_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVPM2RxXZZt_i56_jMU2Bze",
            R.id.chiefarchitect_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXQn3UbzmIImEQSnKkMfEI-",
            R.id.website_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUIyChwAkqdJdj_bEKKqG6B",
            R.id.word_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXXB0vHxSC0aVlCIBN5pTDI",
            R.id.excel_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUzj2L6WXEegGHoerGuX94H",
            R.id.powepoint_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXv7LN0YdG-xCBP54eoedUn",
            R.id.publisher_bt to "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXjtq64Bu4Qa_g0V9K3LJBl"


        )

        // Set onClickListeners for all CardViews
        cardViewMappings.forEach { (cardViewId, url) ->
            val cardView: CardView = findViewById(cardViewId)
            cardView.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }












        // Initialize views
        solutionMore = findViewById(R.id.solutionMore)
        solutionButton = findViewById(R.id.solutionButton)
        cursesMore = findViewById(R.id.cursesMore)
        cursesButton = findViewById(R.id.cursesButton)

        // Set OnClickListener for solutionMore TextView
        solutionMore.setOnClickListener {
            if (solutionButton.visibility == View.VISIBLE) {
                solutionButton.visibility = View.GONE // Hide buttons
                solutionMore.text = "See more.." // Update text
            } else {
                solutionButton.visibility = View.VISIBLE // Show buttons
                solutionMore.text = "See less.." // Update text
            }
        }

        // Set OnClickListener for cursesMore TextView
        cursesMore.setOnClickListener {
            if (cursesButton.visibility == View.VISIBLE) {
                cursesButton.visibility = View.GONE // Hide buttons
                cursesMore.text = "See more.." // Update text
            } else {
                cursesButton.visibility = View.VISIBLE // Show buttons
                cursesMore.text = "See less.." // Update text
            }
        }
    }
}

