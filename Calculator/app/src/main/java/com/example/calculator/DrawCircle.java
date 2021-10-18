package com.example.calculator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DrawCircle extends AppCompatActivity {

    protected class Draw extends View {
        int x = 100, y = 100;
        String str = "HI";

        public Draw(Context context) {
            super(context);
            setBackgroundColor(Color.BLACK);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setTextSize(30);
            canvas.drawCircle(x, y, 100, paint);
            canvas.drawText(str, 0, 100, paint);
            paint.setColor(Color.YELLOW);
            canvas.drawText("(" + x + "," + y + ")", x, y, paint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            x = (int) event.getX();
            y = (int) event.getY();
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                str = "터치";
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                str = "움직임";
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                str = "뗐다";
            }
            invalidate();
            return true;
        }}

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Draw draw = new Draw(this);
        setContentView(draw);
    }
}