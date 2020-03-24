package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutKursk extends Activity {
    private Spinner spinnerMuseumKursk;
    private TextView textViewDescriptionMuseumKursk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_kursk);

        spinnerMuseumKursk = findViewById(R.id.spinnerMuseumKursk);
        textViewDescriptionMuseumKursk= findViewById(R.id.textViewDescriptionMuseumKursk);
    }
    public void showDescriptionKursk(View view) {
        int position = spinnerMuseumKursk.getSelectedItemPosition();
        String description = getDescriptionByPositionKursk(position);
        textViewDescriptionMuseumKursk.setText(description);

    }
    private String getDescriptionByPositionKursk(int position){
        String[] descriptions = getResources().getStringArray(R.array.KurskMuseumDescription);
        return descriptions[position];
    }

}
