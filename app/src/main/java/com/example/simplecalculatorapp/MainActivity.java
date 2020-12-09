package com.example.simplecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,
    button8, button9, button10, buttonAdd, buttonSub, buttonDiv, buttonMul, buttonEqual, buttonC;

    EditText et_1;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button)findViewById(R.id.btn0);
        button1 = (Button)findViewById(R.id.btn1);
        button2 = (Button)findViewById(R.id.btn2);
        button3 = (Button)findViewById(R.id.btn3);
        button4 = (Button)findViewById(R.id.btn4);
        button5 = (Button)findViewById(R.id.btn5);
        button6 = (Button)findViewById(R.id.btn6);
        button7 = (Button)findViewById(R.id.btn7);
        button8 = (Button)findViewById(R.id.btn8);
        button9 = (Button)findViewById(R.id.btn9);
        button10 = (Button)findViewById(R.id.btn10);
        buttonAdd = (Button)findViewById(R.id.btn_add);
        buttonSub = (Button)findViewById(R.id.btn_sub);
        buttonDiv = (Button)findViewById(R.id.btn_div);
        buttonMul = (Button)findViewById(R.id.btn_mult);
        buttonEqual = (Button)findViewById(R.id.btn_eql);
        buttonC = (Button)findViewById(R.id.btn_c);

       et_1 = (EditText)findViewById(R.id.et_1);

       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               et_1.setText(et_1.getText()+"0");

           }
       });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+"9");

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText(et_1.getText()+".");

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText("");

            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_1 == null){
                    et_1.setText("");
                }else {
                    mValueOne = Float.parseFloat(et_1.getText()+"");
                    mAddition = true;
                    et_1.setText(null);
                }

            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et_1.getText()+"");
                mSubtract = true;
                et_1.setText(null);

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et_1.getText()+"");
                mMultiplication = true;
                et_1.setText(null);

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et_1.getText()+"");
                mDivision = true;
                et_1.setText(null);

            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(et_1.getText()+ "");


                if (mAddition == true){
                    et_1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true){
                    et_1.setText(mValueOne - mValueOne + "");
                    mSubtract = false;
                }
                if (mMultiplication == true){
                    et_1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true){
                    et_1.setText(mValueOne / mValueOne + "");
                    mDivision = false;
                }

            }
        });

    }
}