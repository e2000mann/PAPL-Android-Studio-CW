package com.example.up887818;

import com.example.up887818.HygieneActivities.*;
import com.example.up887818.ConsumerActivities.*;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Temp extends AppCompatActivity {

    //Todo: Activity closes immediately after loading. Error in code somewhere??

    ExtraMethods extra;

    TextView title, description;

    Button yesButton, noButton;

    int day = 1;
    int refusals = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_decision);

        extra = new ExtraMethods(this, Temp.this);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);

        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);

        //Set Text
        title.setText(String.format("Day %d!", day));
        description.setText("Good morning. Are you going to work today?");

        //Todo: Create All Task Activities

        //This shuffles the order in which hygiene/customer tasks are given out.
        //Working as of 07/11/19
//        Integer[] hygieneOrder = new Integer[]{0, 1, 2, 3, 4};
//        Collections.shuffle(Arrays.asList(hygieneOrder));
//        Class[] hygiene = new Class[]{HygieneActivity0.class,
//                HygieneActivity1.class, HygieneActivity2.class,
//                HygieneActivity3.class, HygieneActivity4.class};
//
//        Integer[] customerOrder = new Integer[]{0, 1, 2, 3, 4};
//        Collections.shuffle(Arrays.asList(customerOrder));
//        Class[] customer = new Class[]{CustomerActivity0.class,
//                CustomerActivity1.class, CustomerActivity2.class,
//                CustomerActivity3.class, CustomerActivity4.class};

        //Setting up the response to the yes/no button.
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo: Once Activities set up, make so sends to next hygiene task.
                Intent i = new Intent(Temp.this, HygieneActivity0.class);
                startActivity(i);

                day++;
                title.setText(String.format("Day %d!", day));
                description.setText("Good morning. Are you going to work today?");
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                refusals++;
                if (refusals == 2){
                    String reason = "You refused to show up to work twice!";
                    extra.getFired(reason);
                }
                else{
                    description.setText("Scott has requested that you go to work. If you refuse again you will be fired!");
                }
            }
        });

    }
}
