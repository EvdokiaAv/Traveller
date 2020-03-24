package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chebok extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chebok);
    }
    public void onChebok(View view) {
        Intent intent = new Intent(Chebok.this, AboutChebok.class);
        startActivity(intent);
    }
    public void onNo(View view) {
        Intent intent = new Intent(Chebok.this, NeizRus.class);
        startActivity(intent);
    }
}
