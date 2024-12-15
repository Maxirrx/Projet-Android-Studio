package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class AjoutMateriel extends AppCompatActivity {

    private List<String> typematos;

    private ArrayList<?> Type;

    private List<List<?>> marypoppins;
    private List<Ecran> Ecrans;
    private List<PC> PCs;
    private List<Souris> Souriss;
    private List<Keyboard> Keyboards;

    private List<?> sousliste;


    private Spinner spinnerMateriel;
    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;
    private TextView item6;

    private EditText marque1;
    private EditText prix1;
    private EditText modele1;
    private EditText couleur1;
    private EditText usage1;
    private EditText item11;
    private EditText item21;
    private EditText item31;
    private EditText item41;
    private EditText item51;
    private EditText item61;

    private Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajoutmateriel);
        initialisation();
    }


    private void initialisation(){

        marque1 = (EditText) findViewById(R.id.marque1);
        prix1 = (EditText) findViewById(R.id.prix1);
        modele1 = (EditText) findViewById(R.id.modele1);
        couleur1 = (EditText) findViewById(R.id.couleur1);
        usage1 = (EditText) findViewById(R.id.usage1);
        item11 = (EditText) findViewById(R.id.item11);
        item21 = (EditText) findViewById(R.id.item21);
        item31 = (EditText) findViewById(R.id.item31);
        item41 = (EditText) findViewById(R.id.item41);
        item51 = (EditText) findViewById(R.id.item51);
        item61 = (EditText) findViewById(R.id.item61);

        item1 = (TextView) findViewById(R.id.item1);
        item2 = (TextView) findViewById(R.id.item2);
        item3 = (TextView) findViewById(R.id.item3);
        item4 = (TextView) findViewById(R.id.item4);
        item5 = (TextView) findViewById(R.id.item5);
        item6 = (TextView) findViewById(R.id.item6);

        btnadd = (Button) findViewById(R.id.btnadd);
        spinnerMateriel = (Spinner) findViewById(R.id.spinnerMateriel);

        if(getIntent().getSerializableExtra("collection2")==null){
            Type = new ArrayList<Objects>();
        }else{
            Type = (ArrayList<?>) getIntent().getSerializableExtra("collection2");
            List<String> typedetruc = new ArrayList<>();
            for (int i = 0; i < Type.size(); i++) {
                sousliste = (List<?>) Type.get(i);
                Log.d("geule", "initialisation: "+ sousliste.get(0));
                for(int j = 0; j < sousliste.size(); j++){
                    Materiel matos = (Materiel) sousliste.get(j);
                    String typesolo = matos.getCequecest();
                    typedetruc.add(typesolo);
                    if (matos instanceof Ecran) {
                        if (Ecrans == null) {
                            Ecrans = new ArrayList<>();
                            Ecrans.add((Ecran) matos);
                        }else {
                            Ecrans.add((Ecran) matos);
                        }
                    } else if (matos instanceof Souris) {
                        if (Souriss == null) {
                            Souriss = new ArrayList<>();
                            Souriss.add((Souris) matos);
                        }else {
                            Souriss.add((Souris) matos);
                        }
                    }else if (matos instanceof Keyboard) {
                        if (Keyboards == null) {
                            Keyboards = new ArrayList<>();
                            Keyboards.add((Keyboard) matos);
                        }else {
                            Keyboards.add((Keyboard) matos);
                        }
                    }else if (matos instanceof PC) {
                        if (PCs == null) {
                            PCs = new ArrayList<>();
                            PCs.add((PC) matos);
                        }else {
                            PCs.add((PC) matos);
                        }
                    }
                }
            }


            Set<String> setSansDoublons = new HashSet<>(typedetruc);
            typematos = new ArrayList<>(setSansDoublons);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, typematos);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerMateriel.setAdapter(adapter);
        }

        spinnerMateriel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String materielSelectionne = typematos.get(position);
                if (materielSelectionne.equals("Ecran")){
                    item1.setText("Taille");
                    item2.setText("Fréquence");
                    item3.setText("Latence");
                    item4.setText("Incurvé");
                    item5.setText("Résolution");
                    item6.setText("");

                    btnadd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (verif() == true){
                                Ecrans.add (new Ecran(1,  marque1.getText().toString(), Integer.parseInt(prix1.getText().toString()), modele1.getText().toString(), couleur1.getText().toString(),  usage1.getText().toString(), "Ecran", Integer.parseInt(item21.getText().toString()), item11.getText().toString(), Integer.parseInt(item31.getText().toString()), true, item51.getText().toString()));
                                Log.d("TAG", "onClick: " + Ecrans);

                            }
                            poursuivre();

                        }
                    });

                } else if (materielSelectionne.equals("Keyboard")) {
                    item1.setText("Type");
                    item2.setText("RGB");
                    item3.setText("TKL");
                    item4.setText("Mecanique" );
                    item5.setText("Filaire");
                    item6.setText("");

                    btnadd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (verif() == true){
                                Keyboards.add (new Keyboard(1,  marque1.getText().toString(), Integer.parseInt(prix1.getText().toString()), modele1.getText().toString(), couleur1.getText().toString(),  usage1.getText().toString(), "Keyboard", item21.getText().toString(),Boolean.parseBoolean( item11.getText().toString()), Boolean.parseBoolean(item31.getText().toString()), Boolean.parseBoolean(item41.getText().toString()), Boolean.parseBoolean(item51.getText().toString())));

                            }
                        }
                    });

                } else if (materielSelectionne.equals("PC")) {
                    item1.setText("Portabilité");
                    item2.setText("Processeur");
                    item3.setText("RAM");
                    item4.setText("Carte graphique");
                    item5.setText("Stockage");
                    item6.setText("OS");

                    btnadd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (verif() == true){
                                PCs.add (new PC(1, marque1.getText().toString(), Integer.parseInt(prix1.getText().toString()), modele1.getText().toString(), couleur1.getText().toString(), usage1.getText().toString(), "PC", Boolean.parseBoolean(item21.getText().toString()), Integer.parseInt(item11.getText().toString()), item31.getText().toString(), item41.getText().toString(), Integer.parseInt(item51.getText().toString()), item61.getText().toString()));
                            }
                        }
                    });

                } else if (materielSelectionne.equals("Souris")) {
                    item1.setText("Filaire");
                    item2.setText("DPI");
                    item3.setText("Nombre de Boutons");
                    item4.setText("RGB");
                    item5.setText("");
                    item6.setText("");

                    btnadd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (verif() == true){
                                Souriss.add (new Souris(1,  marque1.getText().toString(), Integer.parseInt(prix1.getText().toString()), modele1.getText().toString(), couleur1.getText().toString(),  usage1.getText().toString(), "Souris", Boolean.parseBoolean(item21.getText().toString()), Integer.parseInt(item11.getText().toString()), Integer.parseInt(item31.getText().toString()), Boolean.parseBoolean(item41.getText().toString())));

                            }
                        }
                    });

                }else {

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
    private boolean verif(){
        boolean bool = false;
        String marquejava = marque1.getText().toString();
        String modeljava = modele1.getText().toString();
        String prixjava = prix1.getText().toString();
        String couleurjava = couleur1.getText().toString();
        String usagejava = usage1.getText().toString();
        String item1java = item11.getText().toString();
        String item2java = item21.getText().toString();
        String item3java = item31.getText().toString();
        String item4java = item41.getText().toString();
        String item5java = item51.getText().toString();
        String item6java = item61.getText().toString();
        if (marquejava.isEmpty() || modeljava.isEmpty() || prixjava.isEmpty() || couleurjava.isEmpty() || usagejava.isEmpty() || item1java.isEmpty() || item2java.isEmpty() || item3java.isEmpty() || item4java.isEmpty() || item5java.isEmpty() || item6java.isEmpty()) {
            //erreur
            bool =false;
        }else {
            bool = true;
        }
        return bool;
    }

    private void poursuivre() {
        marypoppins = new ArrayList<>();
        if(marypoppins != null) {
            marypoppins.clear();
        }
        marypoppins.add(Ecrans);
        marypoppins.add(Keyboards);
        marypoppins.add(Souriss);
        marypoppins.add(PCs);
        Log.d("TAG", "poursuivre: "+ marypoppins);
        Intent intent = new Intent(AjoutMateriel.this, ListeMateriel.class);
        intent.putExtra("collectionnouvel", (Serializable) marypoppins);
        startActivity(intent);
    }
}


