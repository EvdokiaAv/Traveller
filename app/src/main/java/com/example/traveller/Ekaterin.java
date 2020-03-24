package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ekaterin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ekaterin);
    }
    public void onEkaterin(View view) {
        Intent intent = new Intent(Ekaterin.this, AboutEkaterin.class);
        startActivity(intent);
    }
    public void onNoE(View view) {
        Intent intent = new Intent(Ekaterin.this, PopRus.class);
        startActivity(intent);
    }
}