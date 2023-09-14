package com.adeebtechlab.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Folder extends AppCompatActivity {



    Button cur, fol, hom, dev,  sha, b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);


        hom = findViewById(R.id.hom);
        cur = findViewById(R.id.cur);
        dev = findViewById(R.id.dev);
        sha = findViewById(R.id.sha);


        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);



        //------------Button----------------------------------------

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Folder.this, MainActivity.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Folder.this, Curses.class);
                startActivity(intent);

            }
        });

        //------------Button----------------------------------------

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Folder.this, Developer.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        sha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Folder.this, Share.class);
                startActivity(intent);

            }
        });







//-----------------Link----Button---------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/photoshop";
                Intent i = new Intent(Folder.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




        //-----------------Link----Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://adeeb-technology-lab.blogspot.com/";
                Intent i = new Intent(Folder.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //-----------------Link----Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/autocad";
                Intent i = new Intent(Folder.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //-----------------Link----Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://arduinokituse.blogspot.com/";
                Intent i = new Intent(Folder.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //-----------------Link----Button---------------------
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://microsoft-office-data.blogspot.com/";
                Intent i = new Intent(Folder.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });






    }
}