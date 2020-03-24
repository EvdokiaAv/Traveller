package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Voronez extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.voronez);
    }
    public void onVoronez(View view) {
        Intent intent = new Intent(Voronez.this, AboutVoronez.class);
        startActivity(intent);
    }
    public void onNoVor(View view) {
        Intent intent = new Intent(Voronez.this, NeizRus.class);
        startActivity(intent);
    }

}