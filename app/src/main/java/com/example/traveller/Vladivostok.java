package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vladivostok extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vladivostok);
    }
    public void onVlad(View view) {
        Intent intent = new Intent(Vladivostok.this, AboutVlad.class);
        startActivity(intent);
    }
    public void onNoV(View view) {
        Intent intent = new Intent(Vladivostok.this, NeizRus.class);
        startActivity(intent);
    }
}
