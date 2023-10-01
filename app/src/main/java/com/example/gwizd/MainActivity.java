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

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void to_interwencja(View view) {

        Intent myIntent = new Intent(getApplicationContext(),Interwencja.class);
        startActivity(myIntent);
    }

    public void to_zgloszenie(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Zgloszenie.class);
        startActivity(myIntent);
    }

    public void to_profil(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Profil.class);
        startActivity(myIntent);
    }

    public void to_okolica(View view) {
        Intent myIntent = new Intent(getApplicationContext(),Okolica.class);
        startActivity(myIntent);
    }


}