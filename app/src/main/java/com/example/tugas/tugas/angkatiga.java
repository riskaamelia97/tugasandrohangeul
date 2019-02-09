package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkatiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkatiga);
    }
    public void suaratiga(View view) {
        final MediaPlayer suaratiga = MediaPlayer.create(this, R.raw.tiga);
        suaratiga.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkaempat.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkadua.class);
        startActivity(intent);
    }
}
