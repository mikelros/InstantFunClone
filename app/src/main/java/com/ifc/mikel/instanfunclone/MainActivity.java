package com.ifc.mikel.instanfunclone;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playBazinga(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bazinga);
        mp.start();
    }

    public void playGay(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.gaaaay);
        mp.start();
    }

    public void playHaha(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.ha_ha);
        mp.start();
    }

    public void playHadouken(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.hadouken);
        mp.start();
    }

    public void playItsatrap(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.its_a_trap);
        mp.start();
    }

    public void playLeeroy(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.leeeeroy);
        mp.start();
    }
}
