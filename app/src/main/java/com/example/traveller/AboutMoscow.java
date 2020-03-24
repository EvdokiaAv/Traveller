package com.example.traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutMoscow extends Activity {

    private Spinner spinnerMuseum;
    private TextView textViewDescriptionMuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_moscow);


    spinnerMuseum = findViewById(R.id.spinnerMuseum);
    textViewDescriptionMuseum = findViewById(R.id.textViewDescriptionMuseum);
}

    public void showDescription(View view) {
        int position = spinnerMuseum.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        textViewDescriptionMuseum.setText(description);

    }
    private String getDescriptionByPosition(int position){
    String[] descriptions = getResources().getStringArray(R.array.MscMuseumDecription);
    return descriptions[position];
    }
    public void onNoteMsc(View view) {
        Intent intent = new Intent(AboutMoscow.this, NoteAbout.class);
        startActivity(intent);
    }
}
