package com.example.perfectplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class homepage extends AppCompatActivity {

    private TextView Basics, Chords, Scales, Strumming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        setUp();

        //Basics
        Basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Basics.class );
                startActivity(intent);
            }
        });

        //Chords
        Chords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Chords.class );
                startActivity(intent);
            }
        });

        //Scales
        Scales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Scales.class );
                startActivity(intent);
            }
        });

        //Strumming
        Strumming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Strumming.class );
                startActivity(intent);
            }
        });



    }

    private void setUp(){
        Basics = (TextView) findViewById(R.id.basics);
        Chords = (TextView) findViewById(R.id.chords);
        Scales = (TextView) findViewById(R.id.scales);
        Strumming = (TextView) findViewById(R.id.strumming);

    }
}
