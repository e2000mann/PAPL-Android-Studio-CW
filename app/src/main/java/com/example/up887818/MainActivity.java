package com.example.up887818;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v){
        EditText nameBox = (EditText)findViewById(R.id.nameBox);

        String name = nameBox.getText().toString();

        Intent i = new Intent(MainActivity.this, Introduction.class);
        i.putExtra("name", name);
        startActivity(i);
    }
}
