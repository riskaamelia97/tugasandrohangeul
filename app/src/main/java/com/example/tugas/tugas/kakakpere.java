package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kakakpere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakakpere);
    }
    public void suarakakakpere(View view) {
        final MediaPlayer suarakakakpere = MediaPlayer.create(this, R.raw.kakakpere);
        suarakakakpere.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void previous(View view) {
        Intent intent = new Intent(this,kakaklaki.class);
        startActivity(intent);
    }
}
