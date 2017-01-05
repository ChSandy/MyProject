package com.qf.myproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


/**
 * Created by Administrator on 2016/12/14.
 */

public class LognActivity extends AppCompatActivity {


    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logn_activity_layout);
        initView();
         setSupportActionBar(toolbar);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }
}
