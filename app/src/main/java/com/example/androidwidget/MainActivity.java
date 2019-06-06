package com.example.androidwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("主页");
        handleClick();
    }

    private void handleClick() {
        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
            startActivity(intent);
        });
        TextView buttonTextView = findViewById(R.id.button);
        buttonTextView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

        TextView clockTextView = findViewById(R.id.cLock);
        clockTextView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ClockActivity.class);
            startActivity(intent);
        });

        TextView imageViewTextView = findViewById(R.id.imageView);
        imageViewTextView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
            startActivity(intent);
        });

        TextView adapterTextView = findViewById(R.id.adapter);
        adapterTextView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, AdapterActivity.class);
            startActivity(intent);
        });

        TextView viewPagerTextView = findViewById(R.id.viewPager);
        viewPagerTextView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
            startActivity(intent);
        });
    }


}
