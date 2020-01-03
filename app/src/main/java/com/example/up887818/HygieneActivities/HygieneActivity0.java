package com.example.up887818.HygieneActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.up887818.ExtraMethods;
import com.example.up887818.R;

public class HygieneActivity0 extends AppCompatActivity {

    ExtraMethods extra;

    FrameLayout bg;

    TextView title, description;

    Button yesButton, noButton;

    int decision = 0;

    String[] activityStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);

        extra = new ExtraMethods(this, HygieneActivity0.this);

        bg = findViewById(R.id.bg);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);

        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);

        //Todo: find way to link next customer activity into here

        activityStrings = getResources().getStringArray(R.array.hygieneactivity0);

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decision == 0) {
                    decision += 1;
                    description.setText(activityStrings[1]);
                    bg.setBackgroundResource(R.drawable.kitchen_wet);
                } else {
                    finish();
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decision == 0){
                    finish();
                } else {
                    String reason = activityStrings[2];
                    extra.getFired(reason);
                }
            }
        });

        title.setText("Activity 1: Kitchen floor");

        bg.setBackgroundResource(R.drawable.kitchen_dirty);
        description.setText(activityStrings[0]);
    }
}
