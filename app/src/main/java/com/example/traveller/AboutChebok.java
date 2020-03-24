package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutChebok extends Activity {

    private Spinner spinnerMuseumChebok;
    private TextView textViewDescriptionMuseumChebok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_chebok);

        spinnerMuseumChebok = findViewById(R.id.spinnerMuseumChebok);
        textViewDescriptionMuseumChebok = findViewById(R.id.textViewDescriptionMuseumChebok);
    }
    public void showDescriptionChebok(View view) {
        int position = spinnerMuseumChebok.getSelectedItemPosition();
        String description = getDescriptionByPositionChebok(position);
        textViewDescriptionMuseumChebok.setText(description);

    }
    private String getDescriptionByPositionChebok(int position){
        String[] descriptions = getResources().getStringArray(R.array.ChebokMuseumDescription);
        return descriptions[position];
    }
}


