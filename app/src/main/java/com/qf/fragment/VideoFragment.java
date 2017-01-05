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
import com.qf.bean.VideoBean;
import com.qf.inter.VideoInterFace;
import com.qf.myproject.R;
import com.qf.myproject.VideoActivity;
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

public class VideoFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listView;
    private List<VideoBean.DataBean.ItemBean> data;
    private AbsAdapter<VideoBean.DataBean.ItemBean> adapter;

    private int page = 1;
    private boolean addMore = false;

    private PtrClassicFrameLayout frameLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = new ArrayList<>();
        //初始化数据
        init();
        //初始化adapter
        initAdapter();

    }

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.videofragment_layout, container, false);
        stupView(view);
        return view;
    }

    private void stupView(View view) {
        listView = (ListView) view.findViewById(R.id.lv);
        frameLayout = (PtrClassicFrameLayout) view.findViewById(R.id.fragment_rotate_header_with_text_view_frame);
        listView.setAdapter(adapter);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //上拉加载更多
        listViewAddMore();
        //下拉刷新
        addNew();
        listViewListenner();


    }

    private void listViewListenner() {
        listView.setOnItemClickListener(this);
    }

    private void addNew() {
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

    private void listViewAddMore() {
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

    }

    private void initAdapter() {
        adapter = new AbsAdapter<VideoBean.DataBean.ItemBean>(data, getActivity(), R.layout.item_three_layout) {
            @Override
            public int getItemViewType(int position) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 20: {
                        type = 0;
                    }
                    break;
                }
                return type;
            }

            @Override
            public void bindData(int position, ViewHolder holder) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 20: {
                        type = 0;
                    }
                    break;
                }
                VideoBean.DataBean.ItemBean bean = data.get(position);
                if (bean != null) {
                    if (type == 0) {
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_three);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView title = (TextView) holder.findViewById(R.id.tv_tree_title);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.tv_three_tuiguang);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pl = (TextView) holder.findViewById(R.id.tv_three_pl);
                        tv_pl.setText(bean.getPl());

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
        VideoInterFace interFace = retrofit.create(VideoInterFace.class);
        Call<VideoBean> call = interFace.getVideoBean(1);
        call.enqueue(new Callback<VideoBean>() {
            @Override
            public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {
                data.clear();
                VideoBean videoBean = response.body();
                List<VideoBean.DataBean.ItemBean> been = videoBean.getData().getItem();
                data.addAll(been);
                adapter.notifyDataSetChanged();
                frameLayout.refreshComplete();
            }

            @Override
            public void onFailure(Call<VideoBean> call, Throwable t) {
                frameLayout.refreshComplete();
            }
        });
    }

    private void loadMore(int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VideoInterFace interFace = retrofit.create(VideoInterFace.class);
        Call<VideoBean> call = interFace.getVideoBean(page);
        call.enqueue(new Callback<VideoBean>() {
            @Override
            public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {

                VideoBean videoBean = response.body();
                List<VideoBean.DataBean.ItemBean> been = videoBean.getData().getItem();
                data.addAll(been);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<VideoBean> call, Throwable t) {
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), VideoActivity.class);
        intent.putExtra(UtilsString.VIDEOID, data.get(position).getAid());
        intent.putExtra(UtilsString.TYPE, data.get(position).getNews_show_type());
        startActivity(intent);
    }
}
