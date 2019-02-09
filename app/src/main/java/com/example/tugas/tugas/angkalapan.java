package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkalapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkalapan);
    }
    public void suaralapan(View view) {
        final MediaPlayer suaralapan = MediaPlayer.create(this, R.raw.lapan);
        suaralapan.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkasembilan.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkatujuh.class);
        startActivity(intent);
    }
}
