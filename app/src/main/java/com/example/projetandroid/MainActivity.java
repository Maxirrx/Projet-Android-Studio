package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private EditText edtLogin;
    private EditText edtPassword;
    private Button buttonConnexion;
    private ArrayList<Utilisateur> mesUtilisateurs;
    private List<List<?>> marypoppins;
    private List<Ecran> Ecrans;
    private List<PC> PCs;
    private List<Souris> Souriss;
    private List<Keyboard> Keyboards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        initUser();
        initMateriel();
        edtLogin = (EditText) findViewById(R.id.editTextnom);
        edtPassword = (EditText) findViewById(R.id.editTextmdp);
        buttonConnexion = (Button) findViewById(R.id.buttonconnexion);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = edtLogin.getText().toString();
                String mdp = edtPassword.getText().toString();
                if (controle(login, mdp)) {
                    Intent intent = new Intent(MainActivity.this, ListeMateriel.class);
                    intent.putExtra("collection", (Serializable) marypoppins);
                    startActivity(intent);
                } else {

                }
            }
        });
    }

    private void initUser() {
        mesUtilisateurs = new ArrayList<>();
        mesUtilisateurs.add(new Utilisateur("faible", "maxetwissem"));
        mesUtilisateurs.add(new Utilisateur("fort", "julesyann"));
        mesUtilisateurs.add(new Utilisateur("root", "root"));

    }

    private boolean controle(String login, String mdp) {
        boolean verif = false;
        for (Utilisateur utilisateur : mesUtilisateurs) {
            if (utilisateur.getLogin().equals(login) && utilisateur.getMdp().equals(mdp)) {
                verif = true;
            } else {
                verif = false;
            }
        }
        return verif;
    }

    private void initMateriel() {
        marypoppins = new ArrayList<>();
        Ecrans = new ArrayList<>();
        PCs = new ArrayList<>();
        Souriss = new ArrayList<>();
        Keyboards = new ArrayList<>();
        Ecrans.add (new Ecran(1,"Samsung",200,"Odyssey G5","noir","Gaming","Ecran",144,"32 pouces",10,true,"2560 x 1440"));
        Ecrans.add (new Ecran(2,"Samsung",300,"Odyssey G6","bleu","Gaming","Ecran",240,"32 pouces",1,true,"2560 x 1660"));
        Keyboards.add (new Keyboard(3,"razer",120,"deathtalker","noire","gaming","Keyboard","azerty",true,true,true,false));
        Keyboards.add (new Keyboard(4,"logitech",40,"K650","noire","clavier de bureau","Keyboard","qwerty",false,false,false,true));
        Souriss.add (new Souris(5,"logitech",65,"M185","noire","souris de bureau","Souris",true,800,0,false));
        Souriss.add (new Souris(6,"razer",100,"naga","noire et rouge","gaming","Souris",false,1600,9,true));
        PCs.add (new PC(7,"alienware",1000,"m16 R2","blanc","gaming","PC",false,16,"geforce rtx 4070 ti","nvidia intel core i9",2,"Windows 11"));
        PCs.add (new PC(8,"hp",600,"PavilionPlus 14-ey0018nf","gris","programmation et bureautique","PC", false,16,"rtx 1080","nvidia intel core i7",1,"Windows"));
        marypoppins.add(Ecrans);
        marypoppins.add(Keyboards);
        marypoppins.add(Souriss);
        marypoppins.add(PCs);
        Log.d("maiun", "initMateriel: "+ marypoppins);
    }
}
