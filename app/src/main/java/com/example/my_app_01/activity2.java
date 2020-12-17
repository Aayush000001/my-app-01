package com.example.my_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getStringExtra("name");

        tvResult.setText(name);


    }
}