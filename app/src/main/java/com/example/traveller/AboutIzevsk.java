package com.example.traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutIzevsk extends Activity {
    private Spinner spinnerMuseumIzevsk;
    private TextView textViewDescriptionMuseumIzevsk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_izevsk);

        spinnerMuseumIzevsk = findViewById(R.id.spinnerMuseumIzevsk);
        textViewDescriptionMuseumIzevsk = findViewById(R.id.textViewDescriptionMuseumIzevsk);
    }
    public void showDescriptionIzevsk(View view) {
        int position = spinnerMuseumIzevsk.getSelectedItemPosition();
        String description = getDescriptionByPositionIzevsk(position);
        textViewDescriptionMuseumIzevsk.setText(description);

    }
    private String getDescriptionByPositionIzevsk(int position){
        String[] descriptions = getResources().getStringArray(R.array.IzevskMuseumDescription);
        return descriptions[position];
    }

}
