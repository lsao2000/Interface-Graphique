package com.example.viewpagertp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.fragment.app.Fragment;

import java.util.List;


public  class PFragment extends Fragment {
        private List<Group> lstGroups;
        public PFragment(List<Group> lstGroups){
            this.lstGroups = lstGroups;
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

            });
            return V;


        }
      }

