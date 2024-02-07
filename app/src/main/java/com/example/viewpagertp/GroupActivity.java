package com.example.viewpagertp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public class GroupActivity extends AppCompatActivity {
    private RecyclerView myRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        myRecycler = findViewById(R.id.myRecycler);

    }
}
