package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kaliningrad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kaliningrad);

    }
    public void onKalinin(View view) {
        Intent intent = new Intent(Kaliningrad.this, AboutKalin.class);
        startActivity(intent);
    }
    public void onNoK(View view) {
        Intent intent = new Intent(Kaliningrad.this, PopRus.class);
        startActivity(intent);
    }
}