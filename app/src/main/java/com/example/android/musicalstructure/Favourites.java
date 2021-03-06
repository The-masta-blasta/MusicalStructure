package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Favourites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        // Find the home button view
        ImageButton home = (ImageButton) findViewById(R.id.playing);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Favourites.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });

        // Find the home button view
        ImageButton artists = (ImageButton) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(Favourites.this, Artists.class);
                startActivity(artistsIntent);
                finish();
            }
        });

        // Find the home button view
        ImageButton favourites = (ImageButton) findViewById(R.id.favourites);

        // Set a click listener on that View
        favourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesIntent = new Intent(Favourites.this, Favourites.class);
                startActivity(favouritesIntent);
                finish();
            }
        });

        // Find the home button view
        ImageButton albums = (ImageButton) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(Favourites.this, Albums.class);
                startActivity(albumsIntent);
                finish();
            }
        });

        // Find the home button view
        ImageButton songs = (ImageButton) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(Favourites.this, Songs.class);
                startActivity(songsIntent);
                finish();
            }
        });
    }
}
