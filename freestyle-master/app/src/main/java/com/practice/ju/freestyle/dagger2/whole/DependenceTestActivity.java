package com.practice.ju.freestyle.dagger2.whole;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.practice.ju.freestyle.AppApplication.App;
import com.practice.ju.freestyle.R;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/18.
 */

public class DependenceTestActivity extends AppCompatActivity{
    public static String TAG=DependenceTestActivity.class.getSimpleName();

    @Inject
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependence_test);
        DaggerActivityComponent.builder().appComponent(((App)getApplication()).getAppComponent())
                .build().inject(this);
        Log.i(TAG,context+"");
    }
}
