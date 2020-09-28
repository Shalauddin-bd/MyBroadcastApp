package com.example.mybroadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class RebootActivity extends AppCompatActivity {
    TextView textViewBoot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reboot);

        textViewBoot = findViewById(R.id.textViewBoot);
        Intent intent = getIntent();
        if(getIntent() != null){
            textViewBoot.setText("Phone Rebooted!");
        }
    }
}