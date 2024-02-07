package com.example.viewpagertp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {


    public PagerAdapter(@NonNull MainActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        PFragment F =new PFragment();
        Bundle B =new Bundle();
        B.putString("NomFil", Filiere.lstFil().get(position).getNomFil());
        B.putInt("image", Filiere.lstFil().get(position).getImage());
        F.setArguments(B);
        return F;
    }

    @Override
    public int getItemCount() {
        return Filiere.lstFil().size();
    }
}
