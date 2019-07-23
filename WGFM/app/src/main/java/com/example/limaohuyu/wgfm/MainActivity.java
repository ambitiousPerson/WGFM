package com.example.limaohuyu.wgfm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvLane1;
    private TextView mTvLane2;
    private TextView mTvLane3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }


    private void initView() {
        mTvLane1 = (TextView) findViewById(R.id.tv_lane1);
        mTvLane1.setText("我的打的订单");
        mTvLane2 = (TextView) findViewById(R.id.tv_lane2);
        mTvLane2.setText("我的打的1");
        mTvLane3 = (TextView) findViewById(R.id.tv_lane3);
        mTvLane3.setText("我的打的2");


    }
}
