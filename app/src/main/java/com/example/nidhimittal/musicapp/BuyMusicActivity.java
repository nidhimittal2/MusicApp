package com.example.nidhimittal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class BuyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        // Find the View that shows the numbers category
        TextView p = (TextView) findViewById(R.id.register);

        // Set a click listener on that View
        p.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent pIntent = new Intent(BuyMusicActivity.this, PaymentActivity.class);

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

                Intent backIntent = new Intent(BuyMusicActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });
    }

}
