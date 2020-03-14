package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.StringReader;

public class DetailsActivity extends AppCompatActivity {

    private TextView name;
    private TextView description;
    private TextView rating;
    private Bundle extras;
    private final String BUNDLE_NAME_KEY = "name";
    private final String BUNDLE_DESCRIPTION_KEY = "description";
    private final String BUNDLE_RATING_KEY = "rating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        name = (TextView) findViewById(R.id.dNameTextView_ID);
        description = (TextView) findViewById(R.id.dDescriptionTextView_ID);
        rating = (TextView) findViewById(R.id.dRatingTV_ID);

        if(extras != null){
            name.setText(extras.getString(BUNDLE_NAME_KEY));
            description.setText(extras.getString(BUNDLE_DESCRIPTION_KEY));
            rating.setText(extras.getString(BUNDLE_RATING_KEY));
        }
    }
}
