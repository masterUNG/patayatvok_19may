package com.royle.tv4k;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class Mxplayer extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mxplayer);




        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Mxplayer.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

    }

}

