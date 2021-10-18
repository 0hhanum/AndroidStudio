package com.example.calculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CH5_AlertButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.alert_diaglod);
    }
    public void onClickAlert(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("확인");
        alertDialogBuilder.setMessage("결제 진행?");
        alertDialogBuilder.setPositiveButton("네",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(CH5_AlertButton.this, "완료되었습니다.",
                                Toast.LENGTH_LONG).show();
                    }
                });
        alertDialogBuilder.setNegativeButton("아니오",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(CH5_AlertButton.this, "취소되었습니다.",
                                Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
