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
    }
}
