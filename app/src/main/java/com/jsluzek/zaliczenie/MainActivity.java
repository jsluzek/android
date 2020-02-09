package com.jsluzek.zaliczenie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


    public class MainActivity extends AppCompatActivity {

        private Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.przycisk);

            button.setOnClickListener(v -> {
                Intent intent = new Intent(this, second.class);
                startActivity(intent);
            });
        }
    }