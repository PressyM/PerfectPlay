package com.example.perfectplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LearnChordsVid extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_chords_vid);

        Intent intent = getIntent();
        String Note = intent.getStringExtra("Notes");
        TextView noteTutoial = (TextView) findViewById(R.id.noteTuorial);
        noteTutoial.setText(Note);
    }
}
