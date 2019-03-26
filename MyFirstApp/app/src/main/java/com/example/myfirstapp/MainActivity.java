package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View btnView){

        TextView result=(TextView)findViewById(R.id.lblResult);
       // result.setText("changed");
        EditText firstNum=(EditText) findViewById(R.id.txtFirstNo);
        EditText secondNum=(EditText)findViewById(R.id.txtSecondNo);

        int sum=Integer.parseInt(firstNum.getText().toString())+Integer.parseInt(secondNum.getText().toString());
        result.setText("Sum is "+(Integer.toString(sum)));
    }
    public void btnClickSub(View btnView){

        TextView result=(TextView)findViewById(R.id.lblResult);
        // result.setText("changed");
        EditText firstNum=(EditText) findViewById(R.id.txtFirstNo);
        EditText secondNum=(EditText)findViewById(R.id.txtSecondNo);

        int sum=Integer.parseInt(firstNum.getText().toString())-Integer.parseInt(secondNum.getText().toString());
        result.setText("Sub is "+Integer.toString(sum));
    }

    public void btnClickMul(View btnView){

        TextView result=(TextView)findViewById(R.id.lblResult);
        // result.setText("changed");
        EditText firstNum=(EditText) findViewById(R.id.txtFirstNo);
        EditText secondNum=(EditText)findViewById(R.id.txtSecondNo);

        int sum=Integer.parseInt(firstNum.getText().toString())*Integer.parseInt(secondNum.getText().toString());
        result.setText("Multiplication is "+Integer.toString(sum));
    }

    public void btnClickDiv(View btnView){

        TextView result=(TextView)findViewById(R.id.lblResult);
        // result.setText("changed");
        EditText firstNum=(EditText) findViewById(R.id.txtFirstNo);
        EditText secondNum=(EditText)findViewById(R.id.txtSecondNo);

        int sum=Integer.parseInt(firstNum.getText().toString())/Integer.parseInt(secondNum.getText().toString());
        result.setText("division is "+Integer.toString(sum));
    }
}
