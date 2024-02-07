package com.example.viewpagertp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStateAdapter {

    private List<Filiere> lstFil;
    public PagerAdapter(@NonNull MainActivity fragment, List<Filiere> lstFil) {
        super(fragment);
        this.lstFil = lstFil;
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        PFragment F =new PFragment(lstFil.get(position).getLstGroups());
        Bundle B =new Bundle();
        B.putString("NomFil", lstFil.get(position).getNomFil());
        B.putInt("image", lstFil.get(position).getImage());
        F.setArguments(B);
        return F;
    }

    @Override
    public int getItemCount() {
        return lstFil.size();
    }
}
