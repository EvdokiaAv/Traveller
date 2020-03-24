package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PopRus extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_rus);
    }
    public void onMos(View view) {
        Intent intent = new Intent(PopRus.this, Moscow.class);
        startActivity(intent);
    }
    public void onKaz(View view) {
        Intent intent = new Intent(PopRus.this, Kazan.class);
        startActivity(intent);
    }

    public void onSoc(View view) {
        Intent intent = new Intent(PopRus.this, Sochi.class);
        startActivity(intent);
    }

    public void onKal (View view) {
        Intent intent = new Intent(PopRus.this, Kaliningrad.class);
        startActivity(intent);
    }

    public void onVolgo(View view) {
        Intent intent = new Intent(PopRus.this,  Volgograd.class);
        startActivity(intent);
    }

    public void onSpb(View view) {
        Intent intent = new Intent(PopRus.this, Spb.class);
        startActivity(intent);
    }
}
