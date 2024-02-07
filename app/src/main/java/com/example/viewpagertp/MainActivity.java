package com.example.viewpagertp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Filiere f1 =  new Filiere("APPLICATION MOBILE", R.drawable.image3);
        Filiere f2 =  new Filiere("FULL STACK",  R.drawable.image1);
        Filiere f3 = new Filiere("GESTION",  R.drawable.image2);
        List<Filiere> lstFiliere = new ArrayList<Filiere>();
        lstFiliere.add(f1);
        lstFiliere.add(f2);
        lstFiliere.add(f3);
        VP = findViewById(R.id.viewPager);
        PagerAdapter FA = new PagerAdapter(this, lstFiliere);
        VP.setAdapter(FA);
    }
}
