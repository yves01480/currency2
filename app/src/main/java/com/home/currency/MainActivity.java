package com.home.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed_ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_ntd = findViewById(R.id.NTD);
    }


    public void go(View view){
        if (ed_ntd != null && ed_ntd.equals("")){
            printValue();

        }else{
            printEmpty();
        }
    }

    public void printValue(){
        String str_NTD = ed_ntd.getText().toString();
        float float_NTD = Float.parseFloat(str_NTD);
        float result = float_NTD / 30.9f;
        new AlertDialog.Builder(this)
                .setTitle("Result")
                .setMessage("USD is "+result)
                .setPositiveButton("OK",null)
                .show();

    }

    public void printEmpty(){
        new AlertDialog.Builder(this)
                .setTitle("Problem")
                .setMessage("Please enter your NTD amount")
                .setPositiveButton("ok",null)
                .show();

    }



}
