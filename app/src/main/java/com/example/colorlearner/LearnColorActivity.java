package com.example.colorlearner;

import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LearnColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_color);

        LinearLayout layout = findViewById(R.id.rootLayout);
        TextView text = findViewById(R.id.colorText);

        Button red = findViewById(R.id.redBtn);
        Button green = findViewById(R.id.greenBtn);
        Button blue = findViewById(R.id.blueBtn);
        Button yellow = findViewById(R.id.yellowBtn);

        red.setOnClickListener(v -> {
            layout.setBackgroundColor(Color.RED);
            text.setText("Red");
        });

        green.setOnClickListener(v -> {
            layout.setBackgroundColor(Color.GREEN);
            text.setText("Green");
        });

        blue.setOnClickListener(v -> {
            layout.setBackgroundColor(Color.BLUE);
            text.setText("Blue");
        });

        yellow.setOnClickListener(v -> {
            layout.setBackgroundColor(Color.YELLOW);
            text.setText("Yellow");
        });
    }
}