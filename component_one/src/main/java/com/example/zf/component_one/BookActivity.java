package com.example.zf.component_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.zf.common.utils.ARouterUtils;

@Route(path = "/component_one/book")
public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        TextView textView=findViewById(R.id.textView);
        Bundle bundle=getIntent().getBundleExtra("bundle");
        textView.setText(bundle.getString("name")+" -- "+bundle.getInt("age"));

    }

    public void toTest1(View view) {
        ARouterUtils.jump(this,"/app/test1");

    }
}
