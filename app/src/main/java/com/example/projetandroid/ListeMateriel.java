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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListeMateriel extends AppCompatActivity {

    private ListView listViewArticles;
    private ArrayList<Materiel> Type;
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
        if (getIntent().getSerializableExtra("collection") == null) {
            Type = new ArrayList<Materiel>();
        } else {
            Type = (ArrayList<Materiel>) getIntent().getSerializableExtra("collection");
            List<String> ref = new ArrayList<>();
            for (int i = 0; i < Type.size(); i++) {
                List<?> sousliste = (List<?>) Type.get(i);
                for(int j = 0; j < sousliste.size(); j++){
                    Materiel matos = (Materiel) sousliste.get(j);
                    String model = matos.getModele();
                    ref.add(model);
                }
            }
            Log.d("TAG", "initialisation: " + ref);

            ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ref.stream().collect(Collectors.toList()));
            listViewArticles.setAdapter(adp);


            buttonAjout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent suivant = new Intent(ListeMateriel.this, AjoutMateriel.class);
                    suivant.putExtra("collection2", Type);
                    startActivity(suivant);
                }
            });
        }
    }
}
