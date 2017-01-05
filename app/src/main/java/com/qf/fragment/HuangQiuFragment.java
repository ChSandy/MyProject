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
import com.qf.bean.HuangQiuBean;
import com.qf.inter.PaiHangInterFace;
import com.qf.myproject.R;
import com.qf.myproject.XiangQing02;
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

public class HuangQiuFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<HuangQiuBean.DataBean.ItemBean> data;
    private AbsAdapter<HuangQiuBean.DataBean.ItemBean> adapter;

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
        View view = inflater.inflate(R.layout.tuijian_fragment_layout, container, false);
        stupView(view);
        return view;
    }

    private void stupView(View view) {
        listView = (ListView) view.findViewById(R.id.lv);
        frameLayout = (PtrClassicFrameLayout) view.findViewById(R.id.fragment_rotate_header_with_text_view_frame);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //上拉加载更多
        listViewAddMore();
        //下拉刷新
        addNew();

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
        adapter = new AbsAdapter<HuangQiuBean.DataBean.ItemBean>(data, getActivity(), R.layout.item_one, R.layout.item_two_layout) {
            @Override
            public int getItemViewType(int position) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 10: {
                        type = 0;
                    }
                    break;
                    case 31: {
                        type = 1;
                    }
                    break;
                }
                return type;
            }

            @Override
            public void bindData(int position, ViewHolder holder) {
                int type = data.get(position).getNews_show_type();
                switch (type) {
                    case 10: {
                        type = 0;
                    }
                    break;
                    case 31: {
                        type = 1;
                    }
                    break;
                }
                HuangQiuBean.DataBean.ItemBean bean = data.get(position);
                if (bean != null) {
                    if (type == 0) {
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_one);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView title = (TextView) holder.findViewById(R.id.tv_one);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.small_tv_one);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pl = (TextView) holder.findViewById(R.id.tv_one_pl);
                        tv_pl.setText(bean.getPl());

                    } else if (type == 1) {
                        ImageView iv1 = (ImageView) holder.findViewById(R.id.iv_two_1);
                        ImageView iv2 = (ImageView) holder.findViewById(R.id.iv_two_2);
                        ImageView iv3 = (ImageView) holder.findViewById(R.id.iv_two_3);
                        List<String> imageArr = bean.getImage_arr();
                        Glide.with(getActivity()).load(imageArr.get(0)).into(iv1);
                        Glide.with(getActivity()).load(imageArr.get(1)).into(iv2);
                        Glide.with(getActivity()).load(imageArr.get(2)).into(iv3);
                        TextView title = (TextView) holder.findViewById(R.id.tv_item_two);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.tv_two_tuiguang);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pl = (TextView) holder.findViewById(R.id.tv_two_pl);
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
        PaiHangInterFace interFace = retrofit.create(PaiHangInterFace.class);
        Call<HuangQiuBean> call = interFace.getHuangqiuBean(1);
        call.enqueue(new Callback<HuangQiuBean>() {
            @Override
            public void onResponse(Call<HuangQiuBean> call, Response<HuangQiuBean> response) {
                data.clear();
                HuangQiuBean huangQiuBean = response.body();
                List<HuangQiuBean.DataBean.ItemBean> been = huangQiuBean.getData().getItem();
                data.addAll(been);
                adapter.notifyDataSetChanged();
                frameLayout.refreshComplete();
            }

            @Override
            public void onFailure(Call<HuangQiuBean> call, Throwable t) {
                frameLayout.refreshComplete();
            }
        });
    }

    private void loadMore(int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PaiHangInterFace interFace = retrofit.create(PaiHangInterFace.class);
        Call<HuangQiuBean> call = interFace.getHuangqiuBean(page);
        call.enqueue(new Callback<HuangQiuBean>() {
            @Override
            public void onResponse(Call<HuangQiuBean> call, Response<HuangQiuBean> response) {

                HuangQiuBean huangQiuBean = response.body();
                List<HuangQiuBean.DataBean.ItemBean> been = huangQiuBean.getData().getItem();
                data.addAll(been);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<HuangQiuBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), XiangQing02.class);
        intent.putExtra(UtilsString.NEWID, data.get(position).getAid());
        intent.putExtra(UtilsString.NEWTYPE, data.get(position).getNews_show_type());
        startActivity(intent);
    }
}
