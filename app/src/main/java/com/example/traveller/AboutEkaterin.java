package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutEkaterin extends Activity {
    private Spinner spinnerMuseumEkaterin;
    private TextView textViewDescriptionMuseumEkaterin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_ekaterin);

        spinnerMuseumEkaterin = findViewById(R.id.spinnerMuseumEkaterin);
        textViewDescriptionMuseumEkaterin = findViewById(R.id.textViewDescriptionMuseumEkaterin);
    }
    public void showDescriptionEkaterin(View view) {
        int position = spinnerMuseumEkaterin.getSelectedItemPosition();
        String description = getDescriptionByPositionEkaterin(position);
        textViewDescriptionMuseumEkaterin.setText(description);

    }
    private String getDescriptionByPositionEkaterin(int position){
        String[] descriptions = getResources().getStringArray(R.array.EkaterinMuseumDescription);
        return descriptions[position];
    }

}
