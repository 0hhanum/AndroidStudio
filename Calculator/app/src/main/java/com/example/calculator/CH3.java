package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CH3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch3);
    }
    public void onButtonClick(View view){
        TextView text1 = (TextView) findViewById(R.id.text1);
        switch (view.getId()){
            case R.id.button_1:
                text1.setText("hello");
                break;
            case R.id.button_2:
                text1.setText("world");
                break;
        }
    }
}
