package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkaempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkaempat);
    }
    public void suaraempat(View view) {
        final MediaPlayer suaraempat = MediaPlayer.create(this, R.raw.empat);
        suaraempat.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkalima.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkatiga.class);
        startActivity(intent);
    }
}
