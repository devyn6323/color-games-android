package com.example.colorlearner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button learnButton = findViewById(R.id.learnButton);
        Button findButton = findViewById(R.id.findButton);

        learnButton.setOnClickListener(v ->
                startActivity(new Intent(this, LearnColorActivity.class))
        );

        findButton.setOnClickListener(v ->
                startActivity(new Intent(this, FindColorActivity.class))
                );

    }


}