package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Moscow extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.moscow);
        }
    public void onMsc(View view) {
        Intent intent = new Intent(Moscow.this, AboutMoscow.class);
        startActivity(intent);
    }
    public void onNoM(View view) {
        Intent intent = new Intent(Moscow.this, PopRus.class);
        startActivity(intent);
    }
}
