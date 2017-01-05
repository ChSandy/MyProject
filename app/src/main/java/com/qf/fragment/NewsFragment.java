package com.qf.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.myproject.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class NewsFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    //数据源
    private Fragment[] fragments;
    //标题题
    private String[] title = {"推荐","排行","图片","环球","历史"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        fragments = new Fragment[title.length];
        fragments[0] = new TuiJianFragment();
        fragments[1] = new PaiHangFragment();
        fragments[2] = new TuPianFragment();
        fragments[3] = new HuangQiuFragment();
        fragments[4] = new LiShiFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.newfragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title[position];
            }
        };
        viewPager.setAdapter(adapter);

        //设置联动
        tabLayout.setupWithViewPager(viewPager);
       /* for (int i = 0; i <tabLayout.getTabCount() ; i++) {
            tabLayout.getTabAt(i).setText(title[i]);
        }*/

    }

}
