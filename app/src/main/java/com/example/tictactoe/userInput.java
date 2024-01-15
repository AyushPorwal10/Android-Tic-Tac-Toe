package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class userInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        Intent next = new Intent(this, BeforeMain.class);
        Button playbtn ;
        playbtn = findViewById(R.id.play);
        playbtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View obj){
                startActivity(next);
            }

        });
    }
}