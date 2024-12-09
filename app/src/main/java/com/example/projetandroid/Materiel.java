package com.example.projetandroid;

public class Materiel {
    private String idMat;
    private  String marque;
    private int prix;
    private String modele;
    private String Couleur;
    private String Usage;


    public String getIdMat() {
        return idMat;
    }

    public void setIdMat(String idMat) {
        this.idMat = idMat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    public Materiel(String idMat, String marque, int prix, String couleur, String modele, String usage) {
        this.idMat = idMat;
        this.marque = marque;
        this.prix = prix;
        Couleur = couleur;
        this.modele = modele;
        Usage = usage;
    }
}
