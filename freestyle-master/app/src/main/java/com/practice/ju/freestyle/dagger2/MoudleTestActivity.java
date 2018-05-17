package com.practice.ju.freestyle.dagger2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.practice.ju.freestyle.R;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/17.
 */

public class MoudleTestActivity extends AppCompatActivity{
    public static final String TAG=MoudleTestActivity.class.getSimpleName();
    @Inject
    Person mPerson;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moudle_test);
        DaggerPersonComponent.builder().dateMoudle(new DateMoudle()).build().inject(this);
        Log.i(TAG,mPerson.getName());
    }
}
