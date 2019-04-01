package com.example.imagesbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtnImage(View v){
        int id=v.getId();
       //Toast.makeText(this,"id "+id,Toast.LENGTH_LONG).show();
       String imgId=v.getResources().getResourceEntryName(id);
       //Toast.makeText(this,"id "+imgId,Toast.LENGTH_LONG).show();
       int resourseId=getResources().getIdentifier(imgId,"mipmap","com.example.imagesbutton");
        Toast.makeText(this,"id "+resourseId,Toast.LENGTH_LONG).show();
      ImageView image=(ImageView)findViewById(R.id.image);
      try {
          image.setImageResource(resourseId);
      }catch(Exception e){
        Log.i("error","exception");
      }
    }
}
