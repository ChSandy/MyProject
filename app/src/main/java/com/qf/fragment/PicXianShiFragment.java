package com.qf.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qf.myproject.R;
import com.qf.utils.UtilsString;

/**
 * Created by Administrator on 2016/12/17.
 */

public class PicXianShiFragment extends Fragment {

    private ImageView imag_pic_xiangshi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.pic_xiangshi_fragment, container, false);
        imag_pic_xiangshi = (ImageView) inflate.findViewById(R.id.imag_pic_xiangshi);
        Bundle bundle = getArguments();
        String url = bundle.getString(UtilsString.KEY);
        Log.d("print", " pic_显示" + url);
        Glide.with(getActivity()).load(url).into(imag_pic_xiangshi);
        return inflate;
    }

}
