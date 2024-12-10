package com.example.projetandroid;

public class Materiel {


    private String idMat;
    private  String marque;
    private int prix;
    private String modele;
    private String couleur;
    private String usage;


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

    public Materiel(String idMat, String marque, int prix, String modele, String couleur, String usage) {
        this.idMat = idMat;
        this.marque = marque;
        this.prix = prix;
        this.modele = modele;
        this.couleur = couleur;
        this.usage = usage;
    }

}
