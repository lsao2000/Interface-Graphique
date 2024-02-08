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
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
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
                Intent intentGroup = new Intent(context, GroupActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("groups",(Serializable) lstGroup);
                intentGroup.putExtra("bundle", b);
                startActivity(intentGroup);
            });
            return V;
        }
      }

