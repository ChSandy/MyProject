package com.qf.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.adpater.AbsAdapter;
import com.qf.bean.ContentBean;
import com.qf.bean.XiangQingBean;
import com.qf.inter.TuiJianInterFace;
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
 * Created by Administrator on 2016/12/15.
 */

public class XiangQing02 extends AppCompatActivity {

    private Toolbar toolbar;
    private XiangQingBean bean;
    private TextView tv_video_title;
    private TextView tv_video_time;
    private TextView tv_video_author;
    private TextView tv_video_read;
   // private WebView web;
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

    private List<ContentBean> contentBean;
    private ListView listView;
    private View inflate;
    private View inflate1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(R.layout.xiangqing_layout);

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
        // loadData();
        listView = (ListView) findViewById(R.id.listView);
        inflate = LayoutInflater.from(this).inflate(R.layout.head_layout, null);
        tv_video_title = (TextView) inflate.findViewById(R.id.tv_video_title);
        tv_video_time = (TextView) inflate.findViewById(R.id.tv_video_time);
        tv_video_author = (TextView) inflate.findViewById(R.id.tv_video_author);
        tv_video_read = (TextView) inflate.findViewById(R.id.tv_video_read);




        inflate1 = LayoutInflater.from(this).inflate(R.layout.xiang_guan_tuijian, null);
        initView(inflate1);
        listView.addFooterView(inflate1);
    }


    private void loadData() {

        XiangQingBean.DataBean data = bean.getData();
        if (data != null) {


            tv_video_title.setText(data.getTitle());
            tv_video_time.setText(data.getPubDate());
            tv_video_author.setText(data.getAuthor());
            tv_video_read.setText("阅读    " + data.getClick());
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


          /*  web.getSettings().setJavaScriptEnabled(true);
            web.setWebChromeClient(new WebChromeClient());
            web.setWebViewClient(new WebViewClient());
            web.loadUrl(data.getLink());*/

            List<String> urls=new ArrayList<>();
            List<String> contents = new ArrayList<>();

            List<String> pics = data.getPics();

            List<String> content = data.getContent();

            contentBean = new ArrayList<>();
            int imgsize = pics.size();
            int contentsize = content.size();
            if(imgsize<contentsize){
                for (int i = 0; i < imgsize; i++) {
                    contentBean.add(new ContentBean(content.get(i), pics.get(i)));
                }
            }else if(imgsize>contentsize){
                for (int i = 0; i < contentsize; i++) {
                    contentBean.add(new ContentBean(content.get(i), pics.get(i)));
                }
            }else {
                for (int i = 0; i < contentsize; i++) {
                    contentBean.add(new ContentBean(content.get(i), pics.get(i)));
                }
            }



            AbsAdapter<ContentBean> adapter=new AbsAdapter<ContentBean>(contentBean,this,R.layout.xiangqing_item_son) {

                @Override
                public void bindData(int position, ViewHolder holder) {

                    ContentBean bean = XiangQing02.this.contentBean.get(position);
                    ImageView view = (ImageView) holder.findViewById(R.id.iv_content);
                    Glide.with(XiangQing02.this).load(bean.getImage()).into(view);
                    TextView textView = (TextView) holder.findViewById(R.id.tv_content);
                    textView.setText(bean.getContent());

                }

                @Override
                public int getItemViewType(int position) {
                    return 0;
                }
            };

            listView.addHeaderView(inflate);
            listView.setAdapter(adapter);


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
        TuiJianInterFace interFace = retrofit.create(TuiJianInterFace.class);
        Call<XiangQingBean> call1 = interFace.getXiangQingBean(aid);
        call1.enqueue(new Callback<XiangQingBean>() {
            @Override
            public void onResponse(Call<XiangQingBean> call, Response<XiangQingBean> response) {
                XiangQingBean body = response.body();
                bean = body;
                loadData();
            }

            @Override
            public void onFailure(Call<XiangQingBean> call, Throwable t) {

            }
        });

    }


    private void initView(View view) {



      //  web = (WebView) findViewById(web);
        rbn_video_weixin = (RadioButton) view.findViewById(R.id.rbn_video_weixin);
        rbn_video_penyouq = (RadioButton) view.findViewById(R.id.rbn_video_penyouq);
        rbn_video_weibo = (RadioButton) view.findViewById(R.id.rbn_video_weibo);
        rg_video_share = (RadioGroup) view.findViewById(R.id.rg_video_share);
        iv_video_tuijian_01 = (ImageView) view.findViewById(R.id.iv_video_tuijian_01);
        tv_video_tuijian_01 = (TextView) view.findViewById(R.id.tv_video_tuijian_01);
        rlayout01 = (RelativeLayout) view.findViewById(R.id.rlayout01);
        iv_video_tuijian_02 = (ImageView) view.findViewById(R.id.iv_video_tuijian_02);
        tv_video_tuijian_02 = (TextView) view.findViewById(R.id.tv_video_tuijian_02);
        rlayout02 = (RelativeLayout) view.findViewById(R.id.rlayout02);
        iv_video_tuijian_03 = (ImageView) view.findViewById(R.id.iv_video_tuijian_03);
        tv_video_tuijian_03 = (TextView) view.findViewById(R.id.tv_video_tuijian_03);
        rlayout03 = (RelativeLayout) view.findViewById(R.id.rlayout03);
        iv_video_tuijian_04 = (ImageView) view.findViewById(R.id.iv_video_tuijian_04);
        tv_video_tuijian_04 = (TextView) view.findViewById(R.id.tv_video_tuijian_04);
        rlayout04 = (RelativeLayout) view.findViewById(R.id.rlayout04);
        iv_video_tuijian_05 = (ImageView) view.findViewById(R.id.iv_video_tuijian_05);
        tv_video_tuijian_05 = (TextView) view.findViewById(R.id.tv_video_tuijian_05);
        rlayout05 = (RelativeLayout) view.findViewById(R.id.rlayout05);
    }
}

