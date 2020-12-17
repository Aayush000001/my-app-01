package com.example.my_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,
                            com.example.my_app_01.activity2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);


                }
            }
        });
    }
}