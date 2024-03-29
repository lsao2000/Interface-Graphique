package com.example.viewpagertp;

import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
public class GroupActivity extends AppCompatActivity {
    private RecyclerView myRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        myRecycler = findViewById(R.id.myRecycler);
        Intent getData = getIntent();
        List<Group> lstGroups = (ArrayList<Group>) getData.getSerializableExtra("lstGroups");

        if(lstGroups == null){
            Toast.makeText(getApplicationContext(), "empty list", Toast.LENGTH_LONG).show();
        }
        myRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myRecycler.setHasFixedSize(true);
        myRecycler.setAdapter(new MyAdapter(getApplicationContext(), lstGroups));
    }
}
