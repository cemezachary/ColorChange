package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img, img2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        img2 = findViewById(R.id.img2);
        txt = findViewById(R.id.btnAnimate);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.animate().rotationBy(90).setDuration(3000).start();
                img2.animate().rotationBy(-90).setDuration(3000).start();
                //img.setBackgroundColor();
            }
        });
    }
}
