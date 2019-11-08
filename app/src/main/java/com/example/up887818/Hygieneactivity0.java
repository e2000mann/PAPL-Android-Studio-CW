package com.example.up887818;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hygieneactivity0 extends AppCompatActivity {

    ExtraMethods a = new ExtraMethods(Hygieneactivity0.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hygieneactivity0);

        Button yesButton = findViewById(R.id.yesButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
            }
        });

        Button noButton = findViewById(R.id.noButton);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fatal) {
                    //Get fired
                    String reason = "Someone slipped and hurt themselves! You are a liability."
                    a.getFired(reason);
                } else {
                    //Go back to previous activity
                    finish();
                }
            }
        });
    }
}
