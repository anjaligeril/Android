package com.example.list1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String users[]={"john","jane","sam","alex"};

        ListView lv=(ListView)findViewById(R.id.list);

        ArrayAdapter<String> userData=new ArrayAdapter<String>(this,R.layout.activity_users_list,R.id.userName,users);
        lv.setAdapter(userData);
    }
}
