package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkadua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkadua);
    }
    public void suaradua(View view) {
        final MediaPlayer suaradua = MediaPlayer.create(this, R.raw.dua);
        suaradua.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkatiga.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angka.class);
        startActivity(intent);
    }
}
