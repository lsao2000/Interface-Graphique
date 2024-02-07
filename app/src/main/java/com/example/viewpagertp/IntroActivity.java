package com.example.viewpagertp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.os.Handler;
import android.content.Intent;
import android.widget.TextView;
public class IntroActivity extends AppCompatActivity {
    private TextView brand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
   brand = findViewById(R.id.brand);
        Animation brandAnimation = AnimationUtils.loadAnimation(this, R.anim.intro_animation);
        brand.setAnimation(brandAnimation);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                        Intent homeActivity = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(homeActivity);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            }

    }
