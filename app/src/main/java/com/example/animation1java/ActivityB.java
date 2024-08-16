package com.example.animation1java;

import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
/*        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
          //  getWindow().getEnterTransition() = Slide;
        Transition transition = TransitionInflater
                .from(this)
                .inflateTransition(R.transition.class.getModifiers());
                //.inflateTransition(R.transition.fade);
                //.inflateTransition(R.transition.slide);

        getWindow().setExitTransition(transition);
        //getWindow().setEnterTransition(transition);*/
    }
}