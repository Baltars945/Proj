package com.example.monappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView titre;

public Button actionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {android
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.titre = (TextView) findViewById(R.id.titre);
        this.titre.setText("Je suis un texte modifié par JAVA");
        this.actionBtn = (Button) findViewById(R.id.ConnexionBTN);
        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.plop);
                mediaplayer.start();
            }
        });

        );
    }
}