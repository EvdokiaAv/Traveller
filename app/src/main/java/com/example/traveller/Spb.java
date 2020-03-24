package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Spb extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.spb);
    }
    public void onSpbb(View view) {
        Intent intent = new Intent(Spb.this, AboutSpb.class);
        startActivity(intent);
    }
    public void onNoSp(View view) {
        Intent intent = new Intent(Spb.this, PopRus.class);
        startActivity(intent);
    }
}