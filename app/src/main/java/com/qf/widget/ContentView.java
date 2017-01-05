package com.qf.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.qf.bean.XiangQingBean;

/**
 * Created by Administrator on 2016/12/16.
 */

public class ContentView extends LinearLayout {

    public ContentView(Context context) {
        super(context);
        init();
    }


    public ContentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setOrientation(VERTICAL);
    }

    public void setData(XiangQingBean bean){
        if(bean==null){
            return;
        }




    }
}
