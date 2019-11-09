package com.example.up887818.HygieneActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up887818.ExtraMethods;
import com.example.up887818.R;

public class HygieneActivity0 extends AppCompatActivity {

    ExtraMethods a = new ExtraMethods(this);

    Boolean fatal = false;
    Boolean finished = false;

    Button yesButton = findViewById(R.id.yesButton);
    Button noButton = findViewById(R.id.noButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);


        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finished){
                    //move to next customer service activity
                    ;
                } else {
                    fatal = true;
                    finished = true;
                    //In this instance both these variables will always be the same, however
                    //This isn't always the case so I'm keeping them separate.
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fatal) {
                    //Get fired
                    String reason = "Someone slipped and hurt themselves! You are a liability.";
                    a.getFired(reason);
                } else {
                    //Go back to previous activity
                    finish();
                }
            }
        });
    }
}
