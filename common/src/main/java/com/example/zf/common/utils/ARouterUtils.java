package com.example.zf.common.utils;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Map;

public class ARouterUtils {

    /**
     * 应用内简单的跳转
     *
     * @param url
     */
    public static void jump(String url) {
        ARouter.getInstance().build(url).navigation();
    }

    public static void jump(String url, Bundle bundle) {
        ARouter.getInstance()
                .build(url)
                .withBundle("bundle", bundle)
                .navigation();
    }

}
