package com.example.projetandroid;

public class Ecran extends Materiel{
    private String taille;
    private int frequence;
    private int latence;
    private boolean incurve;
    private String resolution;

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

    public Ecran(String taille, int frequence, int latence, boolean incurve, String resolution) {
        this.taille = taille;
        this.frequence = frequence;
        this.latence = latence;
        this.incurve = incurve;
        this.resolution = resolution;
    }
}