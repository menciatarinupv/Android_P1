package com.example.p_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("prueba", "estoy en oncreate()"); //debug

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}