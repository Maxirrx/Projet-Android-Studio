package com.example.projetandroid;

import java.io.Serializable;

public class Ecran extends Materiel implements Serializable {
    private String taille;
    private int frequence;
    private int latence;
    private boolean incurve;
    private String resolution;

    public Ecran(int idMat, String marque, int prix, String modele, String couleur, String usage, String cequecest, int frequence, String taille, int latence, boolean incurve, String resolution) {
        super(idMat, marque, prix, modele, couleur, usage, cequecest);
        this.frequence = frequence;
        this.taille = taille;
        this.latence = latence;
        this.incurve = incurve;
        this.resolution = resolution;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public int getLatence() {
        return latence;
    }

    public void setLatence(int latence) {
        this.latence = latence;
    }

    public boolean isIncurve() {
        return incurve;
    }

    public void setIncurve(boolean incurve) {
        this.incurve = incurve;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Ecran{" +
                ", cequecest='" + getCequecest() + '\'' +
                ", marque='" + getMarque() + '\'' +
                ", prix=" + getPrix() +
                ", modele='" + getModele() + '\'' +
                ", couleur='" + getCouleur() + '\'' +
                ", usage='" + getUsage() + '\'' +
                "taille='" + taille + '\'' +
                ", frequence=" + frequence +
                ", latence=" + latence +
                ", incurve=" + incurve +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
