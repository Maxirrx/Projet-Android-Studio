package com.example.projetandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMatos extends AppCompatActivity {

    private TextView usage;
    private TextView usage1;
    private TextView marque;
    private TextView item11;
    private TextView item4;
    private TextView item3;
    private TextView item2;
    private TextView item5;
    private TextView item1;
    private TextView item21;
    private TextView item31;
    private TextView item41;
    private TextView item51;
    private TextView modele;
    private TextView marque1;
    private Button btnmenu;
    private ImageView image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmatos);
        initilialisation();
    }

    private void initilialisation() {
        usage = (android.widget.TextView) findViewById(R.id.usage);
        usage1 = (android.widget.TextView) findViewById(R.id.usage1);
        marque = (android.widget.TextView) findViewById(R.id.marque);
        item11 = (android.widget.TextView) findViewById(R.id.item11);
        item4 = (android.widget.TextView) findViewById(R.id.item4);
        item3 = (android.widget.TextView) findViewById(R.id.item3);
        item2 = (android.widget.TextView) findViewById(R.id.item2);
        item5 = (android.widget.TextView) findViewById(R.id.item5);
        item1 = (android.widget.TextView) findViewById(R.id.item1);
        item21 = (android.widget.TextView) findViewById(R.id.item21);
        item31 = (android.widget.TextView) findViewById(R.id.item31);
        item41 = (android.widget.TextView) findViewById(R.id.item41);
        item51 = (android.widget.TextView) findViewById(R.id.item51);
        modele = (android.widget.TextView) findViewById(R.id.modele);
        marque1 = (android.widget.TextView) findViewById(R.id.marque1);
        btnmenu = (android.widget.Button) findViewById(R.id.btnmenu);
        image = (android.widget.ImageView) findViewById(R.id.image);
        if ()
        if(Souris){
            item1.setText("Filaire");
            item2.setText("DPI");
            item3.setText("Nombre de bouton");
            item4.setText("RGB");
        } else if (Keyboard) {
            item1.setText("Langue du clavier");
            item2.setText("RGB");
            item3.setText("TKL");
            item4.setText("Mecanique");
            item5.setText("Filaire");
        } else if (Ecran) {
            item1.setText("Taille d'écran");
            item2.setText("Fréquence en HZ");
            item3.setText("Latence de l'écran");
            item4.setText("Incurvé");
            item5.setText("Résolution");
        } else if (PC) {
            item1.setText("Portable");
            item1.setText("Processeur");
            item1.setText("Ram");
            item1.setText("Carte graphique");
            item1.setText("Stockage");
            item1.setText("OS");
        }
    }
}
