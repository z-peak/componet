package com.example.zf.component;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.zf.common.utils.ARouterUtils;
import com.example.zf.component_one.BookActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvToBook=findViewById(R.id.tvToBook);
        tvToBook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.e("=============","====>onClick");
        Bundle bundle = new Bundle();
        bundle.putString("name", "张三");
        bundle.putInt("age", 20);
        ARouter.getInstance()
                .build("/app/text1")
                //.withBundle("bundle", bundle)
                .navigation(this);
//        ARouterUtils.jump("/component_one/book", bundle);
    }
}
