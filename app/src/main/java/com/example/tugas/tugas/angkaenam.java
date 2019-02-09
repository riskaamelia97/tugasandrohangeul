package com.example.tugas.tugas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angkaenam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkaenam);
    }
    public void suaraenam(View view) {
        final MediaPlayer suaraenam = MediaPlayer.create(this, R.raw.enam);
        suaraenam.start();
    }

    public void close(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,angkatujuh.class);
        startActivity(intent);
    }
    public void previous(View view) {
        Intent intent = new Intent(this,angkalima.class);
        startActivity(intent);
    }
}
