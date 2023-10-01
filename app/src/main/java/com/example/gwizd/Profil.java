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

public class Profil extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void to_interwencja(View view) {

        Intent myIntent = new Intent(getApplicationContext(),Interwencja.class);
        startActivity(myIntent);
    }

    public void to_zgloszenie(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Zgloszenie.class);
        startActivity(myIntent);
    }

    public void to_main(View view) {
        Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);
    }

    public void to_login(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Login.class);
        startActivity(myIntent);
    }

    public void to_obserwacja(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Obserwacja.class);
        startActivity(myIntent);
    }


}