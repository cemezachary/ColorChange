package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img, img2;
    TextView txt;
    private static int coolBlue = Color.parseColor("#2196F3");
    private static int magenta = Color.parseColor("#E521F3");
    private static int gold = Color.parseColor("#DAAA31");
    private static int fireRed = Color.parseColor("#C30C0C");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        img2 = findViewById(R.id.img2);
        txt = findViewById(R.id.btnAnimate);
        colorTest();

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.animate().rotationBy(90).setDuration(3000).start();
                img2.animate().rotationBy(-90).setDuration(3000).start();
                changeColor();
                //img.setBackgroundColor(Color.parseColor("#C30C0C"));
                //img2.setBackgroundColor(Color.parseColor("#C30C0C"));
                //img.setBackgroundColor(R.color.magenta);
                //img2.setBackgroundColor(R.color.gold);
                //img.setBackgroundColor();
            }
        });
    }

    private void changeColor(){
        ColorDrawable currentBackground = (ColorDrawable) img.getBackground();
        int currentBackgroundColor = currentBackground.getColor();
        if (currentBackgroundColor == coolBlue){
            img.setBackgroundColor(magenta);
            img2.setBackgroundColor(magenta);
        }
        else if (currentBackgroundColor == magenta){
            img.setBackgroundColor(gold);
            img2.setBackgroundColor(gold);
        }
        else if (currentBackgroundColor == gold){
            img.setBackgroundColor(fireRed);
            img2.setBackgroundColor(fireRed);
        }
        else{
            img.setBackgroundColor(coolBlue);
            img2.setBackgroundColor(coolBlue);
        }
    }

    private boolean colorTest(){
        int blueTest = Color.parseColor("#2196F3");
        ColorDrawable bTest = (ColorDrawable) img.getBackground();
        int initialBlueTest = bTest.getColor();
        if (blueTest == initialBlueTest){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
