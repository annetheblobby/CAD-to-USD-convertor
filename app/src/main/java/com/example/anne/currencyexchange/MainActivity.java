package com.example.anne.currencyexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText myTextField=(EditText)findViewById(R.id.editText);
        Log.i("Info",myTextField.getText().toString());
        double val = Double.parseDouble(myTextField.getText().toString());
        double end = val* 1.31;
        BigDecimal bd = new BigDecimal(Double.toString(end));
        bd = bd.setScale(2, RoundingMode.HALF_UP);



        Toast.makeText(MainActivity.this,String.valueOf(bd), Toast.LENGTH_SHORT).show();

        Log.i("info","button pressed");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

