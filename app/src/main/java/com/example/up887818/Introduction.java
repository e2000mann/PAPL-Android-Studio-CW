package com.example.up887818;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        String name = getIntent().getStringExtra("name");
        Resources res = getResources();

        final TextView test = findViewById(R.id.textView);
        final Button b = findViewById(R.id.button);
        final String[] strings = res.getStringArray(R.array.intro_explaination);

        int counter = 0;

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                if (counter < 4) {
                    counter++;
                    test.setText(strings[counter]);
                    if (counter == 3) {
                        b.setText("Let's go!");
                    }
                } else {
                    Intent i = new Intent(Introduction.this, Test.class);
                    i.putExtra("name", name);
                    startActivity(i);
                }
            }});

        test.setText(String.format(strings[0], name));



        //Todo: Create introduction to story.
    }

}
