package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutVlad extends Activity {
    private Spinner spinnerMuseumVlad;
    private TextView textViewDescriptionMuseumVlad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_vlad);

        spinnerMuseumVlad = findViewById(R.id.spinnerMuseumVlad);
        textViewDescriptionMuseumVlad = findViewById(R.id.textViewDescriptionMuseumVlad);
    }
    public void showDescriptionVlad(View view) {
        int position = spinnerMuseumVlad.getSelectedItemPosition();
        String description = getDescriptionByPositionVlad(position);
        textViewDescriptionMuseumVlad.setText(description);

    }
    private String getDescriptionByPositionVlad(int position){
        String[] descriptions = getResources().getStringArray(R.array.VladMuseumDescription);
        return descriptions[position];
    }

}
