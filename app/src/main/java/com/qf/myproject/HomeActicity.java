package com.qf.myproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.qf.fragment.MineFragment;
import com.qf.fragment.NewsFragment;
import com.qf.fragment.ShopFragment;
import com.qf.fragment.VideoFragment;

/**
 * Created by Administrator on 2016/12/12.
 */

public class HomeActicity extends BaseNoActionBarActivity {
    //底部文字
    private String[] tabTitle = {"资讯", "视频", "商城", "我的"};
    //底部图片id
    private int[] imagId = {R.drawable.new_selse, R.drawable.video_selse, R.drawable.shop_selse, R.drawable.mine_selse};
    //tab使用的fragment
    Class[] fragments = {NewsFragment.class, VideoFragment.class, ShopFragment.class, MineFragment.class};

    private FragmentTabHost tabHost;

    private LayoutInflater inflater;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity_layout);

        init();
    }

    private void init() {
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        //设置tabHost
        tabHost.setup(this, getSupportFragmentManager(), R.id.fl);
        inflater = LayoutInflater.from(this);
        for (int i = 0; i < tabTitle.length; i++) {
            TabHost.TabSpec itemTab = tabHost.newTabSpec(i + "");
            itemTab.setIndicator(getTabItemView(i));
            tabHost.addTab(itemTab, fragments[i], null);
            tabHost.getTabWidget().setDividerDrawable(android.R.color.transparent);
        }
    }

    //加载底部导航tab
    private View getTabItemView(int id) {
        View view = inflater.inflate(R.layout.tab_item_layout, null);
        ImageView iv = (ImageView) view.findViewById(R.id.iv_tab);
        iv.setImageResource(imagId[id]);
        TextView tv = (TextView) view.findViewById(R.id.tv_tab);
        tv.setText(tabTitle[id]);
        return view;
    }

   // 按两次退出
    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(getApplicationContext(), "再按一次退出程序",
                        Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
