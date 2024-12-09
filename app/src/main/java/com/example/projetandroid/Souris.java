package com.example.projetandroid;

public class Souris extends Materiel{
    private boolean filaire;
    private int dpi;
    private int nbrBtn;
    private boolean rgb;

    public Souris(String idMat, String marque, int prix, String couleur, String modele, String usage, boolean filaire, int dpi, int nbrBtn, boolean rgb) {
        super(idMat, marque, prix, couleur, modele, usage);
        this.filaire = filaire;
        this.dpi = dpi;
        this.nbrBtn = nbrBtn;
        this.rgb = rgb;
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


}
