package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class BeforeMain extends AppCompatActivity {
LottieAnimationView playAnimate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_main);
        playAnimate = findViewById(R.id.playAnimate);
        playAnimate.setAnimation(R.raw.animation);
        playAnimate.playAnimation();
        Intent obj = new Intent(getApplicationContext() , MainActivity.class);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){

                startActivity(obj);
                finish();

            }
        },2000);    }
}