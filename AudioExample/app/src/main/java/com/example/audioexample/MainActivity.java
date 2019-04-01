package com.example.audioexample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playBtn(View v){
        int rId=v.getId();
        String id=v.getResources().getResourceEntryName(rId);
        Toast.makeText(this,"you clicked"+id,Toast.LENGTH_LONG).show();
        int resourseId=getResources().getIdentifier(id,"raw","com.example.audioexample");
        MediaPlayer mp=MediaPlayer.create(this,resourseId);
       mp.start();
    }
   /* public void playBtnGun(View v){
        MediaPlayer mp=MediaPlayer.create(this,R.raw.gun);
        mp.start();
    }
    public void playBtnCow(View v){
        MediaPlayer mp=MediaPlayer.create(this,R.raw.cow);
        mp.start();
    }
    public void playBtnBell(View v){
        MediaPlayer mp=MediaPlayer.create(this,R.raw.bell);
        mp.start();
    }
    public void playBtnDog(View v){
        MediaPlayer mp=MediaPlayer.create(this,R.raw.dog);
        mp.start();
    }*/
}
