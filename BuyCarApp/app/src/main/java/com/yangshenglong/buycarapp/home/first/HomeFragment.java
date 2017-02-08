package com.yangshenglong.buycarapp.home.first;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.yangshenglong.buycarapp.R;
import com.yangshenglong.buycarapp.base.BaseFragment;
import com.yangshenglong.buycarapp.home.second.SecondBannerAty;
import com.yangshenglong.buycarapp.home.second.zhengbei.ZbAty;
import com.yangshenglong.buycarapp.okhttp.NetTool;
import com.yangshenglong.buycarapp.okhttp.onHttpCallback;
import com.yangshenglong.buycarapp.staicclass.StaticClass;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;

/**
 * Created by VolleyYang on 17/1/24.
 */

public class HomeFragment extends BaseFragment implements View.OnClickListener {
    private Banner  banner;
    private ArrayList<String> pics = new ArrayList<>();
    private BannerBean  data;
    private Intent intent ;
    private String bannerWeb;
    private ImageView imgZb;

    @Override
    public int setLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView(View view) {
        banner = (Banner) view.findViewById(R.id.banner);
        imgZb = (ImageView) view.findViewById(R.id.img_zb);
    }

    @Override
    public void initData() {

//        Test test = new Test();
//        test.setAccount("11324134234");
//
//        Gson gson = new Gson();
//        String testJson = gson.toJson(test);


        //Banner  网络解析
        BannerInternet();

        imgZb.setOnClickListener(this);

    }

    private void BannerInternet() {
        String  name = "1";
        NetTool.getInstance().startRequest(StaticClass.HOMEBANNER,name, BannerBean.class, new onHttpCallback<BannerBean>() {
            @Override
            public void onSuccess(BannerBean response) {

                data = response;
                for (int i = 0; i <response.getData().size() ; i++) {
                    pics.add(response.getData().get(i).getPicurl());
                }
                bannerImg();
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    private void bannerImg() {
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);

        banner.setImageLoader(new GlideImageLoader());

        banner.setImages(pics);

        banner.setBannerAnimation(Transformer.DepthPage);

        banner.isAutoPlay(true);

        banner.setDelayTime(2000);

        banner.setIndicatorGravity(BannerConfig.CENTER);

        banner.start();


        //banner点击事件
        banner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                bannerWeb = data.getData().get(position).getClickurl();
                //banner 跳转详情页
                intent = new Intent(getContext(), SecondBannerAty.class);
                intent.putExtra("web",bannerWeb);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_zb:
                intent = new Intent(getContext(), ZbAty.class);
                startActivity(intent);
                break;
        }
    }
}
