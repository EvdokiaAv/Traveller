package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutKazan extends Activity {

    private Spinner spinnerMuseumKaz;
    private TextView textViewDescriptionMuseumKaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_kazan);

        spinnerMuseumKaz = findViewById(R.id.spinnerMuseumKaz);
        textViewDescriptionMuseumKaz = findViewById(R.id.textViewDescriptionMuseumKaz);
    }
    public void showDescriptionKaz(View view) {
        int position = spinnerMuseumKaz.getSelectedItemPosition();
        String description = getDescriptionByPositionKaz(position);
        textViewDescriptionMuseumKaz.setText(description);

    }
    private String getDescriptionByPositionKaz(int position){
        String[] descriptions = getResources().getStringArray(R.array.KazMuseumDecription);
        return descriptions[position];
    }
}
