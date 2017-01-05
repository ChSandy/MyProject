package com.qf.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.myproject.LognActivity;
import com.qf.myproject.R;
import com.qf.myproject.Setting;
import com.qf.myproject.ShouChan;
import com.qf.myproject.ZhiHui;
import com.qf.utils.UtilsString;

/**
 * Created by Administrator on 2016/12/12.
 */

public class MineFragment extends Fragment {


    private TextView tv_wode;
    private TextView tv_dianji;
    private ImageView iv_head;
    private LinearLayout layout1;
    private LinearLayout layout2;
    private LinearLayout layout3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.minefragment_layout, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListener();
    }

    private void setListener() {
        iv_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), LognActivity.class);
                startActivityForResult(intent, UtilsString.REQUESTCODE);
            }
        });

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ZhiHui.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ShouChan.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Setting.class);
                startActivity(intent);
            }
        });

    }

    //获取返回的头像及名字
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void initView(View view) {
        tv_wode = (TextView) view.findViewById(R.id.tv_wode);
        tv_dianji = (TextView) view.findViewById(R.id.tv_dianji);
        iv_head = (ImageView) view.findViewById(R.id.iv_head);
        layout1 = (LinearLayout) view.findViewById(R.id.layout1);
        layout2 = (LinearLayout) view.findViewById(R.id.layout2);
        layout3 = (LinearLayout) view.findViewById(R.id.layout3);
    }
}
