package com.example.up887818;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        String name = getIntent().getStringExtra("name");
        TextView test = (TextView)findViewById(R.id.textView);
        test.setText(String.format("Hi %s", name));

        //Todo: Create introduction to story.
    }

}
