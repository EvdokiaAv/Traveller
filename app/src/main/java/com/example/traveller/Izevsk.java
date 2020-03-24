package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Izevsk extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.izevsk);
    }
    public void onIzevsk(View view) {
        Intent intent = new Intent(Izevsk.this, AboutIzevsk.class);
        startActivity(intent);
    }
    public void onNoI(View view) {
        Intent intent = new Intent(Izevsk.this, NeizRus.class);
        startActivity(intent);
    }
}