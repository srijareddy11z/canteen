package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.button1);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);
            }
        });

    }
}