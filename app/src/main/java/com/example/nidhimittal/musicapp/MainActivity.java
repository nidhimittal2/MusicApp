package com.example.nidhimittal.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View
        TextView lib = (TextView) findViewById(R.id.my_lib);

        // Set a click listener on that View
        lib.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent libIntent = new Intent(MainActivity.this, MyLibraryActivity.class);

                // Start the new activity
                startActivity(libIntent);
            }
        });


        TextView browse = (TextView) findViewById(R.id.browse);


        browse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });


        TextView buy = (TextView) findViewById(R.id.buy);


        buy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent buyIntent = new Intent(MainActivity.this, BuyMusicActivity.class);

                // Start the new activity
                startActivity(buyIntent);
            }
        });


    }
}
