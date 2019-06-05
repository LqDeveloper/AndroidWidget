package com.example.androidwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("主页");
        handleClick();
    }

    private void handleClick(){
        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
            startActivity(intent);
        });
        TextView buttonTextView = findViewById(R.id.button);
        buttonTextView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
            startActivity(intent);
        });
    }



}
