package com.example.colorlearner;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class LearnColorActivity extends AppCompatActivity {

    private final Map<String, Integer> colorMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_color);

        LinearLayout rootLayout = findViewById(R.id.rootLayout);
        TextView colorText = findViewById(R.id.colorText);
        GridLayout colorGrid = findViewById(R.id.colorGrid);

        colorMap.put("Red", Color.RED);
        colorMap.put("Blue", Color.BLUE);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Yellow", Color.YELLOW);

        //loops through all the children of the grid layout
        for (int i = 0; i < colorGrid.getChildCount(); i++) {
            if (colorGrid.getChildAt(i) instanceof Button) {
                Button btn = (Button) colorGrid.getChildAt(i);

                GradientDrawable drawable = (GradientDrawable) btn.getBackground();
                Integer color = colorMap.get(btn.getText().toString());
                if (color != null) drawable.setColor(color);

                btn.setOnClickListener(v -> {
                    GradientDrawable bg = (GradientDrawable) btn.getBackground();
                    int clickedColor = bg.getColor().getDefaultColor();


                    //sets the background color
                    rootLayout.setBackgroundColor(clickedColor);

                    //sets the text to indicate the background color
                    colorText.setText(btn.getText());
                });
            }
        }
    }


}