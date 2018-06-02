package com.example.zf.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.zf.common.utils.ARouterUtils;

@Route(path = "/app/test1")
public class Test1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }


    public void toMain(View view) {
        ARouterUtils.jump(this,"/app/main");
    }
}
