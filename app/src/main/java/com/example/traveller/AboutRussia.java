package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutRussia extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.about_russia);
    }


  public void onNeiz(View view) {
        Intent intent = new Intent(AboutRussia.this, NeizRus.class);
        startActivity(intent);
    }

    public void onPop(View view) {
        Intent intent = new Intent(AboutRussia.this, PopRus.class);
        startActivity(intent);
    }

}
