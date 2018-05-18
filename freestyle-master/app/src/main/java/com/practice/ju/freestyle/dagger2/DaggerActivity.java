package com.practice.ju.freestyle.dagger2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.R;
import com.practice.ju.freestyle.dagger2.whole.DependenceTestActivity;
import com.practice.ju.freestyle.dagger2.whole.ExtendTestActivity;
import com.practice.ju.freestyle.dagger2.whole.SubComponentTestActivity;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/17.
 */

public class DaggerActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG=DaggerActivity.class.getSimpleName();

    Context mContext;

    @Inject
    User mUser;
    private TextView mTvModuleTest;
    private TextView mTvScopeTest;
    private TextView mTvSubComponet;
    private TextView mTvDependence;
    private TextView mTvExtendTest;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_dagger);
        mContext=this;
        mTvModuleTest = (TextView)findViewById(R.id.tv_modletest);
        mTvScopeTest = (TextView)findViewById(R.id.tv_scopetest);
        mTvSubComponet = (TextView)findViewById(R.id.tv_subcomponent);
        mTvDependence = (TextView)findViewById(R.id.tv_dependence);
        mTvExtendTest = (TextView)findViewById(R.id.tv_extendtest);
        mTvModuleTest.setOnClickListener(this);
        mTvScopeTest.setOnClickListener(this);
        mTvSubComponet.setOnClickListener(this);
        mTvDependence.setOnClickListener(this);
        mTvExtendTest.setOnClickListener(this);

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
                case R.id.tv_scopetest:
                Intent intent1 = new Intent(mContext,SingletonTestActivity.class);
                mContext.startActivity(intent1);
                break;
                case R.id.tv_subcomponent:
                Intent intent2 = new Intent(mContext,SubComponentTestActivity.class);
                mContext.startActivity(intent2);
                break;
                case R.id.tv_dependence:
                Intent intent3 = new Intent(mContext,DependenceTestActivity.class);
                mContext.startActivity(intent3);
                break;
                case R.id.tv_extendtest:
                Intent intent4 = new Intent(mContext,ExtendTestActivity.class);
                mContext.startActivity(intent4);
                break;
                default:
                    break;
        }
    }
}
