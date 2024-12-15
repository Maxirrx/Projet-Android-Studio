package com.example.projetandroid;

public class PC extends Materiel{
    private boolean portabilite;
    private String processeur;
    private int ram;
    private String cartegraphique;
    private int stockage;
    private String os;


    public PC(int idMat, String marque, int prix, String modele, String couleur, String usage, String cequecest, boolean portabilite, int ram, String cartegraphique, String processeur, int stockage, String os) {
        super(idMat, marque, prix, modele, couleur, usage, cequecest);
        this.portabilite = portabilite;
        this.ram = ram;
        this.cartegraphique = cartegraphique;
        this.processeur = processeur;
        this.stockage = stockage;
        this.os = os;
    }

    public boolean isPortabilite() {
        return portabilite;
    }

    public void setPortabilite(boolean portabilite) {
        this.portabilite = portabilite;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCartegraphique() {
        return cartegraphique;
    }

    public void setCartegraphique(String cartegraphique) {
        this.cartegraphique = cartegraphique;
    }

    public int getStockage() {
        return stockage;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
