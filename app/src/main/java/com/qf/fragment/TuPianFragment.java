package com.qf.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.adpater.AbsAdapter;
import com.qf.bean.PictureBean;
import com.qf.inter.TuPianInter;
import com.qf.myproject.Pic_XiangQing;
import com.qf.myproject.R;
import com.qf.utils.ApiManger;
import com.qf.utils.UtilsString;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/12/12.
 */

public class TuPianFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<PictureBean.DataBean.ItemBean> data;
    private AbsAdapter<PictureBean.DataBean.ItemBean> adapter;

    //下拉刷新
    private PtrClassicFrameLayout frameLayout;

    //上拉加载相关
    private int page;
    private boolean addMore = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = new ArrayList<>();
        init();
        initAdapter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tuijian_fragment_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        listView = (ListView) view.findViewById(R.id.lv);
        frameLayout = (PtrClassicFrameLayout) view.findViewById(R.id.fragment_rotate_header_with_text_view_frame);
        listView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //设置监听
        setListener();
        //下拉刷新
        LodaNew();
    }

    private void LodaNew() {
        frameLayout.setLastUpdateTimeRelateObject(this);
        frameLayout.disableWhenHorizontalMove(true);
        frameLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                init();
            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return super.checkCanDoRefresh(frame, listView, header);
            }
        });
    }

    private void setListener() {
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (addMore && scrollState == 0) {
                    page++;
                    loadMore(page);
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                addMore = (firstVisibleItem + visibleItemCount == totalItemCount);
            }
        });

        listView.setOnItemClickListener(this);

    }

    private void initAdapter() {
        adapter = new AbsAdapter<PictureBean.DataBean.ItemBean>(data, getActivity(), R.layout.item_picture_layout) {
            @Override
            public int getItemViewType(int position) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 30: {
                        type = 0;
                    }
                    break;
                }
                return type;
            }

            int itemtype = 0;

            @Override
            public void bindData(int position, ViewHolder holder) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 30: {
                        itemtype = 0;
                    }
                    break;
                }
                PictureBean.DataBean.ItemBean bean = data.get(position);
                if (bean != null) {
                    if (itemtype == 0) {
                        ImageView iv_big = (ImageView) holder.findViewById(R.id.iv_pic_big);
                        ImageView iv_small01 = (ImageView) holder.findViewById(R.id.iv_pic_small01);
                        ImageView iv_small02 = (ImageView) holder.findViewById(R.id.iv_pic_small02);
                        List<String> imageArr = bean.getImage_arr();
                        Glide.with(getActivity()).load(imageArr.get(0)).into(iv_big);
                        Glide.with(getActivity()).load(imageArr.get(1)).into(iv_small01);
                        Glide.with(getActivity()).load(imageArr.get(2)).into(iv_small02);
                        TextView title = (TextView) holder.findViewById(R.id.tv_pic_title);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.tv_pic_small);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pl = (TextView) holder.findViewById(R.id.tv_pic_pl);
                        tv_pl.setText(bean.getPl());
                    } else {

                    }
                }

            }
        };
    }

    private void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TuPianInter tuPianInter = retrofit.create(TuPianInter.class);
        Call<PictureBean> call = tuPianInter.getPictureBean(1);
        call.enqueue(new Callback<PictureBean>() {
            @Override
            public void onResponse(Call<PictureBean> call, Response<PictureBean> response) {
                data.clear();
                PictureBean body = response.body();
                data.addAll(body.getData().getItem());
                adapter.notifyDataSetChanged();
                frameLayout.refreshComplete();
            }

            @Override
            public void onFailure(Call<PictureBean> call, Throwable t) {
                frameLayout.refreshComplete();
            }
        });
    }

    private void loadMore(int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TuPianInter tuPianInter = retrofit.create(TuPianInter.class);
        Call<PictureBean> call = tuPianInter.getPictureBean(page);
        call.enqueue(new Callback<PictureBean>() {
            @Override
            public void onResponse(Call<PictureBean> call, Response<PictureBean> response) {
                PictureBean body = response.body();
                data.addAll(body.getData().getItem());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<PictureBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), Pic_XiangQing.class);
        intent.putExtra(UtilsString.PICID, data.get(position).getAid());
        intent.putExtra(UtilsString.PICTYPE, data.get(position).getNews_show_type());
        startActivity(intent);
    }
}
