package org.vidadura.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent principal = new Intent();
                principal.setClass(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(principal);
                SplashActivity.this.finish();
            }
        }, 5000);

    }
}