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
        Group dev1 = new Group("dev201", 24, 2023, f1, "39294");
        Group dev2 = new Group("dev202", 26, 2023, f1, "3sl294");
        Group dev3 = new Group("dev203", 14, 2023, f1, "39ls94");
        Group dev4 = new Group("dev204", 34, 2023, f1, "392sd");
        Group dev5 = new Group("dev205", 27, 2023, f1, "39sd4");
        f1.getLstGroups().add(dev1);
        f1.getLstGroups().add(dev2);
        f1.getLstGroups().add(dev3);
        f1.getLstGroups().add(dev4);
        f1.getLstGroups().add(dev5);
        lstFiliere.add(f1);
        lstFiliere.add(f2);
        lstFiliere.add(f3);
        VP = findViewById(R.id.viewPager);
        PagerAdapter FA = new PagerAdapter(this, lstFiliere, MainActivity.this);
        VP.setAdapter(FA);
    }
}
