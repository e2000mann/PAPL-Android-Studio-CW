package com.example.up887818;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        final String name = getIntent().getStringExtra("name");
        Resources res = getResources();

        final TextView test = findViewById(R.id.textView);
        final Button b = findViewById(R.id.button);
        final String[] strings = res.getStringArray(R.array.intro_explaination);
        
        OnClickListener listener = new OnClickListener() {
            int counter = 0;
            @Override
            public void onClick(View v){
                if (counter < 3) {
                    counter++;
                    test.setText(strings[counter]);
                    if (counter == 3) {
                        b.setText("Let's go!");
                    }
                } else {
                    Intent i = new Intent(Introduction.this, Temp.class);
                    i.putExtra("name", name);
                    startActivity(i);
                }
            }
        };

        b.setOnClickListener(listener);

        test.setText(String.format(strings[0], name));

    }

}
