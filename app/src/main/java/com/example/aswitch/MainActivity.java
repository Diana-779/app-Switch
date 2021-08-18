package com.example.aswitch;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Switch sw = findViewById(R.id.switch1);
        if (sw != null) {
            sw.setOnCheckedChangeListener((buttonView, isChecked) -> {
              String msg = isChecked ? "ON" : "OFF";
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
                sw.setText(msg);
            });
        }
    }
}