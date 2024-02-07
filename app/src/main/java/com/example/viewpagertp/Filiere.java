package com.example.viewpagertp;

import java.util.ArrayList;
import java.util.Arrays;

public class Filiere {
    String nomFil;
    int image;

    public Filiere(String nomFil, int image) {
        this.nomFil = nomFil;
        this.image = image;
    }

    public String getNomFil() {
        return nomFil;
    }

    public void setNomFil(String nomFil) {
        this.nomFil = nomFil;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public static ArrayList<Filiere> lstFil ()
    {  return new ArrayList<Filiere>(
            Arrays.asList(
                    new Filiere("APPLICATION MOBILE", R.drawable.image3),
                    new Filiere("FULL STACK",  R.drawable.image1),
                    new Filiere("GESTION",  R.drawable.image2)
                    ));
    }

}
