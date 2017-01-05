package com.qf.widget;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qf.bean.NewBean;
import com.qf.myproject.R;
import com.qf.myproject.XiangQing02;
import com.qf.utils.UtilsString;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */

public class BannerView extends FrameLayout implements OnBannerClickListener {

    private Banner banner;
    private NewBean data;

    @Override
    public void OnBannerClick(int position) {
        int size = data.getData().getSlide().size();
        for (int i = 0; i < size; i++) {
            if (i==position){
                Intent intent = new Intent(getContext(),XiangQing02.class);
                intent.putExtra(UtilsString.NEWID,data.getData().getSlide().get(position-1).getAid());
                intent.putExtra(UtilsString.NEWTYPE,data.getData().getSlide().get(position-1).getAid());
                getContext().startActivity(intent);
            }
        }
        if(size==position){
            Intent intent = new Intent(getContext(),XiangQing02.class);
            intent.putExtra(UtilsString.NEWID,data.getData().getSlide().get(position-1).getAid());
            intent.putExtra(UtilsString.NEWTYPE,data.getData().getSlide().get(position-1).getAid());
            getContext().startActivity(intent);
        }
       /* switch (position){
            case 1:{
                Intent intent = new Intent(getContext(), XiangQiuActivity.class);
                intent.putExtra(UtilsString.NEWID,data.getData().getSlide().get(0).getAid());
                intent.putExtra(UtilsString.NEWTYPE,data.getData().getSlide().get(1).getAid());
                getContext().startActivity(intent);
            }
            break;
        }*/
    }

    public BannerView(Context context) {
        super(context);
        init();
    }

    public BannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.banner_layout, this, true);
        banner = (Banner) findViewById(R.id.banner);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        banner.setImageLoader(new GlideImageLoader());
        banner.setBannerAnimation(Transformer.DepthPage);
        banner.isAutoPlay(true);
        banner.setDelayTime(2000);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.setOnBannerClickListener(this);
    }

    public class GlideImageLoader extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(context).load(path).into(imageView);
        }
    }

    public void setBanner(NewBean bean) {
        data=bean;
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();
        List<NewBean.DataBean.SlideBean> slide = bean.getData().getSlide();
        for (NewBean.DataBean.SlideBean data:slide){
            urls.add(data.getImage());
            title.add(data.getTitle());
        }
        //设置图片集合
        try {
            banner.setImages(urls);
            Log.d("print", " urls.size" + urls.size());
            banner.setBannerTitles(title);
            Log.d("print", " title.size" + title.size());
            banner.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
