package com.example.cypri.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    private Button btnPlus,  btnMinus;
    private Button btnMulti, btnDivi, btnRest;
    private TextView textResult;
    private EditText input01, input02;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input01 = (EditText) findViewById(R.id.input01);
        input02 = (EditText) findViewById(R.id.input02);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        btnRest = (Button) findViewById(R.id.btnDivi);
        textResult = (TextView) findViewById(R.id.textResult);



        btnPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = input01.getText().toString();
                num2 = input02.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText( result.toString() );
                return false;
            }
        });
        btnMinus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = input01.getText().toString();
                num2 = input02.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText( result.toString() );
                return false;
            }
        });
        btnMulti.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = input01.getText().toString();
                num2 = input02.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText( result.toString() );
                return false;
            }
        });
        btnDivi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = input01.getText().toString();
                num2 = input02.getText().toString();
                result = Integer.parseInt( num1 ) / Integer.parseInt( num2 );
                textResult.setText( result.toString() );
                return false;
            }
        });
        btnRest.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = input01.getText().toString();
                num2 = input02.getText().toString();
                result = Integer.parseInt( num1 ) % Integer.parseInt( num2 );
                textResult.setText( result.toString() );
                return false;
            }
        });



    }
}
