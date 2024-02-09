package com.example.viewpagertp;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public  class PFragment extends Fragment {
        private List<Group> lstGroups;
        private Context context;
        public PFragment(List<Group> lstGroups, Context context){
            this.lstGroups = lstGroups;
            this.context = context;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View V = inflater.inflate(R.layout.fragment_application_mobile, container, false);
            TextView txt1 = (TextView) V.findViewById(R.id.txtNom);
            ImageView img = (ImageView) V.findViewById(R.id.img);
            Button show = V.findViewById(R.id.showFiliereInfo);
            txt1.setText(getArguments().getString("NomFil"));
            img.setImageResource(getArguments().getInt("image"));
            show.setOnClickListener(v -> {
                List<Group> lstGroup = lstGroups;
                try{
                    Intent intentGroup = new Intent(context, GroupActivity.class);
                    intentGroup.putExtra("lstGroups", (Serializable) lstGroup);
                    startActivity(intentGroup);
                    }
                catch(Exception e){
                    Toast.makeText(context, "Error: "+ e.getMessage(), Toast.LENGTH_LONG).show();
                }

                });
            return V;
        }
      }

