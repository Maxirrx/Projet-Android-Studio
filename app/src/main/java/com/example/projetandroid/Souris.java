package com.example.projetandroid;

public class Souris extends Materiel{
    private boolean filaire;
    private int dpi;
    private int nbrBtn;
    private boolean rgb;

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

    public Souris(boolean filaire, int nbrBtn, int dpi, boolean rgb) {
        this.filaire = filaire;
        this.nbrBtn = nbrBtn;
        this.dpi = dpi;
        this.rgb = rgb;
    }
}
