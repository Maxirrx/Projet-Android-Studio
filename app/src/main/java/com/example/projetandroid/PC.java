package com.example.projetandroid;

public class PC extends Materiel{
    private boolean portabilite;
    private String processeur;
    private int ram;
    private String cartegraphique;
    private int stockage;
    private String os;

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

    public PC(boolean portabilite, String processeur, int ram, String cartegraphique, int stockage, String os) {
        this.portabilite = portabilite;
        this.processeur = processeur;
        this.ram = ram;
        this.cartegraphique = cartegraphique;
        this.stockage = stockage;
        this.os = os;
    }
}
