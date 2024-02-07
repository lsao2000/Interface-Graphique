package com.example.viewpagertp;

import java.time.LocalDate;
public class Stagiaire {
    private int numInscription;
    private String name;
    private String prenom;
    private int image;
    public LocalDate dateNaissance;
    public Stagiaire(){
    }
    public Stagiaire(String name, int numInscription, int image){
        this.name = name;
        this.numInscription = numInscription;
        this.image = image;
    }
    public void setDateNaissance(LocalDate dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public LocalDate getDateNaissance(){
        return dateNaissance;
    }
    public void setNumInscription(int numInscription){
        this.numInscription = numInscription;
    }
    public int getNumInscription(){
        return numInscription;
    }
     public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenom(){
        return prenom;
    }
   public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setImage(int image){
        this.image = image;
    }
    public int getImage(){
        return image;
    }
}
