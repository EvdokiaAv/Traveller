package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Volgograd extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.volgograd);
    }
    public void onVolg(View view) {
        Intent intent = new Intent(Volgograd.this, AboutVolgograd.class);
        startActivity(intent);
    }
    public void onNoVol(View view) {
        Intent intent = new Intent(Volgograd.this, PopRus.class);
        startActivity(intent);
    }
}