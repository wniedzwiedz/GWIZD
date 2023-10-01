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

public class Interwencja extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interwencja);
    }

    public void to_main(View view) {
        Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);
    }

    public void to_interwencja_pomoc(View view) {
        Intent myIntent = new Intent(getApplicationContext(), InterwencjaPomoc.class);
        startActivity(myIntent);
    }

    public void to_uwaga(View view) {

        Intent myIntent = new Intent(getApplicationContext(),Uwaga.class);
        startActivity(myIntent);
    }


}