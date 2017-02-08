package com.yangshenglong.buycarapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.yangshenglong.buycarapp.base.BaseActivity;
import com.yangshenglong.buycarapp.home.first.HomeFragment;
import com.yangshenglong.buycarapp.my.MyFragment;
import com.yangshenglong.buycarapp.share.ShareFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private RadioButton  rbtHome,rbtShare,rbtMy;

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        rbtHome = (RadioButton) findViewById(R.id.rbt_home);
        rbtShare = (RadioButton) findViewById(R.id.rbt_share);
        rbtMy = (RadioButton) findViewById(R.id.rbt_my);
    }

    @Override
    public void initData() {
        //登录时默认为首页
        replace(new HomeFragment());

        //RadioButton 点击事件
        rbtShare.setOnClickListener(this);
        rbtHome.setOnClickListener(this);
        rbtMy.setOnClickListener(this);
    }

    //RadioButton 点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rbt_home:
                replace(new HomeFragment());
                break;
            case R.id.rbt_share:
                replace(new ShareFragment());
                break;
            case R.id.rbt_my:
                replace(new MyFragment());
                break;
        }
    }


    public void replace(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.replace,fragment);
        transaction.commit();
    }
}
