package com.qf.my_viewparger;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
public class MyAdapter extends PagerAdapter {

    List<View> datas;

    public MyAdapter(List<View> list){
        datas=list;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(datas.get(position));
        return datas.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(datas.get(position));
    }

    @Override
    public int getCount() {
        return datas.size();
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
