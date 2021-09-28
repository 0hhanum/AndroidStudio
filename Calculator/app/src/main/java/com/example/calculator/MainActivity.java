package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        EditText num1 = (EditText) findViewById(R.id.input1);
        EditText num2 = (EditText) findViewById(R.id.input2);
        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        TextView resultOper = (TextView) findViewById(R.id.labelResult);
        int result = 0;
        switch (view.getId()) {
            case R.id.buttonAdd:
                result = Integer.parseInt(str1) + Integer.parseInt(str2);
                break;
            case R.id.buttonSubtract:
                result = Integer.parseInt(str1) - Integer.parseInt(str2);
                break;
            case R.id.buttonMultiply:
                result = Integer.parseInt(str1) * Integer.parseInt(str2);
                break;
            case R.id.buttonDivide:
                result = Integer.parseInt(str1) / Integer.parseInt(str2);
                break;
        }
        resultOper.setText("Result: " + result);
    }
}
*/
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void onButtonClick(View view){
//        EditText num1 = (EditText) findViewById(R.id.input1);
//        EditText num2 = (EditText) findViewById(R.id.input2);
//        String str1 = num1.getText().toString();
//        String str2 = num2.getText().toString();
//        TextView resultOper = (TextView) findViewById(R.id.labelResult);
//        int result = 0;
//        switch (view.getId()) {
//            case R.id.buttonAdd:
//                result = Integer.parseInt(str1) + Integer.parseInt(str2);
//                break;
//            case R.id.buttonSubtract:
//                result = Integer.parseInt(str1) - Integer.parseInt(str2);
//                break;
//            case R.id.buttonMultiply:
//                result = Integer.parseInt(str1) * Integer.parseInt(str2);
//                break;
//            case R.id.buttonDivide:
//                result = Integer.parseInt(str1) / Integer.parseInt(str2);
//                break;
//        }
//        resultOper.setText("Result: " + result);
//    }
//}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.sep_28_lecture);
    }

    public void onButtonClick(View view){
        TextView result = (TextView) findViewById(R.id.result);
        RadioButton button1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton button2 = (RadioButton) findViewById(R.id.radio2);

        if(button1.isChecked()) result.setText("아이폰입니다.");
        if(button2.isChecked()) result.setText("갤럭시입니다.");
    }햣
}