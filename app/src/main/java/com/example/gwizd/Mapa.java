package com.example.gwizd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.gwizd.databinding.ActivityMainBinding;

public class Mapa extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);
    }

    public void to_interwencja_pomoc(View view) {
        Intent myIntent = new Intent(getApplicationContext(), InterwencjaPomoc.class);
        startActivity(myIntent);
    }

    public void to_potwierdzenie(View view) {
        Intent myIntent = new Intent(getApplicationContext(), Potwierdzenie.class);
        startActivity(myIntent);
    }

    public void to_main(View view) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
    }

    public void to_profil(View view) {
        Intent myIntent = new Intent(getApplicationContext(), Profil.class);
        startActivity(myIntent);
    }

    public void to_okolica(View view) {
        Intent myIntent = new Intent(getApplicationContext(), Okolica.class);
        startActivity(myIntent);
    }



}