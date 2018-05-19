package com.example.zf.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.zf.common.utils.ARouterUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpDemo(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("name", "张三");
        bundle.putInt("age", 20);
//        ARouter.getInstance()
//                .build("/component_one/book")
//                .withBundle("bundle", bundle)
//                .navigation();
//        ARouterUtils.jump("/component_one/book", bundle);
    }
}
