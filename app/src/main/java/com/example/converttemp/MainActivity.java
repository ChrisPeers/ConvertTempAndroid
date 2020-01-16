package com.example.converttemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void convert_onClick(View v) {
//        RadioButton FTC = (RadioButton) findViewById(R.id.radioFTC);
//        RadioButton CTF = (RadioButton) findViewById(R.id.radioCTF);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        Button button = (Button) findViewById(R.id.button);
//        CheckBox checkBox = (CheckBox) findViewById(R.id.checkRound);
//        double x = Double.parseDouble(editText.getText().toString());
//        double result;
//
//        if (FTC.isChecked()){
//            result = (x - 32) * 5/9;
//            //editText.setText(String.valueOf(result));
//        } else {
//            result = (x * 9/5) + 32;
//            //editText.setText(String.valueOf(result));
//        }
//
//        if (checkBox.isChecked()) {
//            result = Math.round(result);
//        }
//
//        editText.setText(String.valueOf(result));

        RadioButton fromC = (RadioButton) findViewById(R.id.fromC);
        RadioButton toC = (RadioButton) findViewById(R.id.toC);
        RadioButton fromF = (RadioButton) findViewById(R.id.fromF);
        RadioButton toF = (RadioButton) findViewById(R.id.toF);
        RadioButton fromK = (RadioButton) findViewById(R.id.fromK);
        RadioButton toK = (RadioButton) findViewById(R.id.toK);

        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkRound);
        double x = Double.parseDouble(editText.getText().toString());
        double result = Double.parseDouble(editText.getText().toString());

        if (fromC.isChecked()) {
            if (toC.isChecked()) {
                editText.setText(String.valueOf(x));
            } else if (toF.isChecked()) {
                result = (x * 9 / 5) + 32;
            } else {
                result = x + 273.15;
            }
        } else if (fromF.isChecked()) {
            if (toC.isChecked()) {
                result = (x - 32) * 5 / 9;
            } else if (toF.isChecked()) {
                editText.setText(String.valueOf(x));
            } else {
                result = (x - 32) * 5 / 9 + 273.15;
            }
        } else {
            if (toC.isChecked()) {
                result = x - 273.15;
            } else if (toF.isChecked()) {
                result = (x - 273.15) * 9 / 5 + 32;
            } else {
                editText.setText(String.valueOf(x));
            }
        }

        if (checkBox.isChecked()) {
           result = Math.round(result);
        }

        editText.setText(String.valueOf(result));

    }

}
