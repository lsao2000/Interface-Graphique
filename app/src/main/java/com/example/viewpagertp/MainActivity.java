package com.example.viewpagertp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager2 VP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VP = (ViewPager2) findViewById(R.id.viewPager);
        PagerAdapter FA = new PagerAdapter(this );
        VP.setAdapter(FA);



    }
}