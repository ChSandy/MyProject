package com.qf.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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
import com.qf.bean.PaiHangBean;
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

public class PaiHangFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<PaiHangBean.DataBean.ItemBean> data;
    private AbsAdapter<PaiHangBean.DataBean.ItemBean> adapter;
    //布局
    private int[] layoutId = {R.layout.item_one, R.layout.item_two_layout};

    //页数
    private int page = 1;
    private boolean addMore = false;

    //下拉加载
    private PtrClassicFrameLayout layout;

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
        setView(view);
        //下拉刷新
        loadNew();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listViewListener();

    }

    private void listViewListener() {
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
               if(addMore&&scrollState==0){
                   page++;
                   loadMore(page);
               }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                addMore=(firstVisibleItem+visibleItemCount==totalItemCount);
            }
        });
    }


    private void setView(View view) {
        listView = (ListView) view.findViewById(R.id.lv);
        layout = (PtrClassicFrameLayout) view.findViewById(R.id.fragment_rotate_header_with_text_view_frame);
        listView.setAdapter(adapter);

        //ListView点击事件
        listView.setOnItemClickListener(this);

    }

    private void loadNew() {
        layout.setLastUpdateTimeRelateObject(this);
        layout.disableWhenHorizontalMove(true);
        layout.setPtrHandler(new PtrDefaultHandler() {
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

    private void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final PaiHangInterFace interFace = retrofit.create(PaiHangInterFace.class);
        Call<PaiHangBean> call = interFace.getPaiHangBean(1 );
        call.enqueue(new Callback<PaiHangBean>() {
            @Override
            public void onResponse(Call<PaiHangBean> call, Response<PaiHangBean> response) {
                data.clear();
                PaiHangBean bean = response.body();
                data.addAll(bean.getData().getItem());
                adapter.notifyDataSetChanged();
                layout.refreshComplete();
            }

            @Override
            public void onFailure(Call<PaiHangBean> call, Throwable t) {
                layout.refreshComplete();
            }
        });


    }

    private void initAdapter() {
        //适配器
        adapter = new AbsAdapter<PaiHangBean.DataBean.ItemBean>(data, getActivity(), layoutId[0], layoutId[1]) {
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

            int itemType = 0;

            @Override
            public void bindData(int position, ViewHolder holder) {
                int showType = data.get(position).getNews_show_type();
                switch (showType) {
                    case 10: {
                        itemType = 0;
                    }
                    break;
                    case 31: {
                        itemType = 1;
                    }
                    break;
                }

                PaiHangBean.DataBean.ItemBean bean = data.get(position);
                if (bean != null) {
                    if (itemType == 0) {
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_one);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView tv_title = (TextView) holder.findViewById(R.id.tv_one);
                        tv_title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.small_tv_one);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pl = (TextView) holder.findViewById(R.id.tv_one_pl);
                        tv_pl.setText(bean.getPl());

                    } else if (itemType == 1) {
                        ImageView iv1 = (ImageView) holder.findViewById(R.id.iv_two_1);
                        ImageView iv2 = (ImageView) holder.findViewById(R.id.iv_two_2);
                        ImageView iv3 = (ImageView) holder.findViewById(R.id.iv_two_3);
                        List<String> imageArr = bean.getImage_arr();
                        Glide.with(getActivity()).load(imageArr.get(0)).into(iv1);
                        Glide.with(getActivity()).load(imageArr.get(1)).into(iv2);
                        Glide.with(getActivity()).load(imageArr.get(2)).into(iv3);
                        TextView tv_title = (TextView) holder.findViewById(R.id.tv_item_two);
                        tv_title.setText(bean.getTitle());
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


    private void loadMore(int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PaiHangInterFace interFace = retrofit.create(PaiHangInterFace.class);
        Call<PaiHangBean> call = interFace.getPaiHangBean(page );
        Log.d("print", " ==========page======="+page);
        call.enqueue(new Callback<PaiHangBean>() {
            @Override
            public void onResponse(Call<PaiHangBean> call, Response<PaiHangBean> response) {
                PaiHangBean bean = response.body();
                data.addAll(bean.getData().getItem());
                Log.d("print", " ===>" + bean.toString());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<PaiHangBean> call, Throwable t) {

            }
        });
    }

    //点击事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(getActivity(), XiangQing02.class);
        intent.putExtra(UtilsString.NEWID, data.get(position).getAid());
        intent.putExtra(UtilsString.NEWTYPE, data.get(position).getNews_show_type());
        startActivity(intent);

    }
}
