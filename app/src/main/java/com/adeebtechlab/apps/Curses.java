package com.adeebtechlab.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Curses extends AppCompatActivity {


    Button  fol, hom, dev,  sha,b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,b16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curses);




        fol = findViewById(R.id.fol);
        dev = findViewById(R.id.dev);
        sha = findViewById(R.id.sha);
        hom = findViewById(R.id.hom);


        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
        b15 = findViewById(R.id.button15);
        b16 = findViewById(R.id.button16);




        //------------Button----------------------------------------

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Curses.this, MainActivity.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        fol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Curses.this, Folder.class);
                startActivity(intent);

            }
        });

        //------------Button----------------------------------------

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Curses.this, Developer.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        sha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Curses.this, Share.class);
                startActivity(intent);

            }
        });

















//---------------------Button---------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVDUlBhnVwaZNKvoMTOE0tS";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pW5V-yDyC5cy803bttuStuy";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXK2ULiKOTyxn1EsDmWbe7X";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUpnW7jyQpINQgqq1HtOqt8";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXea1K_5lQMADrjiOA-s9iD";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVDTQDuZHaTqp-UAaYQv7n8";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




//---------------------Button---------------------
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWzshzBAkmya5xg1awbQOPa";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVZmOZlFBi6q8SRzMknZFt0";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUSTlL0A2_XpTPuClCYNArB";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




//---------------------Button---------------------
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVPM2RxXZZt_i56_jMU2Bze";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXQn3UbzmIImEQSnKkMfEI-";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUIyChwAkqdJdj_bEKKqG6B";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



//---------------------Button---------------------
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXXB0vHxSC0aVlCIBN5pTDI";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUzj2L6WXEegGHoerGuX94H";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXv7LN0YdG-xCBP54eoedUn";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        //---------------------Button---------------------
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXjtq64Bu4Qa_g0V9K3LJBl";
                Intent i = new Intent(Curses.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });











    }
}