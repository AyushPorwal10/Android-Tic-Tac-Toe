package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button restart;
    String btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int flag = 0;
    int count = 0; // This is to count the number of clicks



    LottieAnimationView celebration ;
    TextView animation;
    TextView showName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
           showName = findViewById(R.id.Vs);
           showName.setText(" Ayush vs Atul ");
        celebration = findViewById(R.id.celebration);
        celebration.setAnimation(R.raw.celebration);

//        animation = findViewById(R.id.animation);         this three line not working
//        Animation translate  = AnimationUtils.loadAnimation(this , R.anim.translate);
//        animation.startAnimation(translate);
    }


    private void init() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        restart=  findViewById(R.id.Restart);


    }

    public void Check(View parameter) {    // user defined method and parameter

        Button currentBtn = (Button) parameter;
        if(currentBtn.equals(restart))restart();

        count++;
        if(currentBtn.getText().toString().equals("")){  //checking if already exist value on the button


        if (flag == 0) {
            currentBtn.setText("X");
            flag = 1;
        } else {
            currentBtn.setText("O");
            flag = 0;
        }

        if (count > 4) {
            btn1 = button1.getText().toString();
            btn2 = button2.getText().toString();
            btn3 = button3.getText().toString();
            btn4 = button4.getText().toString();
            btn5 = button5.getText().toString();
            btn6 = button6.getText().toString();
            btn7 = button7.getText().toString();
            btn8 = button8.getText().toString();
            btn9 = button9.getText().toString();

            // Conditions

            if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.equals("")) {
                Toast.makeText(this, "Winner is " + btn1, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn4.equals("")) {
                Toast.makeText(this, "Winner is " + btn4, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.equals("")) {
                Toast.makeText(this, "Winner is " + btn7, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.equals("")) {
                Toast.makeText(this, "Winner is " + btn1, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.equals("")) {
                Toast.makeText(this, "Winner is " + btn2, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.equals("")) {
                Toast.makeText(this, "Winner is " + btn3, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.equals("")) {
                Toast.makeText(this, "Winner is " + btn1, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.equals("")) {
                Toast.makeText(this, "Winner is " + btn3, Toast.LENGTH_SHORT).show();
                celebration.playAnimation();
                restart();
            }
            else if(count==9)
            {
                Toast.makeText(this, "Draw Match", Toast.LENGTH_SHORT).show();
                restart();
            }

        }
    }


        }
        public void restart(){
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");
            flag=0;
            count=0;
    }
}