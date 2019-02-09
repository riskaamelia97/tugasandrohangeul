package com.example.tugas.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button1);
        button6 = (Button) findViewById(R.id.button6);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlfabet();

            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAngka();

            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFamily();
            }


        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTentang();
            }


        });
    }
    public void openAlfabet() {
        Intent intent = new Intent(this,alfabet.class);
        startActivity(intent);
    }
    public void openAngka() {
        Intent intent = new Intent(this,angka.class);
        startActivity(intent);
    }
    public void openFamily() {
        Intent intent = new Intent(this,ayah.class);
        startActivity(intent);
    }
    public void openTentang(){
        Intent intentTentang = new Intent(this,MapsActivity.class);
        startActivity(intentTentang);
    }

    public void clickexit(View view) {
    moveTaskToBack(true);
    android.os.Process.killProcess(android.os.Process.myPid());
    System.exit(1);
}
}
