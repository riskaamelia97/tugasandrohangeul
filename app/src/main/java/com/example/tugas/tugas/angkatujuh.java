package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkatujuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkatujuh);
    }
    public void suaratujuh(View view) {
        final MediaPlayer suaratujuh = MediaPlayer.create(this, R.raw.tujuh);
        suaratujuh.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkalapan.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkaenam.class);
        startActivity(intent);
    }
}
