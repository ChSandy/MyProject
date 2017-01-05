package com.qf.my_viewparger;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    List<View> datas;
    MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.viewpager);
        init();
        adapter=new MyAdapter(datas);
        viewPager.setAdapter(adapter);


    }

    private void init() {
        datas=new ArrayList<>();
        LayoutInflater inflater=LayoutInflater.from(this);
        View view1=inflater.inflate(R.layout.layout_pager1,null);
        datas.add(view1);
        View view2=inflater.inflate(R.layout.layout_pager2,null);
        datas.add(view2);
        View view3=inflater.inflate(R.layout.layout_pager3,null);
        datas.add(view3);
        View view4=inflater.inflate(R.layout.layout_pager4,null);
        datas.add(view4);
    }
}
