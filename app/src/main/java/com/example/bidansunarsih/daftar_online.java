package com.example.bidansunarsih;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class daftar_online extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_online);
        View decorView = getWindow().getDecorView();
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

    }
}
