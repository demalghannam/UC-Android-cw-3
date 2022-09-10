package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);

        Button travel = findViewById(R.id.button);


        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                String b = age.getText().toString();

                Intent intent = new Intent(MainActivity.this, secondpage.class);
                intent.putExtra("name", a);
                intent.putExtra("age", b);
                startActivity(intent);



            }
        });
    }
}

