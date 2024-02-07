package com.example.viewpagertp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


    public  class PFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View V = inflater.inflate(R.layout.fragment_application_mobile, container, false);
            TextView txt1 = (TextView) V.findViewById(R.id.txtNom);
            ImageView img = (ImageView) V.findViewById(R.id.img);
            txt1.setText(getArguments().getString("nomFil"));
            img.setImageResource(getArguments().getInt("image"));
            return V;


        }
      }

