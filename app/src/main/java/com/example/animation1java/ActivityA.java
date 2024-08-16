package com.example.animation1java;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.start_new_activity_button);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);

        button.setOnClickListener(view ->
        {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        });

    }
}
