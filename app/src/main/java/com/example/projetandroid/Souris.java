package com.example.projetandroid;

import java.io.Serializable;

public class Souris extends Materiel implements Serializable {
    private boolean filaire;
    private int dpi;
    private int nbrBtn;
    private boolean rgb;


    public Souris(int idMat, String marque, int prix, String modele, String couleur, String usage, String cequecest, boolean rgb, int nbrBtn, int dpi, boolean filaire) {
        super(idMat, marque, prix, modele, couleur, usage, cequecest);
        this.rgb = rgb;
        this.nbrBtn = nbrBtn;
        this.dpi = dpi;
        this.filaire = filaire;
    }

    public boolean isFilaire() {
        return filaire;
    }

    public void setFilaire(boolean filaire) {
        this.filaire = filaire;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNbrBtn() {
        return nbrBtn;
    }

    public void setNbrBtn(int nbrBtn) {
        this.nbrBtn = nbrBtn;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Souris{" +
                ", cequecest='" + getCequecest() + '\'' +
                ", marque='" + getMarque() + '\'' +
                ", prix=" + getPrix() +
                ", modele='" + getModele() + '\'' +
                ", couleur='" + getCouleur() + '\'' +
                ", usage='" + getUsage() + '\'' +
                "filaire=" + filaire +
                ", dpi=" + dpi +
                ", nbrBtn=" + nbrBtn +
                ", rgb=" + rgb +
                '}';
    }
}
