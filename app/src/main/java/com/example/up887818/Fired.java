package com.example.up887818;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fired extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fired);

        //Show reason for firing
        String reason = getIntent().getStringExtra("reason");
        TextView firedReason = findViewById(R.id.firedReason);
        firedReason.setText(reason);

        Button restartButton = findViewById(R.id.yesButton);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Goes back to main activity
                Intent restart = new Intent(Fired.this, MainActivity.class);
                startActivity(restart);
            }
        });

        Button exitButton = findViewById(R.id.noButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exits App
                finish();
                System.exit(0);
            }
        });
    }
}
