package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kakaklaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakaklaki);
    }
    public void suarakakaklaki(View view) {
        final MediaPlayer suarakakaklaki = MediaPlayer.create(this, R.raw.kakaklaki);
        suarakakaklaki.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,kakakpere.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,ibu.class);
        startActivity(intent);
    }
}
