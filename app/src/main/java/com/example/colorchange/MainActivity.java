package com.example.colorchange;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView changingBackground;
    TextView redView, greenView, blueView;
    Button redButtonAdd, redButtonSub, greenButtonAdd, greenButtonSub, blueButtonAdd, blueButtonSub;
    private int red, green, blue = 0;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changingBackground = findViewById(R.id.changingBackground);
        redView = findViewById(R.id.redView);
        greenView = findViewById(R.id.greenView);
        blueView = findViewById(R.id.blueView);
        redButtonAdd = findViewById(R.id.redValueAdd);
        greenButtonAdd = findViewById(R.id.greenValueAdd);
        blueButtonAdd = findViewById(R.id.blueValueAdd);
        redButtonSub = findViewById(R.id.redValueSub);
        greenButtonSub = findViewById(R.id.greenValueSub);
        blueButtonSub = findViewById(R.id.blueValueSub);
        changeColor(red,green,blue);
        redView.setText(String.valueOf(red));
        greenView.setText(String.valueOf(green));
        blueView.setText(String.valueOf(blue));
        //hex2Rgb("#E521F3");
        onPress();
    }

    @SuppressLint("SetTextI18n")
    public void hex2Rgb(String colorStr) {
        red = Integer.valueOf( colorStr.substring( 1, 3 ), 16 );
        green = Integer.valueOf( colorStr.substring( 3, 5 ), 16 );
        blue = Integer.valueOf( colorStr.substring( 5, 7 ), 16 );
        redView.setText(String.valueOf(red));
        greenView.setText(String.valueOf(green));
        blueView.setText(String.valueOf(blue));
    }
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onPress(){
        redButtonAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int redTest = red + 5;
                if (red < 255 && redTest < 255){
                    red+=5;
                }
                else{
                    red = 255;
                }
                changeColor(red,green,blue);
                redView.setText(String.valueOf(red));
            }
        });

        redButtonSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int redTest = red - 5;
                if (red > 0 && redTest > 0){
                    red-=5;
                }
                else{
                    red = 0;
                }
                changeColor(red,green,blue);
                redView.setText(String.valueOf(red));
            }
        });

        greenButtonAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int greenTest = green + 5;
                if (green < 255 && greenTest < 255){
                    green+=5;
                }
                else{
                    green = 255;
                }
                changeColor(red,green,blue);
                greenView.setText(String.valueOf(green));
            }
        });

        greenButtonSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int greenTest = green - 5;
                if (green > 0 && greenTest > 0){
                    green-=5;
                }
                else{
                    green = 0;
                }
                changeColor(red,green,blue);
                greenView.setText(String.valueOf(green));
            }
        });

        blueButtonAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int blueTest = blue + 5;
                if (blue < 255 && blueTest < 255){
                    blue+=5;
                }
                else{
                    blue = 255;
                }
                changeColor(red,green,blue);
                blueView.setText(String.valueOf(blue));
            }
        });

        blueButtonSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                int blueTest = blue - 5;
                if (blue > 0 && blueTest > 0){
                    blue-=5;
                }
                else{
                    blue = 0;
                }
                changeColor(red,green,blue);
                blueView.setText(String.valueOf(blue));
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("SetTextI18n")
    private void changeColor(int red, int green, int blue){
        int newColor = Color.rgb(red,green,blue);
        changingBackground.setBackgroundColor(newColor);
    }
}
