package com.example.nidhimittal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Find the View
        TextView a = (TextView) findViewById(R.id.artist_button);

        // Set a click listener on that View
        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent aIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(aIntent);
            }
        });

        // Find the View
        TextView b = (TextView) findViewById(R.id.genre_button);

        // Set a click listener on that View
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent bIntent = new Intent(PlaylistsActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(bIntent);
            }
        });

        // Find the View
        TextView p = (TextView) findViewById(R.id.album_button);

        // Set a click listener on that View
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent pIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(pIntent);
            }
        });

        // Find the View
        TextView back = (TextView) findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent backIntent = new Intent(PlaylistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });


    }

}
