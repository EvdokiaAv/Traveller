package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutSpb extends Activity {

    private Spinner spinnerMuseumSpb;
    private TextView textViewDescriptionMuseumSpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_spb);

        spinnerMuseumSpb = findViewById(R.id.spinnerMuseumSpb);
        textViewDescriptionMuseumSpb = findViewById(R.id.textViewDescriptionMuseumSpb);
    }
    public void showDescriptionSpb(View view) {
        int position = spinnerMuseumSpb.getSelectedItemPosition();
        String description = getDescriptionByPositionSpb(position);
        textViewDescriptionMuseumSpb.setText(description);

    }
    private String getDescriptionByPositionSpb(int position){
        String[] descriptions = getResources().getStringArray(R.array.SpbMuseumDescription);
        return descriptions[position];
    }
}


