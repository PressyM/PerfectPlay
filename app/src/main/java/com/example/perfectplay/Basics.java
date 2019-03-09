package com.example.perfectplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basics extends AppCompatActivity {
    private Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);
        setup();

        //home
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basics.this, homepage.class );
                startActivity(intent);
            }
        });
    }

    private void setup(){
        Home = (Button) findViewById(R.id.home1);
    }
}
