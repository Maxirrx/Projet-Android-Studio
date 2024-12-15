package com.example.projetandroid;

import java.io.Serializable;

public class Materiel implements Serializable {


    private int idMat;
    private String cequecest;
    private  String marque;
    private int prix;
    private String modele;
    private String couleur;
    private String usage;




    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public String getCequecest() {
        return cequecest;
    }

    public void setCequecest(String cequecest) {
        this.cequecest = cequecest;
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

    public Materiel(int idMat, String marque, int prix, String modele, String couleur, String usage, String cequecest) {
        this.idMat = idMat;
        this.marque = marque;
        this.prix = prix;
        this.modele = modele;
        this.couleur = couleur;
        this.usage = usage;
        this.cequecest = cequecest;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "idMat=" + idMat +
                ", cequecest='" + cequecest + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", usage='" + usage + '\'' +
                '}';
    }
}
