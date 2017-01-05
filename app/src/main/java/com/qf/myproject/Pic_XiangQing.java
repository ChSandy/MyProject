package com.qf.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.qf.bean.Pic_XiangQingBean;
import com.qf.fragment.PicXianShiFragment;
import com.qf.inter.TuPianInter;
import com.qf.utils.ApiManger;
import com.qf.utils.UtilsString;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/12/17.
 */

public class Pic_XiangQing extends BaseNoActionBarActivity implements View.OnClickListener {

    private Pic_XiangQingBean bean;


    private List<Fragment> fragmentList;

    private List<Pic_XiangQingBean.DataBean.PicsBean> pics;
    private ImageButton pic_back;
    private TextView tv_page;
    private ImageButton pic_down;
    private ImageButton pic_shou;
    private ImageButton pic_share;
    private ViewPager viewpager;
    private TextView pic_content;
    private RadioButton pl_nav;
    private RadioButton pic_good;
    private RadioButton pl_bad;

    private List<String> content;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiangqing_tupian_layout);
        initView();

        init();


        //viewpager监听
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int mun = position + 1;
                tv_page.setText(mun + "/" + pics.size());

                try {
                    pic_content.setText(bean.getData().getDescription());
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onPageSelected(int position) {


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initFragment() {
        fragmentList = new ArrayList<>();
        for (int i = 0; i < pics.size(); i++) {

            PicXianShiFragment fragment = new PicXianShiFragment();
            Bundle bundle = new Bundle();
            bundle.putString(UtilsString.KEY, pics.get(i).getUrl());
            Log.d("print", " pic_显示" + pics.get(i).getUrl());
            fragment.setArguments(bundle);
            fragmentList.add(fragment);
        }

    }

    private void init() {
        bean = new Pic_XiangQingBean();
        Intent intent = getIntent();
        String aid = intent.getStringExtra(UtilsString.PICID);
        String id = intent.getStringExtra(UtilsString.PICTYPE);

        //下载数据
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TuPianInter inter = retrofit.create(TuPianInter.class);
        Call<Pic_XiangQingBean> call = inter.getPic_XiangQingBean(aid);
        call.enqueue(new Callback<Pic_XiangQingBean>() {
            @Override
            public void onResponse(Call<Pic_XiangQingBean> call, Response<Pic_XiangQingBean> response) {
                bean = response.body();

                loadData();


            }

            @Override
            public void onFailure(Call<Pic_XiangQingBean> call, Throwable t) {

            }
        });
    }

    //加载页面内容
    private void loadData() {
        Pic_XiangQingBean.DataBean data = bean.getData();
        //图片网址集合
        pics = data.getPics();
        //内容集合
        content = data.getContent();

        initFragment();

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        };

        viewpager.setAdapter(adapter);
    }


    private void initView() {
        pic_back = (ImageButton) findViewById(R.id.pic_back);
        tv_page = (TextView) findViewById(R.id.tv_page);
        pic_down = (ImageButton) findViewById(R.id.pic_down);
        pic_shou = (ImageButton) findViewById(R.id.pic_shou);
        pic_share = (ImageButton) findViewById(R.id.pic_share);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        pic_content = (TextView) findViewById(R.id.pic_content);
        pl_nav = (RadioButton) findViewById(R.id.pl_nav);
        pic_good = (RadioButton) findViewById(R.id.pic_good);
        pl_bad = (RadioButton) findViewById(R.id.pl_bad);

        pic_back.setOnClickListener(this);
        pic_down.setOnClickListener(this);
        pic_shou.setOnClickListener(this);
        pic_share.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pic_back:
                finish();
                break;
            case R.id.pic_down:

                break;
            case R.id.pic_shou:

                break;
            case R.id.pic_share:

                break;
        }
    }

    public void back(View view ){
        finish();
    }
}
