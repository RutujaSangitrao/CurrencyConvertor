package com.example.udemy_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText=(EditText)findViewById(R.id.A_pounds);

        String amountInPounds =editText.getText().toString();
        double d= Double.parseDouble(amountInPounds);
        double amountInDollarsDouble =d*1.3;
        String amountInDollarsString=String.format("%.2f",amountInDollarsDouble);

        Toast.makeText(this ,"Pounds" +amountInPounds + "Is $" + amountInDollarsString,Toast.LENGTH_SHORT).show();
       /* Log.i("Amount in dollars",amountInDollarsString );*/
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}