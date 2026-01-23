package com.example.colorlearner;


import android.content.res.ColorStateList;

import android.os.Bundle;

import android.graphics.Color;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class LearnColorActivity extends AppCompatActivity {

    private final Map<String, Integer> colorMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_color);

        TextView colorText = findViewById(R.id.colorText);
        GridLayout colorGrid = findViewById(R.id.colorGrid);
        Button backBtn = findViewById(R.id.backBtn);

        colorMap.put("Red", Color.RED);
        colorMap.put("Blue", Color.BLUE);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Yellow", Color.YELLOW);

        //loops through all the children of the grid layout
        for (int i = 0; i < colorGrid.getChildCount(); i++) {
            if (colorGrid.getChildAt(i) instanceof Button) {
                Button btn = (Button) colorGrid.getChildAt(i);


                Integer color = colorMap.get(btn.getText().toString());
                if (color != null ) {
                    final int colorValue = color;
                    btn.setBackgroundTintList(ColorStateList.valueOf(colorValue));
                    btn.setTextColor(Color.BLACK);


                    //sets the text to indicate the background color
                    btn.setOnClickListener(v -> {
                        v.animate().scaleX(.95f).scaleY(.95f).setDuration(100)
                                        .withEndAction(() -> v.animate().scaleX(1f).scaleY(1f).setDuration(100).start());
                        colorText.setText(btn.getText());
                        colorText.setTextColor(colorValue);
                    });
                }

                backBtn.setOnClickListener(v -> {
                    v.animate().scaleX(.95f).scaleY(.95f).setDuration(100)
                                    .withEndAction(() -> v.animate().scaleX(1f).scaleY(1f).setDuration(100).start());
                    finish();
                });
            }
        }
    }


}