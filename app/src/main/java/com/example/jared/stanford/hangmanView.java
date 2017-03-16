package com.example.jared.stanford;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/**
 * Created by Jared on 3/15/2017.
 */

public class hangmanView extends SurfaceView implements Runnable{
    private boolean touched = false;
    private float eventX;


    public hangmanView(Context context){
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
