package com.example.androidwidget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private View mView1,mView2,mView3;
    private ViewPager mViewPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        setTitle("ViewPager");
        mViewPage = findViewById(R.id.viewPager);
        LayoutInflater inflater = getLayoutInflater();
        mView1 = inflater.inflate(R.layout.viewpage_item1_layout,null);
        mView2 = inflater.inflate(R.layout.viewpage_item2_layout,null);
        mView3 = inflater.inflate(R.layout.viewpage_item3_layout,null);
        List<View> viewList = new ArrayList<>();
        viewList.add(mView1);
        viewList.add(mView2);
        viewList.add(mView3);

        MyPagerAdapter adapter = new MyPagerAdapter(this,viewList);
        mViewPage.setAdapter(adapter);
    }
}



class MyPagerAdapter extends PagerAdapter{
    private Context mContext;
    private List<View> mViewList;

    MyPagerAdapter(Context context,List<View>views){
        super();
        mContext = context;
        mViewList = views;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
          container.removeView(mViewList.get(position));
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }
}
