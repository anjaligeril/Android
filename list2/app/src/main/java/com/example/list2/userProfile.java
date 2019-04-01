package com.example.list2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class userProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Intent userIntent = getIntent();
        String name=userIntent.getStringExtra("userName");
        TextView userName=(TextView)findViewById(R.id.name);
        userName.setText(name);
    }
}
