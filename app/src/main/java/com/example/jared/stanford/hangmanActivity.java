package com.example.jared.stanford;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

public class hangmanActivity extends SurfaceView implements Runnable{
    private boolean touched = false;
    private float eventX;

public hangmanActivity(Context context){
    super(context);

}
    public void run(){

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN
                || event.getAction() == MotionEvent.ACTION_MOVE) {
            eventX = event.getX();
            touched = true;
        }
        return touched;
    }
}
