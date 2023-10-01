package com.example.gwizd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Potwierdzenie extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potwierdzenie);
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
    public void to_main(View view) {
        Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);
    }



}