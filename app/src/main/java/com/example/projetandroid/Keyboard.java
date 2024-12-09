package com.example.projetandroid;

public class Keyboard extends Materiel{
    private String type;
    private boolean rgb;
    private boolean tkl;
    private boolean mecanique;
    private boolean filaire;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public boolean isTkl() {
        return tkl;
    }

    public void setTkl(boolean tkl) {
        this.tkl = tkl;
    }

    public boolean isMecanique() {
        return mecanique;
    }

    public void setMecanique(boolean mecanique) {
        this.mecanique = mecanique;
    }

    public boolean isFilaire() {
        return filaire;
    }

    public void setFilaire(boolean filaire) {
        this.filaire = filaire;
    }

    public Keyboard(String type, boolean rgb, boolean tkl, boolean mecanique, boolean filaire) {
        this.type = type;
        this.rgb = rgb;
        this.tkl = tkl;
        this.mecanique = mecanique;
        this.filaire = filaire;
    }
}
