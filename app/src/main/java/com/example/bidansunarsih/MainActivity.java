package com.example.bidansunarsih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }
    public void tombol(View view) {
        Intent intent = new Intent (MainActivity.this, daftar_online.class);
        startActivity(intent);
    }
}