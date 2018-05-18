package com.practice.ju.freestyle.dagger2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.R;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/18.
 *
 * todo 这个相当于用一个单利的component提供相同的对象
 */

public class SingletonTestActivity extends AppCompatActivity{
    public static String TAG =SingletonTestActivity.class.getSimpleName();
    Context mContext;

    private TextView tvScpTest;

    @Inject
    SingletonTestEntity mSingletonTestEntity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_test);
        mContext=this;
        SingletonTestComponent.getInstance().inject(this);
        tvScpTest = (TextView) findViewById(R.id.tv_scpetest);
        tvScpTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SingletonTestActivity.class);
                mContext.startActivity(intent);
            }
        });

        Log.i(TAG,mSingletonTestEntity.getDesc());
    }
}
