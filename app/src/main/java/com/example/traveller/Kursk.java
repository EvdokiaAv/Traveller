package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kursk extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kursk);
    }
    public void onKur(View view) {
        Intent intent = new Intent(Kursk.this, AboutKursk.class);
        startActivity(intent);
    }
    public void onNoKursk(View view) {
        Intent intent = new Intent(Kursk.this, NeizRus.class);
        startActivity(intent);
    }
}
