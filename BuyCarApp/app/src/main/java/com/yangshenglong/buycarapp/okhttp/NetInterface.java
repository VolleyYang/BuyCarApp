package com.yangshenglong.buycarapp.okhttp;

/**
 * Created by VolleyYang on 16/12/20.
 */
public interface NetInterface {
    void startRequest(String url, onHttpCallback<String> callback);

    <T> void startRequest(String url, Class<T> tClass, onHttpCallback<T> callback);
}
