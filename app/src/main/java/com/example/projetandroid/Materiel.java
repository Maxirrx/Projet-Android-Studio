package com.example.projetandroid;

public class Materiel {

    private String idMat;
    private  String marque;
    private int prix;
    private String modele;
    private String couleur;
    private String usage;


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
        return couleur;
    }

    public void setCouleur(String couleur) {
        couleur = couleur;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        usage = usage;
    }

    public Materiel() {
        this.idMat = idMat;
        this.marque = marque;
        this.prix = prix;
        this.couleur = couleur;
        this.modele = modele;
        this.usage = usage;
    }
}
