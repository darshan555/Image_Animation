package com.example.image_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    ImageView myImage;
    Button animButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImage = findViewById(R.id.myIMG);
        animButton = findViewById(R.id.animBTN);
        animButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInLeft).duration(300).repeat(0).playOn(myImage);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        YoYo.with(Techniques.FadeIn).duration(300).repeat(0).playOn(myImage);

    }
}