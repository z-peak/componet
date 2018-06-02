package com.example.zf.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.zf.common.utils.ARouterUtils;
@Route(path = "/app/main")
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
        Bundle bundle = new Bundle();
        bundle.putString("name", "张三");
        bundle.putInt("age", 20);
        ARouterUtils.jump(this,"/component_one/book", bundle);
    }
}
