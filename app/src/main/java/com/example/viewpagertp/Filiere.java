package com.example.viewpagertp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Filiere{
    String nomFil;
    String code;
    int image;
    public List<Group> lstGroups;
    public Filiere(String nomFil, int image) {
        this.nomFil = nomFil;
        this.image = image;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
    public void setLstClasses(List<Group> lst){

    }
    public List<Group> getLstGroups(){
        return lstGroups;
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
}
