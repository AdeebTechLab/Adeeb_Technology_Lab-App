package com.adeebtechlab.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Share extends AppCompatActivity {


    Button cur, fol, hom, dev, sha, b1, b11, b2, b22, b3, b33, b4, b44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);


        hom = findViewById(R.id.hom);
        fol = findViewById(R.id.fol);
        dev = findViewById(R.id.dev);
        cur = findViewById(R.id.cur);


        b1 = findViewById(R.id.button1);
        b11 = findViewById(R.id.button11);
        b2 = findViewById(R.id.button2);
        b22 = findViewById(R.id.button22);
        b3 = findViewById(R.id.button3);
        b33 = findViewById(R.id.button33);
        b4 = findViewById(R.id.button4);
        b44 = findViewById(R.id.button44);



        //------------Button----------------------------------------

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, MainActivity.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        fol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, Folder.class);
                startActivity(intent);

            }
        });

        //------------Button----------------------------------------

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, Developer.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, Curses.class);
                startActivity(intent);

            }
        });





        //---------------------------Downloader-----Button---------------------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.adeebtechlab.apps";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




//---------------------------Share-----Button---------------------------------
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download This App";
                String Sub = "Download Free Adeeb Technology Lab App:          https://play.google.com/store/apps/details?id=com.adeebtechlab.apps";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share Using"));

            }
        });





        //---------------------------Downloader-----Button---------------------------------
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View view) {
                                      Toast.makeText(getApplicationContext(), "software coming soon", Toast.LENGTH_LONG).show();
                                  }
                              });




//---------------------------Share-----Button---------------------------------

            b22.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "software coming soon", Toast.LENGTH_LONG).show();
                }
            });




        //---------------------------Downloader-----Button---------------------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://chromewebstore.google.com/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




//---------------------------Share-----Button---------------------------------
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download This App";
                String Sub = "Download Free Adeeb Technology Lab chrome extension:          https://chromewebstore.google.com/detail/adeeb-technology-lab/hmgnckmfplfccnkinmmlmicpldfpnhme";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share Using"));

            }
        });



        //---------------------------Downloader-----Button---------------------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




//---------------------------Share-----Button---------------------------------
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download This App";
                String Sub = "Download Free Adeeb Technology Lab Sticker App:          https://play.google.com/store/apps/details?id=com.AdeebTechLab.AdeebTechLabSticker";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share Using"));

            }
        });



    }
}