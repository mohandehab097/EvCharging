package com.example.evchargingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView carIcon,chargingIcon;
    private final static int SPLASH_SCREEN = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        createAnimation();
        goToSecondPage();
    }


    public void createAnimation() {


        carIcon = this.findViewById(R.id.carLogo);
        chargingIcon = this.findViewById(R.id.chargingLogo);
        Animation carAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_in_left_2);
        Animation chargingAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_in_right);

        carIcon.startAnimation(carAnimation);
        chargingIcon.startAnimation(chargingAnimation);






    }


    public void goToSecondPage() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent =new Intent(MainActivity.this,ChargerTypesActivity.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN);
    }
}