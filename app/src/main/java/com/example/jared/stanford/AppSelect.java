package com.example.jared.stanford;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AppSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_select);
    }

    public void startHangman(View view){
        Intent intent = new Intent(this,hangmanActivity.class);
        startActivity(intent);

    }
}
