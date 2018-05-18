package com.practice.ju.freestyle.dagger2.whole;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.ju.freestyle.R;
import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/18.
 */

public class SubFragmet extends Fragment {

    public static final String TAG=SubFragmet.class.getSimpleName();

    @Inject
    ActEntity actEntity;

    @Inject
    Context context;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_sub,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initInject();
    }

    private void initInject() {
        ((SubComponentTestActivity)getActivity()).getsActivityComponent().getActSubComponent().inject(this);
        Log.i(TAG,"who="+actEntity.getWho()+"--context="+context);

    }
}
