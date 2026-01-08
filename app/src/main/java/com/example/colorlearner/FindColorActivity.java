package com.example.colorlearner;

import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class FindColorActivity extends AppCompatActivity {

    String[] names = {"Red", "Green", "Blue", "Yellow"};
    int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};

    int correctIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_color);

        LinearLayout layout = findViewById(R.id.rootLayout);
        TextView question = findViewById(R.id.questionText);

        Button b1 = findViewById(R.id.btn1);
        Button b2 = findViewById(R.id.btn2);
        Button b3 = findViewById(R.id.btn3);
        Button b4 = findViewById(R.id.btn4);

        Button[] buttons = {b1, b2, b3, b4};

        Random random = new Random();
        correctIndex = random.nextInt(4);

        question.setText("Find " + names[correctIndex]);

        for (int i = 0; i < buttons.length; i++) {
            int index = 1;
            buttons[i].setBackgroundColor(colors[i]);

            buttons[i].setOnClickListener(v -> {
                if (index == correctIndex) {
                    layout.setBackgroundColor(Color.GREEN);
                } else {
                    layout.setBackgroundColor(Color.RED);
                }
            });
        }
    }
}