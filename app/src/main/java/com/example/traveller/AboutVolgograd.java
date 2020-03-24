package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutVolgograd extends Activity {

    private Spinner spinnerMuseumVolgograd;
    private TextView textViewDescriptionMuseumVolgograd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_volgograd);

        spinnerMuseumVolgograd = findViewById(R.id.spinnerMuseumVolgograd);
        textViewDescriptionMuseumVolgograd = findViewById(R.id.textViewDescriptionMuseumVolgograd);
    }
    public void showDescriptionKal(View view) {
        int position = spinnerMuseumVolgograd.getSelectedItemPosition();
        String description = getDescriptionByPositionVolgograd(position);
        textViewDescriptionMuseumVolgograd.setText(description);

    }
    private String getDescriptionByPositionVolgograd(int position){
        String[] descriptions = getResources().getStringArray(R.array.VolgogradMuseumDescription);
        return descriptions[position];
    }
}