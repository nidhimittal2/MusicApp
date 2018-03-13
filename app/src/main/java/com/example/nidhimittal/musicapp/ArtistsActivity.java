package com.example.nidhimittal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find the View
        TextView al = (TextView) findViewById(R.id.album_button);

        // Set a click listener on that View
        al.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent alIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(alIntent);
            }
        });

        // Find the View
        TextView bl = (TextView) findViewById(R.id.genre_button);

        // Set a click listener on that View
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent blIntent = new Intent(ArtistsActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(blIntent);
            }
        });

        // Find the View
        TextView pl = (TextView) findViewById(R.id.play_button);

        // Set a click listener on that View
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent plIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(plIntent);
            }
        });

        // Find the View
        TextView back = (TextView) findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent backIntent = new Intent(ArtistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });


    }

}
