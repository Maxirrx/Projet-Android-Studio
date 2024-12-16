package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.List;

public class DetailMatos extends AppCompatActivity {

    private TextView usage;
    private TextView usage1;
    private TextView marque;
    private TextView item11;
    private TextView item4;
    private TextView item3;
    private TextView item2;
    private TextView item5;
    private TextView item6;
    private TextView item61;
    private TextView couleur1;
    private TextView item1;
    private TextView item21;
    private TextView item31;
    private TextView item41;
    private TextView item51;
    private TextView modele1;
    private TextView modele;
    private TextView marque1;
    private Button btnmenu;
    private Button btnsupp;
    private ImageView image;
    private Object matosexpat;
    private TextView prix1;

    private List<List<?>> marypoppins;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmatos);
        initilialisation();
    }

    private void initilialisation() {
        btnsupp = (android.widget.Button) findViewById(R.id.btnsupp);
        couleur1 = (android.widget.TextView) findViewById(R.id.couleur1);
        modele1 = (android.widget.TextView) findViewById(R.id.modele1);
        usage = (android.widget.TextView) findViewById(R.id.usage);
        usage1 = (android.widget.TextView) findViewById(R.id.usage1);
        marque = (android.widget.TextView) findViewById(R.id.marque);
        item11 = (android.widget.TextView) findViewById(R.id.item11);
        item4 = (android.widget.TextView) findViewById(R.id.item4);
        item3 = (android.widget.TextView) findViewById(R.id.item3);
        item2 = (android.widget.TextView) findViewById(R.id.item2);
        item5 = (android.widget.TextView) findViewById(R.id.item5);
        item6 = (android.widget.TextView) findViewById(R.id.item6);
        item61 = (android.widget.TextView) findViewById(R.id.item61);
        item1 = (android.widget.TextView) findViewById(R.id.item1);
        item21 = (android.widget.TextView) findViewById(R.id.item21);
        item31 = (android.widget.TextView) findViewById(R.id.item31);
        item41 = (android.widget.TextView) findViewById(R.id.item41);
        item51 = (android.widget.TextView) findViewById(R.id.item51);
        modele = (android.widget.TextView) findViewById(R.id.modele);
        marque1 = (android.widget.TextView) findViewById(R.id.marque1);
        prix1 = (android.widget.TextView) findViewById(R.id.prix1);
        btnmenu = (android.widget.Button) findViewById(R.id.btnmenu);
        image = (android.widget.ImageView) findViewById(R.id.image);


        final int[] indexe = {(int) getIntent().getSerializableExtra("indexe")};
        marypoppins = (List<List<?>>) getIntent().getSerializableExtra("collectiontotal");



        Object lepasseur = getIntent().getSerializableExtra("collectiondetail");
        if (lepasseur instanceof Ecran) {
            matosexpat = (Ecran) lepasseur;
        } else if (lepasseur instanceof Keyboard) {
            matosexpat = (Keyboard) lepasseur;
        } else if (lepasseur instanceof Souris) {
            matosexpat = (Souris) lepasseur;
        } else if (lepasseur instanceof PC) {
            matosexpat = (PC) lepasseur;
        }

        if (matosexpat instanceof Ecran){
            item1.setText("Taille");
            item2.setText("Fréquence");
            item3.setText("Latence");
            item4.setText("Incurvé");
            item5.setText("Résolution");
            item6.setText("");

            marque1.setText(((Ecran) matosexpat).getMarque());
            prix1.setText(String.valueOf(((Ecran) matosexpat).getPrix()));
            couleur1.setText(((Ecran) matosexpat).getCouleur());
            modele1.setText(((Ecran) matosexpat).getModele());
            usage1.setText(((Ecran) matosexpat).getUsage());

            item11.setText(((Ecran) matosexpat).getTaille());
            item21.setText(String.valueOf(((Ecran) matosexpat).getFrequence()));
            item31.setText(String.valueOf(((Ecran) matosexpat).getLatence()));
            item41.setText(((Ecran) matosexpat).isIncurve() ? "Oui" : "Non");
            item51.setText(((Ecran) matosexpat).getResolution());
            item61.setText("");


        } else if (matosexpat instanceof Keyboard) {
            item1.setText("Type");
            item2.setText("RGB");
            item3.setText("TKL");
            item4.setText("Mecanique" );
            item5.setText("Filaire");
            item6.setText("");

            marque1.setText(((Keyboard) matosexpat).getMarque());
            prix1.setText(String.valueOf(((Keyboard) matosexpat).getPrix()));
            couleur1.setText(((Keyboard) matosexpat).getCouleur());
            modele1.setText(((Keyboard) matosexpat).getModele());
            usage1.setText(((Keyboard) matosexpat).getUsage());

            item11.setText(((Keyboard) matosexpat).getType());
            item21.setText(((Keyboard) matosexpat).isRgb() ? "Oui" : "Non");
            item31.setText(((Keyboard) matosexpat).isTkl() ? "Oui" : "Non");
            item41.setText(((Keyboard) matosexpat).isMecanique() ? "Oui" : "Non");
            item51.setText(((Keyboard) matosexpat).isFilaire() ? "Oui" : "Non");
            item61.setText("");



        } else if (matosexpat instanceof PC) {
            item1.setText("Portabilité");
            item2.setText("Processeur");
            item3.setText("RAM");
            item4.setText("Carte graphique");
            item5.setText("Stockage");
            item6.setText("OS");

            marque1.setText(((PC) matosexpat).getMarque());
            prix1.setText(String.valueOf(((PC) matosexpat).getPrix()));
            couleur1.setText(((PC) matosexpat).getCouleur());
            modele1.setText(((PC) matosexpat).getModele());
            usage1.setText(((PC) matosexpat).getUsage());

            item11.setText(((PC) matosexpat).isPortabilite() ? "Oui" : "Non");
            item21.setText(((PC) matosexpat).getProcesseur());
            item31.setText(((PC) matosexpat).getRam() + "GO");
            item41.setText(((PC) matosexpat).getCartegraphique());
            item51.setText(((PC) matosexpat).getStockage() + "GO");
            item61.setText(((PC) matosexpat).getOs());


        } else if (matosexpat instanceof Souris) {
            item1.setText("Filaire");
            item2.setText("DPI");
            item3.setText("Nombre de Boutons");
            item4.setText("RGB");
            item5.setText("");
            item6.setText("");

            marque1.setText(((Souris) matosexpat).getMarque());
            prix1.setText(String.valueOf(((Souris) matosexpat).getPrix()));
            couleur1.setText(((Souris) matosexpat).getCouleur());
            modele1.setText(((Souris) matosexpat).getModele());
            usage1.setText(((Souris) matosexpat).getUsage());

            item11.setText(((Souris) matosexpat).isFilaire() ? "Oui" : "Non");
            item21.setText(String.valueOf(((Souris) matosexpat).getDpi()));
            item31.setText(String.valueOf(((Souris) matosexpat).getNbrBtn()));
            item41.setText(((Souris) matosexpat).isRgb() ? "Oui" : "Non");
            item51.setText("");
            item61.setText("");

        }
        btnsupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int conteurnew = 0;
                for (int i = 0; i < marypoppins.size(); i++) {
                    List<?> sousliste = (List<?>) marypoppins.get(i);
                    for(int j = 0; j < sousliste.size(); j++){

                        if(indexe[0] == conteurnew) {
                            marypoppins.remove(indexe[0]);
                            Log.d("sdf", "onItemClick: "+ marypoppins);
                            Intent suivant = new Intent(DetailMatos.this, ListeMateriel.class);
                            suivant.putExtra("collectionnouvel", (Serializable) marypoppins);
                            startActivity(suivant);
                        }
                        indexe[0]++;

                    }

                }

            }
        });
   }
}

