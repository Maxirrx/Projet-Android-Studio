package com.example.projetandroid;

public class Materiel {
    protected int idMat;
    protected  String marque;
    protected int prix;
    protected String modele;
    protected String Couleur;
    protected String Usage;

    public Materiel(int idMat, String marque, int prix, String modele, String couleur, String usage) {
        this.idMat = idMat;
        this.marque = marque;
        this.prix = prix;
        this.modele = modele;
        Couleur = couleur;
        Usage = usage;
    }

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
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
}
