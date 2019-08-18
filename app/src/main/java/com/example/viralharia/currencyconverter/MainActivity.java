package com.example.viralharia.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void convert(View view)  {
        EditText dollarfield = (EditText) findViewById(R.id.dollarfield);
        Double dollarAmount = Double.parseDouble(dollarfield.getText().toString());
        Double inrAmount = dollarAmount * 60.0;
        Toast.makeText(getApplicationContext(), "INR " + inrAmount.toString(), Toast.LENGTH_LONG).show();
    }

}
