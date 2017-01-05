package com.qf.myproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.qf.utils.UtilsString;

import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

/**
 * Created by Administrator on 2016/12/16.
 */

public class BoFang extends BaseNoActionBarActivity {
    private VideoView vitamio;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bofang_layout);
        initView();

    }

    private void initView() {
        Intent intent = getIntent();
        String url = intent.getStringExtra(UtilsString.BOFANG);
        Log.d("print", " -url--"+url);
        vitamio = (VideoView) findViewById(R.id.vitamio);
        vitamio.setVideoURI(Uri.parse(url));
        vitamio.start();
        vitamio.setMediaController(new MediaController(this));

    }
}
