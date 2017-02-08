package com.yangshenglong.buycarapp.home.second.zhengbei;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.yangshenglong.buycarapp.R;
import com.yangshenglong.buycarapp.base.BaseActivity;
import com.yangshenglong.buycarapp.home.second.zhengbei.jingli.ManagerFragment;
import com.yangshenglong.buycarapp.home.second.zhengbei.pinggu.AssessFragment;
import com.yangshenglong.buycarapp.home.second.zhengbei.shouxu.FormalitiesFragment;
import com.yangshenglong.buycarapp.home.second.zhengbei.yunying.OperationFragment;
import com.yangshenglong.buycarapp.home.second.zhengbei.zhengbeiyuan.HostlingFragment;

//整备管理
public class HostlingAty extends BaseActivity implements View.OnClickListener {

    private RadioButton rbtSx,rbtPg,rbtZb,rbtManager,rbtYy;
    @Override
    public int setLayout() {
        return R.layout.activity_hostling_aty;
    }

    @Override
    public void initView() {

        rbtManager = (RadioButton) findViewById(R.id.rbt_jl);
        rbtPg = (RadioButton) findViewById(R.id.rbt_pg);
        rbtSx = (RadioButton) findViewById(R.id.rbt_sx);
        rbtYy = (RadioButton) findViewById(R.id.rbt_yy);
        rbtZb = (RadioButton) findViewById(R.id.rbt_zb);
    }


    @Override
    public void initData() {

        //默认为手续员页面
        replace(new FormalitiesFragment());
        //点击事件
        rbtZb.setOnClickListener(this);
        rbtSx.setOnClickListener(this);
        rbtPg.setOnClickListener(this);
        rbtManager.setOnClickListener(this);
        rbtYy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rbt_sx:
                replace(new FormalitiesFragment());
                break;
            case R.id.rbt_pg:
                replace(new AssessFragment());
                break;
            case R.id.rbt_zb:
                replace(new HostlingFragment());
                break;
            case R.id.rbt_jl:
                replace(new ManagerFragment());
                break;
            case R.id.rbt_yy:
                replace(new OperationFragment());
                break;

        }
    }

    //替换方法
    public void replace(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.replace,fragment);
        transaction.commit();
    }
}
