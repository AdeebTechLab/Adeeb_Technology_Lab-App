package com.adeebtechlab.apps;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button cur, fol, hom, dev,  sha,  b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;

        cur = findViewById(R.id.cur);
        fol = findViewById(R.id.fol);
        dev = findViewById(R.id.dev);
        sha = findViewById(R.id.sha);



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




 //------------Button----------------------------------------

        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Curses.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        fol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Folder.class);
                startActivity(intent);

            }
        });

        //------------Button----------------------------------------

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Developer.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        sha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Share.class);
                startActivity(intent);

            }
        });








//---------------------Button---------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWnwn0hSRLrBB6arZiMrdpK";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUKxB8g_3npZSowAPOyG62i";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUx-0I_xU66wpE_7SqWygc3";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXiXkq959ql0ObiBdCUIDcI";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVeruihPqreaCywHvfkNTaQ";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUCMAWV03IfhbOlctwXqqNy";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




//---------------------Button---------------------
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pUmbtCBwA_CA8aX-0-M1THG";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pU9XHMLe8UIUYIE82IXt6Hz";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pXKxiVZTv91OlN81gyBpgZQ";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




//---------------------Button---------------------
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pULOQRYV7WHYVFXrfkW-0RX";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWoEJbho8mCQJjQo0RJKaP0";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pWt9tK5cUKXedFPdGcKi1ek";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



//---------------------Button---------------------
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pW7wpZz5VcM2vvVaEKZdDax";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/@SalmanAdeebVLOGS/shorts";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


//---------------------Button---------------------
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLOkWSy5Ba4pVqWFOfHxwD98XLnW-o6XxS";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



    }
}