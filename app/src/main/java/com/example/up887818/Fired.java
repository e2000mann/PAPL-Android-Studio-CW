package com.example.up887818;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

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
                //Goes back to main activity, closing all other activities.
                //Todo: (note to self) use navigateUpTo instead of startactivity when going backwards
                navigateUpTo(new Intent(Fired.this, MainActivity.class));
            }
        });

        Button exitButton = findViewById(R.id.noButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exits App
                finishAffinity();
                System.exit(0);
            }
        });
    }
}
