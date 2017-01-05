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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.qf.adpater.AbsAdapter;
import com.qf.bean.NewBean;
import com.qf.inter.TuiJianInterFace;
import com.qf.myproject.R;
import com.qf.myproject.VideoActivity;
import com.qf.myproject.XiangQing02;
import com.qf.utils.ApiManger;
import com.qf.utils.UtilsString;
import com.qf.widget.BannerView;

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

public class TuiJianFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    //数据源
    List<NewBean.DataBean.ItemBean> datas;
    //适配器
    private AbsAdapter<NewBean.DataBean.ItemBean> adapter;

    //布局
    private int[] layoutId = {R.layout.item_one, R.layout.item_two_layout, R.layout.item_three_layout, R.layout.item_four_layout, R.layout.item_five_layout};

    //页数
    private int page = 1;
    //上拉是否加载更多
    private boolean addMore = false;

    //下拉刷新控件
    private PtrClassicFrameLayout ptrFrame;

    //头部滚动内容
    private BannerView bannerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datas = new ArrayList<>();
        //加载数据
        loadDatas();
        init();
        //头部滚动内容
        bannerView = new BannerView(getContext());
      /*  bannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bannerView!=null){}
                Object bean = bannerView.getTag();
                Intent intent = new Intent(getActivity(), XiangQiuActivity.class);
                intent.putExtra(UtilsString.NEWID,);
                intent.putExtra(UtilsString.NEWTYPE, datas.get(position-1).getNews_show_type());
                startActivity(intent);
            }
        });*/

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.tuijian_fragment_layout, container, false);
        findView(inflate);
        //下拉刷新
        stupView(inflate);

        return inflate;
    }

    private void stupView(View view) {
        ptrFrame = (PtrClassicFrameLayout) view.findViewById(R.id.fragment_rotate_header_with_text_view_frame);

        ptrFrame.disableWhenHorizontalMove(true);
        //设置下拉刷新
        ptrFrame.setLastUpdateTimeRelateObject(this);

        ptrFrame.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                loadDatas();
               // adapter.notifyDataSetChanged();

            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return super.checkCanDoRefresh(frame, listView, header);

            }
        });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    private void findView(View view) {
        listView = (ListView) view.findViewById(R.id.lv);

        listView.addHeaderView(bannerView);

        listView.setAdapter(adapter);


        //listView点击监听
        listView.setOnItemClickListener(this);

        //listView滚动监听
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (addMore && scrollState == 0) {
                    page++;
                    loadMoreDatas(page);
                    //    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                addMore = firstVisibleItem + visibleItemCount == totalItemCount;
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(datas.get(position-1).getCategory().equals("视频")){
            Intent intent = new Intent(getActivity(), VideoActivity.class);
            intent.putExtra(UtilsString.VIDEOID, datas.get(position-1).getAid());
            intent.putExtra(UtilsString.NEWTYPE, datas.get(position-1).getNews_show_type());
            startActivity(intent);
        }else {
            Intent intent = new Intent(getActivity(), XiangQing02.class);
            intent.putExtra(UtilsString.NEWID, datas.get(position - 1).getAid());
            intent.putExtra(UtilsString.NEWTYPE, datas.get(position - 1).getNews_show_type());
            startActivity(intent);
        }
    }


    private void loadDatas() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TuiJianInterFace interFace = retrofit.create(TuiJianInterFace.class);
        Call<NewBean> call = interFace.getItemBean(1 );
        call.enqueue(new Callback<NewBean>() {
            @Override
            public void onResponse(Call<NewBean> call, Response<NewBean> response) {
                datas.clear();
                NewBean bean = response.body();
                List<NewBean.DataBean.ItemBean> item = bean.getData().getItem();
                Log.d("print", " ====》" + item.size());
                datas.addAll(item);
                adapter.notifyDataSetChanged();
                bannerView.setBanner(bean);

                ptrFrame.refreshComplete();
                Log.d("print", " 5555555555");
            }

            @Override
            public void onFailure(Call<NewBean> call, Throwable t) {
                Log.d("print", " 222222222");
                ptrFrame.refreshComplete();
            }
        });

    }


    private void loadMoreDatas(int page) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManger.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TuiJianInterFace interFace = retrofit.create(TuiJianInterFace.class);
        Call<NewBean> call = interFace.getItemBean(page );
        call.enqueue(new Callback<NewBean>() {
            @Override
            public void onResponse(Call<NewBean> call, Response<NewBean> response) {
//                datas.clear();
                NewBean bean = response.body();
                List<NewBean.DataBean.ItemBean> item = bean.getData().getItem();
                Log.d("print", " ====》" + item.size());
                datas.addAll(item);
                adapter.notifyDataSetChanged();
                ptrFrame.refreshComplete();
                Log.d("print", " ===加载数据>");
            }

            @Override
            public void onFailure(Call<NewBean> call, Throwable t) {
                ptrFrame.refreshComplete();
                Log.d("print", " ===加载数据失败---->");
                Toast.makeText(getActivity(), "加载失败，请注意查看网络连接", Toast.LENGTH_LONG).show();
            }
        });

    }

    //适配器
    private void init() {
        adapter = new AbsAdapter<NewBean.DataBean.ItemBean>(datas, getActivity(), layoutId[0], layoutId[1], layoutId[2], layoutId[3], layoutId[4]) {

            @Override
            public int getItemViewType(int position) {
                int type = datas.get(position).getNews_show_type();
                switch (type) {
                    case 10: {
                        itemType = 0;
                    }
                    break;
                    case 20: {
                        itemType = 2;
                    }
                    break;
                    case 31: {
                        itemType = 1;
                    }
                    break;
                    case 13: {
                        itemType = 3;
                    }
                    break;
                    case 14: {
                        itemType = 4;
                    }
                    break;
                }
                return itemType;
            }

            int itemType = 0;

            @Override
            public void bindData(int position, ViewHolder holder) {
                int type = datas.get(position).getNews_show_type();
                switch (type) {
                    case 10: {
                        itemType = 0;
                    }
                    break;
                    case 20: {
                        itemType = 2;
                    }
                    break;
                    case 31: {
                        itemType = 1;
                    }
                    break;
                    case 13: {
                        itemType = 3;
                    }
                    break;
                    case 14: {
                        itemType = 4;
                    }
                    break;
                }

                NewBean.DataBean.ItemBean bean = datas.get(position);
                if (bean != null) {
                    if (itemType == 0) {
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_one);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView title = (TextView) holder.findViewById(R.id.tv_one);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.small_tv_one);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pinglun = (TextView) holder.findViewById(R.id.tv_one_pl);
                        tv_pinglun.setText(bean.getPl());
                    } else if (itemType == 1) {
                        ImageView iv1 = (ImageView) holder.findViewById(R.id.iv_two_1);
                        ImageView iv2 = (ImageView) holder.findViewById(R.id.iv_two_2);
                        ImageView iv3 = (ImageView) holder.findViewById(R.id.iv_two_3);
                        List<String> arr = bean.getImage_arr();
                        Log.d("print", " ==arr==>" + arr.size());
                        Log.d("print", " arr[0]==>" + arr.get(0));
                        Log.d("print", " arr[1]==>" + arr.get(1));
                        Log.d("print", " arr[2]==>" + arr.get(2));
                        Glide.with(getActivity()).load(arr.get(0)).into(iv1);
                        Glide.with(getActivity()).load(arr.get(1)).into(iv2);
                        Glide.with(getActivity()).load(arr.get(2)).into(iv3);
                        TextView tv_title = (TextView) holder.findViewById(R.id.tv_item_two);
                        tv_title.setText(bean.getTitle());
                        TextView tv_pinglun = (TextView) holder.findViewById(R.id.tv_two_pl);
                        tv_pinglun.setText(bean.getPl());
                        TextView tv_small = (TextView) holder.findViewById(R.id.tv_two_tuiguang);
                        tv_small.setText(bean.getCategory());

                    } else if (itemType == 2) {
                        ImageView iv = (ImageView) holder.findViewById(R.id.iv_three);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView title = (TextView) holder.findViewById(R.id.tv_tree_title);
                        title.setText(bean.getTitle());
                        TextView tv_small = (TextView) holder.findViewById(R.id.tv_three_tuiguang);
                        tv_small.setText(bean.getCategory());
                        TextView tv_pinglun = (TextView) holder.findViewById(R.id.tv_three_pl);
                        tv_pinglun.setText(bean.getPl());
                    } else if (itemType == 3) {
                        /*ImageView iv = (ImageView) holder.findViewById(R.id.iv_four);
                        Glide.with(getActivity()).load(bean.getImage()).into(iv);
                        TextView tv_tietle = (TextView) holder.findViewById(R.id.tv_four);
                        tv_tietle.setText(bean.getTitle());*/

                    } else if (itemType == 4) {

                    } else {
                    }
                }
            }
        };
    }
}
