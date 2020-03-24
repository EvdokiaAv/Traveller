package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kazan extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kazan);
    }
    public void onKazan(View view) {
        Intent intent = new Intent(Kazan.this, AboutKazan.class);
        startActivity(intent);
    }
    public void onNoKaz(View view) {
        Intent intent = new Intent(Kazan.this, PopRus.class);
        startActivity(intent);
    }
}
