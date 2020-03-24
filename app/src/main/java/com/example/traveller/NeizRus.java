package com.example.traveller;
;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NeizRus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neiz_rus);






        }

    public void onCheb(View view) {
        Intent intent = new Intent(NeizRus.this, Chebok.class);
        startActivity(intent);
    }

    public void onEkat(View view) {
        Intent intent = new Intent(NeizRus.this, Ekaterin.class);
        startActivity(intent);
    }

    public void onVor(View view) {
        Intent intent = new Intent(NeizRus.this, Voronez.class);
        startActivity(intent);
    }


    public void onIzev(View view) {
        Intent intent = new Intent(NeizRus.this, Izevsk.class);
        startActivity(intent);
    }
    public void onKur(View view) {
        Intent intent = new Intent(NeizRus.this, Kursk.class);
        startActivity(intent);
    }
    public void onVladi(View view) {
        Intent intent = new Intent(NeizRus.this, Vladivostok.class);
        startActivity(intent);
    }


}
