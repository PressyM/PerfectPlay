package com.example.perfectplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chords extends AppCompatActivity {

    private Button Home;
    private TextView LearnA,LearnB,LearnC,LearnD,LearnE,LearnF,LearnG;
    private String Note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords);
        setup();


        //home
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Chords.this, homepage.class );
                startActivity(intent);
            }
        });

        //Learn to play A video
        LearnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note = "A";
                startVideo(Note);
            }
        });

        //Learn to play B video
        LearnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="B";
                startVideo(Note);
            }
        });

        //Learn to play C video
        LearnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="C";
                startVideo(Note);
            }
        });

        //Learn to play D video
        LearnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="D";
                startVideo(Note);
            }
        });

        //Learn to play E video
        LearnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="E";
                startVideo(Note);
            }
        });

        //Learn to play F video
        LearnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="F";
                startVideo(Note);
            }
        });


        //Learn to play G video
        LearnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note ="B";
                startVideo(Note);

            }
        });




    }

    private void setup(){
        Home = (Button) findViewById(R.id.home2);
        LearnA = (TextView) findViewById(R.id.learnA);
        LearnB = (TextView) findViewById(R.id.learnB);
        LearnC = (TextView) findViewById(R.id.learnC);
        LearnD = (TextView) findViewById(R.id.learnD);
        LearnE = (TextView) findViewById(R.id.learnE);
        LearnF = (TextView) findViewById(R.id.learnF);
        LearnG = (TextView) findViewById(R.id.learnG);

    }

    private void startVideo(String noteTaught){
        Intent intent = new Intent(Chords.this, LearnChordsVid.class);
        intent.putExtra("Notes",noteTaught);
        startActivity(intent);


    }
}
