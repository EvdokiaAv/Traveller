package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutSochi extends Activity {

    private Spinner spinnerMuseumSoc;
    private TextView textViewDescriptionMuseumSoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_sochi);

        spinnerMuseumSoc = findViewById(R.id.spinnerMuseumSoc);
        textViewDescriptionMuseumSoc = findViewById(R.id.textViewDescriptionMuseumSoc);
    }
    public void showDescriptionSoc(View view) {
        int position = spinnerMuseumSoc.getSelectedItemPosition();
        String description = getDescriptionByPositionSochi(position);
        textViewDescriptionMuseumSoc.setText(description);

    }
    private String getDescriptionByPositionSochi(int position){
        String[] descriptions = getResources().getStringArray(R.array.SochiMuseumDescripton);
        return descriptions[position];
    }
}
