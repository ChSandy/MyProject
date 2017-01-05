package com.qf.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.qf.myproject.R;

/**
 * Created by Administrator on 2016/12/15.
 */

public class PlView extends LinearLayout {

    public PlView(Context context) {
        super(context);
        init(context);
    }

    public PlView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.pl_layout,null);
    }

}
