package com.qf.myproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


public class WelcomeActivity extends BaseNoActionBarActivity {

    private ImageView ivbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        AnimationDrawable anim = (AnimationDrawable) ivbtn.getDrawable();
        anim.start();

        //跳转
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, HomeActicity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }

    private void initView() {
        ivbtn = (ImageView) findViewById(R.id.ivbtn);
    }
}
