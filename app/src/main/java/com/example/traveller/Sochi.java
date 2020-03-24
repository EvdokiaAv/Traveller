package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sochi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sochi);
    }
    public void onSochi(View view) {
        Intent intent = new Intent(Sochi.this, AboutSochi.class);
        startActivity(intent);
    }
    public void onNoS(View view) {
        Intent intent = new Intent(Sochi.this, PopRus.class);
        startActivity(intent);
    }
}
