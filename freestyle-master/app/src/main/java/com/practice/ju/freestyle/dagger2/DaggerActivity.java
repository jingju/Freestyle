package com.practice.ju.freestyle.dagger2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.R;

import javax.inject.Inject;

import dagger.Module;

/**
 * Created by guangju on 2018/5/17.
 */

public class DaggerActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG=DaggerActivity.class.getSimpleName();

    Context mContext;

    @Inject
    User mUser;
    private TextView mTvModuleTest;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_dagger);
        mContext=this;
        mTvModuleTest = (TextView)findViewById(R.id.tv_modletest);
        mTvModuleTest.setOnClickListener(this);

        //todo dagger Inject构造方法的方式创建对象
        DaggerOnlyInjectComponent.builder().build().inject(this);
        Log.i(TAG,mUser.getName());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_modletest:
                Intent intent = new Intent(mContext, MoudleTestActivity.class);
                mContext.startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
