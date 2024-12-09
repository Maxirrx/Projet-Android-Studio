package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Utilisateur> mesUtilisateurs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUser();
        EditText edtLogin = findViewById(R.id.editTextnom);
        EditText edtPassword = findViewById(R.id.editTextmdp);
        Button buttonConnexion = findViewById(R.id.buttonconnexion);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = edtLogin.getText().toString();
                String password = edtPassword.getText().toString();
                controle(login, password);
            }
        });
    }
    private void initUser() {
        mesUtilisateurs.add(new Utilisateur("faible", "max"));
        mesUtilisateurs.add(new Utilisateur("fort", "jules"));
    }
    private boolean controle(String login, String mdp) {
        boolean controleB = false;
        for (Utilisateur utilisateur : mesUtilisateurs) {
            if (utilisateur.getLogin().equals(login) && utilisateur.getMdp().equals(mdp)) {
                Toast.makeText(MainActivity.this, "Mot de passe correct : Connexion en cour...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ListeMateriel.class);
                startActivity(intent);
                controleB = true;
            } else {
                Toast.makeText(MainActivity.this, "Mot de passe incorrect ! ", Toast.LENGTH_SHORT).show();
                controleB = false;
            }
        }
        return controleB;
    }






}