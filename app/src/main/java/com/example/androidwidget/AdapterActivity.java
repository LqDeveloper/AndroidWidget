package com.example.androidwidget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdapterActivity extends AppCompatActivity implements ClickItemListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        arrayAdpater();
    }

    private void arrayAdpater() {
        ListView listView = findViewById(R.id.arrayListView);

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String str = "这是第" + i + "行";
            arrayList.add(str);
        }
        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this, R.layout.array_item_layout, arrayList);
        arrayAdapter.setListener(this);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    public void clickItem(View item, int position) {
        Log.d("clickItem", "点击了第" + position + "个");
    }
}

class MyArrayAdapter extends ArrayAdapter<String> {
    private Context mContext;
    ClickItemListener mListener;
    List<String> mDataList;

    public MyArrayAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        mContext = context;
        mDataList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.array_item_layout, parent, false);
        } else {
            view = convertView;
        }
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(mDataList.get(position));
        textView.setOnClickListener((textV) -> {
            if (this.mListener != null) {
                mListener.clickItem(textV, position);
            }
        });

        return view;
    }

    void setListener(ClickItemListener listener) {
        mListener = listener;
    }
}


interface ClickItemListener {
    void clickItem(View item, int position);
}







