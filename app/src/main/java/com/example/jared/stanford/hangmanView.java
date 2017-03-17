package com.example.jared.stanford;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/**
 * Created by Jared on 3/15/2017.
 */

public class hangmanView extends SurfaceView implements Runnable{
    private static final long FRAMERATE = 30;
    private static final int SCAFFOLD_HEIGHT = 360;
    private static final int BEAM_LENGTH = 144;
    private static final int ROPE_LENGTH = 18;
    private static final int HEAD_RADIUS = 36;
    private static final int BODY_LENGTH = 144;
    private static final int ARM_OFFSET_FROM_HEAD = 28;
    private static final int UPPER_ARM_LENGTH = 72;
    private static final int LOWER_ARM_LENGTH = 44;
    private static final int HIP_WIDTH = 36;
    private static final int LEG_LENGTH = 108;
    private static final int FOOT_LENGTH = 28;

    private boolean touched = false;
    private float eventX;
    private ShapeDrawable body;



    public hangmanView(Context context){
    super(context);

    }

    public void run(){
        while (true){
            try{
                Thread.sleep(FRAMERATE);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

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
