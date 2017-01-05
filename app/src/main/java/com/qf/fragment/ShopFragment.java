package com.qf.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.qf.myproject.R;
import com.qf.myproject.UrlActivity;
import com.qf.utils.ApiManger;
import com.qf.utils.UtilsString;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ShopFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.shopfragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        webView = (WebView) view.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //启动一个Activity, 并传入Url
                Intent intent = new Intent(getActivity(), UrlActivity.class);
                intent.putExtra(UtilsString.URL, url);
                startActivity(intent);
                return true;
            }
        });
        webView.loadUrl(ApiManger.SHOPPING);

    }
}
