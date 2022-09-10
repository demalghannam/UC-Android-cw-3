package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");


        TextView textname = findViewById(R.id.thename1);
        TextView textcivilid = findViewById(R.id.theage);

        textname.setText(name);
        textcivilid.setText(age);


    }
}