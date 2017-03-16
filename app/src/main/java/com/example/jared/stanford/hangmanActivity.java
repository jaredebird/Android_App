package com.example.jared.stanford;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;

public class hangmanActivity extends Activity {
private hangmanView hangmanView;
    public hangmanActivity(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // initialize graphics and game thread
        hangmanView = new hangmanView(this);
        setContentView(hangmanView);
    }
    @Override
    protected void onPause() {
        super.onPause();
        //hangmanView.pause();
    }
    @Override
    protected void onResume() {
        super.onResume();
//        hangmanView.resume();
    }
    public hangmanActivity(Context context) {


    }
}
