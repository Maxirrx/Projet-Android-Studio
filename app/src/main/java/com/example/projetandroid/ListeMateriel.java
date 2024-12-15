package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListeMateriel extends AppCompatActivity {

    private ListView listViewArticles;
    private ArrayList<?> Type;
    private List<List<?>> marypoppins;
    private Button buttonAjout1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listemateriel);


        initialisation();
    }


    private void initialisation() {
        listViewArticles = (ListView) findViewById(R.id.listViewArticles);
        buttonAjout1 = (Button) findViewById(R.id.buttonAjout1);
        if((getIntent().getSerializableExtra("collectionnouvel") == null)) {
            marypoppins = (List<List<?>>) getIntent().getSerializableExtra("collection");
        }
            else if((getIntent().getSerializableExtra("collectionnouvel") != null)){
            marypoppins = (List<List<?>>) getIntent().getSerializableExtra("collectionnouvel");
            }else{
            marypoppins = (List<List<?>>) getIntent().getSerializableExtra("collection");
        }
            List<String> ref = new ArrayList<>();
            for (int i = 0; i < marypoppins.size(); i++) {
                List<?> sousliste = (List<?>) marypoppins.get(i);
                for(int j = 0; j < sousliste.size(); j++){
                    Materiel matos = (Materiel) sousliste.get(j);
                    String model = matos.getModele();
                    ref.add(model);
                }
            }


            ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ref.stream().collect(Collectors.toList()));
            listViewArticles.setAdapter(adp);


            buttonAjout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent suivant = new Intent(ListeMateriel.this, AjoutMateriel.class);
                    suivant.putExtra("collection2", (Serializable) marypoppins);
                    startActivity(suivant);
                }
            });

        listViewArticles.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int selectedItem = position;
                Log.d("TAG", "onItemClick: "+ selectedItem);
                int conteur = 0;
                    for (int i = 0; i < marypoppins.size(); i++) {
                        List<?> sousliste = (List<?>) marypoppins.get(i);
                        for(int j = 0; j < sousliste.size(); j++){

                            if(conteur == selectedItem) {
                                Materiel matosexpat = (Materiel) sousliste.get(j);
                                Log.d("sdf", "onItemClick: "+ matosexpat);
                                Intent suivant = new Intent(ListeMateriel.this, DetailMatos.class);
                                suivant.putExtra("collectiondetail", (Serializable) matosexpat);
                                startActivity(suivant);
                            }
                            conteur ++;

                        }

                    }

            }
        });
        }
    }

