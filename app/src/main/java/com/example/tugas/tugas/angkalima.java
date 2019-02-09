package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkalima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkalima);
    }
    public void suaralima(View view) {
        final MediaPlayer suaralima = MediaPlayer.create(this, R.raw.lima);
        suaralima.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkaenam.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkaempat.class);
        startActivity(intent);
    }
}
