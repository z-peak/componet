package com.example.zf.common.utils;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Map;

public class ARouterUtils {

    /**
     * 应用内简单的跳转
     *
     * @param url
     */
    public static void jump(Context context, String url) {
        ARouter.getInstance().build(url).navigation(context,new NavigationCallback() {
            @Override
            public void onFound(Postcard postcard) {//路由目标被发现时调用
                Log.e("=====================","==============>onFound"+ postcard.getPath());
            }

            @Override
            public void onLost(Postcard postcard) {//路由被丢失时调用
                Log.e("=====================","==============>onLost"+ postcard.getPath());
            }

            @Override
            public void onArrival(Postcard postcard) {//路由到达之后调用
                Log.e("=====================","==============>onArrival"+ postcard.getPath());
            }

            @Override
            public void onInterrupt(Postcard postcard) {//路由被拦截时调用
                Log.e("=====================","==============>onInterrupt"+ postcard.getPath());
            }
        });
    }

    public static void jump(Context context, String url, Bundle bundle) {
        ARouter.getInstance()
                .build(url)
                .withBundle("bundle", bundle)
                .navigation(context,new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {//路由目标被发现时调用
                        Log.e("=====================","==============>onFound"+ postcard.getPath());
                    }

                    @Override
                    public void onLost(Postcard postcard) {//路由被丢失时调用
                        Log.e("=====================","==============>onLost"+ postcard.getPath());
                    }

                    @Override
                    public void onArrival(Postcard postcard) {//路由到达之后调用
                        Log.e("=====================","==============>onArrival"+ postcard.getPath());
                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {//路由被拦截时调用
                        Log.e("=====================","==============>onInterrupt"+ postcard.getPath());
                    }
                });
    }

}
