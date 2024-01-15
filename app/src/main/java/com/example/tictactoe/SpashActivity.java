package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;

public class SpashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent obj = new Intent(SpashActivity.this , userInput.class);
                startActivity(obj);
                finish();

            }
        },3000);
    }
}