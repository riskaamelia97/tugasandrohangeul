package com.example.tugas.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tv;
private TextView tv1;
private TextView tv2;
private TextView tv3;
private TextView tv4;
private TextView tv5;
private TextView tv6;
private TextView tv7;
private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);


        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        tv1.startAnimation(myanim);
        tv2.startAnimation(myanim);
        tv3.startAnimation(myanim);
        tv4.startAnimation(myanim);
        tv5.startAnimation(myanim);
        tv6.startAnimation(myanim);
        iv.startAnimation(myanim);
        final Intent i = new Intent(this, Main2Activity.class);
        Thread timer =new Thread(){
            public void run (){
                try{
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();

                }

            }
        };
        timer.start();
    }
}
