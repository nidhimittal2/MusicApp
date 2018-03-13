package com.example.nidhimittal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Find the View
        TextView alb = (TextView) findViewById(R.id.album_button);

        // Set a click listener on that View
        alb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent albIntent = new Intent(GenresActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albIntent);
            }
        });

        // Find the View
        TextView blb = (TextView) findViewById(R.id.artist_button);

        // Set a click listener on that View
        blb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent blbIntent = new Intent(GenresActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(blbIntent);
            }
        });

        // Find the View
        TextView plb = (TextView) findViewById(R.id.play_button);

        // Set a click listener on that View
        plb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent plbIntent = new Intent(GenresActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(plbIntent);
            }
        });

        // Find the View
        TextView back = (TextView) findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent backIntent = new Intent(GenresActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });


    }

}
