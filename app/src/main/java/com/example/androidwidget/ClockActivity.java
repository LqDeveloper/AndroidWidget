package com.example.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        setTitle("时钟");
    }
}
