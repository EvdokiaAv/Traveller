package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutKalin extends Activity {

    private Spinner spinnerMuseumKal;
    private TextView textViewDescriptionMuseumKal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_kalin);

        spinnerMuseumKal = findViewById(R.id.spinnerMuseumKal);
        textViewDescriptionMuseumKal = findViewById(R.id.textViewDescriptionMuseumKal);
    }
    public void showDescriptionKal(View view) {
        int position = spinnerMuseumKal.getSelectedItemPosition();
        String description = getDescriptionByPositionKal(position);
        textViewDescriptionMuseumKal.setText(description);

    }
    private String getDescriptionByPositionKal(int position){
        String[] descriptions = getResources().getStringArray(R.array.KazMuseumDecription);
        return descriptions[position];
    }
}
