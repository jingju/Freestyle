package com.practice.ju.freestyle.dagger2.whole;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.practice.ju.freestyle.R;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/18.
 */

public class ExtendTestActivity extends AppCompatActivity{
    public static String TAG=ExtendTestActivity.class.getSimpleName();
    @Inject
    ActEntity mAct;

    @Inject
    Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_test);
        DaggerExtendTestComponent.builder().actModule(new ActModule())
                .appModule(new AppModule(getApplication()))
                .build().inject(this);
        Log.i(TAG,mAct.getWho()+"---"+mContext);
    }
}
