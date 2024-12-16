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

    private EditText marque11;
    private EditText prix11;
    private EditText modele11;
    private EditText couleur11;
    private EditText usage111;
    private EditText item111;
    private EditText item211;
    private EditText item311;
    private EditText item411;
    private EditText item511;
    private EditText item611;

    private Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajoutmateriel);
        initialisation();
    }


    private void initialisation(){

        marque11 = (EditText) findViewById(R.id.marque11);
        prix11 = (EditText) findViewById(R.id.prix11);
        modele11 = (EditText) findViewById(R.id.modele11);
        couleur11 = (EditText) findViewById(R.id.couleur11);
        usage111 = (EditText) findViewById(R.id.usage111);
        item111 = (EditText) findViewById(R.id.item111);
        item211 = (EditText) findViewById(R.id.item211);
        item311 = (EditText) findViewById(R.id.item311);
        item411 = (EditText) findViewById(R.id.item411);
        item511 = (EditText) findViewById(R.id.item511);
        item611 = (EditText) findViewById(R.id.item611);

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
                                Ecrans.add (new Ecran(1,  marque11.getText().toString(), Integer.parseInt(prix11.getText().toString()), modele11.getText().toString(), couleur11.getText().toString(),  usage111.getText().toString(), "Ecran", Integer.parseInt(item211.getText().toString()), item111.getText().toString(), Integer.parseInt(item311.getText().toString()), true, item511.getText().toString()));
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
                                Keyboards.add (new Keyboard(1,  marque11.getText().toString(), Integer.parseInt(prix11.getText().toString()), modele11.getText().toString(), couleur11.getText().toString(),  usage111.getText().toString(), "Keyboard", item211.getText().toString(),Boolean.parseBoolean( item111.getText().toString()), Boolean.parseBoolean(item311.getText().toString()), Boolean.parseBoolean(item411.getText().toString()), Boolean.parseBoolean(item511.getText().toString())));

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
                                PCs.add (new PC(1, marque11.getText().toString(), Integer.parseInt(prix11.getText().toString()), modele11.getText().toString(), couleur11.getText().toString(), usage111.getText().toString(), "PC", Boolean.parseBoolean(item211.getText().toString()), Integer.parseInt(item111.getText().toString()), item311.getText().toString(), item411.getText().toString(), Integer.parseInt(item511.getText().toString()), item611.getText().toString()));
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
                                Souriss.add (new Souris(1,  marque11.getText().toString(), Integer.parseInt(prix11.getText().toString()), modele11.getText().toString(), couleur11.getText().toString(),  usage111.getText().toString(), "Souris", Boolean.parseBoolean(item211.getText().toString()), Integer.parseInt(item111.getText().toString()), Integer.parseInt(item311.getText().toString()), Boolean.parseBoolean(item411.getText().toString())));

                            }
                        }
                    });

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
    private boolean verif(){
        boolean bool = false;
        String marquejava = marque11.getText().toString();
        String modeljava = modele11.getText().toString();
        String prixjava = prix11.getText().toString();
        String couleurjava = couleur11.getText().toString();
        String usagejava = usage111.getText().toString();
        String item1java = item111.getText().toString();
        String item2java = item211.getText().toString();
        String item3java = item311.getText().toString();
        String item4java = item411.getText().toString();
        String item5java = item511.getText().toString();
        String item6java = item611.getText().toString();
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


