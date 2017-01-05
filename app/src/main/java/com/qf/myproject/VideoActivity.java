package com.qf.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bean.VieoActivityBean;
import com.qf.inter.VideoInterFace;
import com.qf.utils.ApiManger;
import com.qf.utils.UtilsString;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/12/15.
 */

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private VieoActivityBean bean;

    private TextView tv_video_title;
    private TextView tv_video_time;
    private TextView tv_video_author;
    private TextView tv_video_read;
    private ImageView iv_video_activity;
    private Button btn_video_caicai;
    private Button btn_video_zan;
    private RadioButton rbn_video_weixin;
    private RadioButton rbn_video_penyouq;
    private RadioButton rbn_video_weibo;
    private RadioGroup rg_video_share;
    private ImageView iv_video_tuijian_01;
    private TextView tv_video_tuijian_01;
    private RelativeLayout rlayout01;
    private ImageView iv_video_tuijian_02;
    private TextView tv_video_tuijian_02;
    private RelativeLayout rlayout02;
    private ImageView iv_video_tuijian_03;
    private TextView tv_video_tuijian_03;
    private RelativeLayout rlayout03;
    private ImageView iv_video_tuijian_04;
    private TextView tv_video_tuijian_04;
    private RelativeLayout rlayout04;
    private ImageView iv_video_tuijian_05;
    private TextView tv_video_tuijian_05;
    private RelativeLayout rlayout05;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(R.layout.video_activity_layout);
        initView();
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    private void ivListener() {
        iv_video_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, BoFang.class);
                intent.putExtra(UtilsString.BOFANG, bean.getData().getVideo_play());
                startActivity(intent);
            }
        });
    }

    private void loadData() {

        VieoActivityBean.DataBean data = bean.getData();
        if (data != null) {

            tv_video_title.setText(data.getTitle());
            tv_video_time.setText(data.getPubDate());
            tv_video_author.setText(data.getAuthor());
            tv_video_read.setText("阅读    " + data.getClick());
            btn_video_zan.setText(data.getGoodpost());
            btn_video_caicai.setText(data.getBadpost());
            Glide.with(this).load(data.getImage()).into(iv_video_activity);
            tv_video_tuijian_01.setText(data.getRelations().get(0).getTitle());
            Glide.with(this).load(data.getRelations().get(0).getImage()).into(iv_video_tuijian_01);
            tv_video_tuijian_02.setText(data.getRelations().get(1).getTitle());
            Glide.with(this).load(data.getRelations().get(1).getImage()).into(iv_video_tuijian_02);
            tv_video_tuijian_03.setText(data.getRelations().get(2).getTitle());
            Glide.with(this).load(data.getRelations().get(2).getImage()).into(iv_video_tuijian_03);
            tv_video_tuijian_04.setText(data.getRelations().get(3).getTitle());
            Glide.with(this).load(data.getRelations().get(3).getImage()).into(iv_video_tuijian_04);
            tv_video_tuijian_05.setText(data.getRelations().get(4).getTitle());
            Glide.with(this).load(data.getRelations().get(4).getImage()).into(iv_video_tuijian_05);


          /* final List<VieoActivityBean.DataBean.CommentsBean.ListBean> list = data.getComments().getList();
            adapter = new AbsAdapter<VieoActivityBean.DataBean.CommentsBean.ListBean>(list, VideoActivity.this, R.layout.pl_layout) {

                @Override
                public void bindData(int position, ViewHolder holder) {
                    VieoActivityBean.DataBean.CommentsBean.ListBean bean = list.get(position);
                    if (bean != null) {
                        TextView tv_name = (TextView) holder.findViewById(R.id.pl_name);
                        TextView tv_time = (TextView) holder.findViewById(R.id.tv_pl_time);
                        TextView tv_content = (TextView) holder.findViewById(R.id.pl_content);
                        tv_name.setText(bean.getUsername());
                        tv_time.setText(bean.getDtime());
                        tv_content.setText(bean.getMsg());
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_pl);
                        Glide.with(VideoActivity.this).load(bean.getFace()).into(iv);
                    }
                }

                @Override
                public int getItemViewType(int position) {
                    return 0;
                }
            };*/
        }
    }


    private void init() {
        Intent intent = getIntent();
        String aid = intent.getStringExtra(UtilsString.VIDEOID);
        String type = intent.getStringExtra(UtilsString.TYPE);


       /*    OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("http://if.wap.xinjunshi.com/api2.3/app.php?mod=show&aid=" + id + "&type=18")
                .build();
        okhttp3.Call call1 = client.newCall(request);
        call1.enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {

            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
             ResponseBody body = response.body();
                VieoActivityBean bean = new Gson().fromJson(body.string(), new TypeToken<VieoActivityBean>() {
                }.getType());
                data = bean.getData();

                Log.d("print", " ===VieoActivityBean==>" + bean.toString());
                Log.d("print", " ===VieoActivityBean.size==>"+data);
            }
        });*/

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VideoInterFace face = retrofit.create(VideoInterFace.class);
        Call<VieoActivityBean> call = face.getVieoActivityBean(aid);
        call.enqueue(new Callback<VieoActivityBean>() {
            @Override
            public void onResponse(Call<VieoActivityBean> call, Response<VieoActivityBean> response) {
                bean = response.body();
                loadData();
                Log.d("print", "bean==> "+bean);
                VieoActivityBean.DataBean data = response.body().getData();
                Log.d("print", " 视频---》"+data.getTitle());
                Log.d("print", " 视频地址---》"+data.getVideo_play());

                ivListener();
            }

            @Override
            public void onFailure(Call<VieoActivityBean> call, Throwable t) {

            }
        });


    }

    private void initView() {
        tv_video_title = (TextView) findViewById(R.id.tv_video_title);
        tv_video_time = (TextView) findViewById(R.id.tv_video_time);
        tv_video_author = (TextView) findViewById(R.id.tv_video_author);
        tv_video_read = (TextView) findViewById(R.id.tv_video_read);
        iv_video_activity = (ImageView) findViewById(R.id.iv_video_activity);
        btn_video_caicai = (Button) findViewById(R.id.btn_video_caicai);
        btn_video_zan = (Button) findViewById(R.id.btn_video_zan);
        rbn_video_weixin = (RadioButton) findViewById(R.id.rbn_video_weixin);
        rbn_video_penyouq = (RadioButton) findViewById(R.id.rbn_video_penyouq);
        rbn_video_weibo = (RadioButton) findViewById(R.id.rbn_video_weibo);
        rg_video_share = (RadioGroup) findViewById(R.id.rg_video_share);
        iv_video_tuijian_01 = (ImageView) findViewById(R.id.iv_video_tuijian_01);
        tv_video_tuijian_01 = (TextView) findViewById(R.id.tv_video_tuijian_01);
        rlayout01 = (RelativeLayout) findViewById(R.id.rlayout01);
        iv_video_tuijian_02 = (ImageView) findViewById(R.id.iv_video_tuijian_02);
        tv_video_tuijian_02 = (TextView) findViewById(R.id.tv_video_tuijian_02);
        rlayout02 = (RelativeLayout) findViewById(R.id.rlayout02);
        iv_video_tuijian_03 = (ImageView) findViewById(R.id.iv_video_tuijian_03);
        tv_video_tuijian_03 = (TextView) findViewById(R.id.tv_video_tuijian_03);
        rlayout03 = (RelativeLayout) findViewById(R.id.rlayout03);
        iv_video_tuijian_04 = (ImageView) findViewById(R.id.iv_video_tuijian_04);
        tv_video_tuijian_04 = (TextView) findViewById(R.id.tv_video_tuijian_04);
        rlayout04 = (RelativeLayout) findViewById(R.id.rlayout04);
        iv_video_tuijian_05 = (ImageView) findViewById(R.id.iv_video_tuijian_05);
        tv_video_tuijian_05 = (TextView) findViewById(R.id.tv_video_tuijian_05);
        rlayout05 = (RelativeLayout) findViewById(R.id.rlayout05);

        btn_video_caicai.setOnClickListener(this);
        btn_video_zan.setOnClickListener(this);
    }

    //点赞，踩
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_video_caicai:

                break;
            case R.id.btn_video_zan:

                break;
        }
    }
}

