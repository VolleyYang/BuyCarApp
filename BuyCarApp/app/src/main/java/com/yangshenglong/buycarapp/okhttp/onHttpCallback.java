package com.yangshenglong.buycarapp.okhttp;

/**
 * Created by VolleyYang on 16/12/20.
 */
public interface onHttpCallback<T> {
    void onSuccess(T response);
    void onError(Throwable e);
}
