package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;


public class SecondActivityInOtherProcess extends AppCompatActivity {
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 一个进程挂掉，不会影响主进程
                int r = 10 / 0;
                Log.i("wangw", r+"");
            }
        }, 3000);
    }
}
