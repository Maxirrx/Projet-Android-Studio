package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListeMateriel extends AppCompatActivity {

    private ListView listViewArticles;
    private ArrayList<Materiel> Materiels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listemateriel);
        initialisation();
    }

    private void initialisation(){
        listViewArticles = (ListView) findViewById(R.id.listViewArticles);
        if(getIntent().getSerializableExtra("collection")==null){
            Materiels = new ArrayList<Materiel>();
        }else{
            Materiels = (ArrayList<Materiel>) getIntent().getSerializableExtra("collection");
            ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Materiels.stream().map(h->h.getModele()).collect(Collectors.toList()));
            listViewArticles.setAdapter(adp);
        }
    }
}
