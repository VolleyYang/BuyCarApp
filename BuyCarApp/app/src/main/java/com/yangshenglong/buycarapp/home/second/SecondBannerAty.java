package com.yangshenglong.buycarapp.home.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.yangshenglong.buycarapp.R;
import com.yangshenglong.buycarapp.base.BaseActivity;

public class SecondBannerAty extends BaseActivity {

    private Intent intent;
    private WebView webView;
    @Override
    public int setLayout() {
        return R.layout.activity_second_banner;
    }

    @Override
    public void initView() {
        webView = (WebView) findViewById(R.id.home_web);
    }

    @Override
    public void initData() {
        intent = getIntent();
        String web = intent.getStringExtra("web");

        webView.loadUrl(web);
    }
}
