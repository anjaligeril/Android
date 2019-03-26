package com.example.myapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView) findViewById(R.id.welcomeImage);
        img.animate().alpha(0.1f).setDuration(5000);
        img.setImageResource(R.mipmap.user);
    }
    public void onClickLogin(View v){
        Intent loginIntent=new Intent(this,LoginActivity.class);
        startActivity(loginIntent);

    }

    public void onClickRegister(View v){
        Intent registerIntent=new Intent(this,RegisterActivity.class);
        startActivity(registerIntent);

    }
}
