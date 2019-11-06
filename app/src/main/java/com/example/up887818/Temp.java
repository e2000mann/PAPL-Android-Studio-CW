package com.example.up887818;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Temp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        //Todo: randomise order of activities

        Integer[] hygiene = new Integer[]{0, 1, 2, 3, 4};
        Integer[] custService = new Integer[]{0, 1, 2, 3, 4};

        Collections.shuffle(Arrays.asList(hygiene));
        Collections.shuffle(Arrays.asList(custService));

        TextView a = findViewById(R.id.textView2);
        TextView b = findViewById(R.id.textView3);

        a.setText(hygiene.toString());
        b.setText(custService.toString());

    }
}
