package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutVoronez extends Activity {

    private Spinner spinnerMuseumVoronez;
    private TextView textViewDescriptionMuseumVoronez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_voronez);

        spinnerMuseumVoronez = findViewById(R.id.spinnerMuseumVoronez);
        textViewDescriptionMuseumVoronez = findViewById(R.id.textViewDescriptionMuseumVoronez);
    }
    public void showDescriptionVoronez(View view) {
        int position = spinnerMuseumVoronez.getSelectedItemPosition();
        String description = getDescriptionByPositionVoronez(position);
        textViewDescriptionMuseumVoronez.setText(description);

    }
    private String getDescriptionByPositionVoronez(int position){
        String[] descriptions = getResources().getStringArray(R.array.VoronezMuseumDescription);
        return descriptions[position];
    }

}

