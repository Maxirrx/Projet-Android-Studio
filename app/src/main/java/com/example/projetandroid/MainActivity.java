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

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private EditText edtLogin;
    private EditText edtPassword;
    private Button buttonConnexion;
    private ArrayList<Materiel> Materiels;
    private ArrayList<Utilisateur> mesUtilisateurs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        initUser();
        edtLogin = (EditText)findViewById(R.id.editTextnom);
        edtPassword = (EditText) findViewById(R.id.editTextmdp);
        buttonConnexion = (Button) findViewById(R.id.buttonconnexion);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = edtLogin.getText().toString();
                String password = edtPassword.getText().toString();
                controle(login, password);
                initMateriel();
                persister();
            }

        });
    }
    private void initUser() {
        mesUtilisateurs.add(new Utilisateur("faible", "maxetwissem"));
        mesUtilisateurs.add(new Utilisateur("fort", "julesyann"));
        mesUtilisateurs.add(new Utilisateur("root", "root"));

    }
    private boolean controle(String login, String mdp) {
        boolean controleB = false;
        for (Utilisateur utilisateur : mesUtilisateurs) {
            if (utilisateur.getLogin().equals(login) && utilisateur.getMdp().equals(mdp)) {
                Toast.makeText(MainActivity.this, "Mot de passe correct !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ListeMateriel.class);
                startActivity(intent);
                controleB = true;
                break;
            } else {
                Toast.makeText(MainActivity.this, "Mot de passe incorrect ! ", Toast.LENGTH_SHORT).show();
                controleB = false;
            }

        }
        return controleB;
    }
private void initMateriel(){
    Ecran ecran1 = new Ecran(1,"Samsung",200,"noire","Odyssey G5","Gaming","32 pouces",144,10,true,"2560 x 1440");
    Ecran ecran2 = new Ecran(2,"Samsung",300,"bleu","Odyssey G6","Gaming","34 pouces",240,1,true,"2560 x 1660");
    Keyboard clavier1 = new Keyboard(3,"razer",120,"deathtalker","noire","gaming","azerty",true,true,true,false);
    Keyboard clavier2 = new Keyboard(4,"logitech",40,"K650","noire","clavier de bureau","qwerty",false,false,false,true);
    Souris souris1 = new Souris(5,"logitech",65,"M185","noire","souris de bureau",true,800,0,false);
    Souris souris2 = new Souris(6,"razer",100,"naga","noire et rouge","gaming",false,1600,9,true);
    PC pc1 = new PC(7,"alienware",1000,"m16 R2","blanc","gaming",false,"nvidia intel core i9",16,"geforce rtx 4070 ti"," Gigabite b760",2,"Windows 11");
    PC pc2 = new PC(8,"hp",600,"PavilionPlus 14-ey0018nf","gris","programmation et bureautique",false,"nvidia intel core i7",16,"rtx 1080","gigabite a50",1,"Windows");
    Materiels = new ArrayList<>();
    Materiels.add(ecran1);
    Materiels.add(ecran2);
    Materiels.add(clavier1);
    Materiels.add(clavier2);
    Materiels.add(souris1);
    Materiels.add(souris2);
    Materiels.add(pc1);
    Materiels.add(pc2);
    }

private void persister(){
        Intent intent = new Intent(MainActivity.this, ListeMateriel.class);
        intent.putExtra("collection", Materiels);
        startActivity(intent);
    }
}