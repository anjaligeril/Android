package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"hello onCreate", Toast.LENGTH_LONG).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"hello onStart", Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"hello onResume", Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"hello onPause", Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"hello onStop", Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"hello onDestroy", Toast.LENGTH_LONG).show();
        Log.i("tag","onDestroy");
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"hello 0nRestart", Toast.LENGTH_LONG).show();

    }
}
