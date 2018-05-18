package com.practice.ju.freestyle.dagger2.whole;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.practice.ju.freestyle.AppApplication.App;
import com.practice.ju.freestyle.R;

/**
 * Created by guangju on 2018/5/18.
 */

public class SubComponentTestActivity extends AppCompatActivity {

    private ActivityComponent sActivityComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcomponent_test);

        sActivityComponent = DaggerActivityComponent.builder().appComponent(((App) getApplication()).getAppComponent())
                .actModule(new ActModule())
                .build();

        SubFragmet subFragmet = new SubFragmet();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl_container, subFragmet);
        ft.commit();
    }

    public ActivityComponent getsActivityComponent() {
        return sActivityComponent;
    }
}
