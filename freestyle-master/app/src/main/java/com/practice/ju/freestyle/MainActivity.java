package com.practice.ju.freestyle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.DataBinding.DataBindingActivity;
import com.practice.ju.freestyle.dagger2.DaggerActivity;
import com.practice.ju.freestyle.room.RoomActivity;
import com.practice.ju.freestyle.utils.AppUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG=MainActivity.class.getSimpleName();
    Context context;
    private TextView tv_dagger2;
    private TextView tv_room;
    private TextView tv_databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        tv_dagger2 = (TextView) findViewById(R.id.tv_dagger2);
        tv_room = (TextView) findViewById(R.id.tv_room);
        tv_databinding = (TextView) findViewById(R.id.tv_databinding);
        tv_dagger2.setOnClickListener(this);
        tv_room.setOnClickListener(this);
        tv_databinding.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tv_dagger2:
                AppUtils.startActivity(context,DaggerActivity.class);
                break;
            case R.id.tv_room:
                AppUtils.startActivity(context,RoomActivity.class);
                break;
            case R.id.tv_databinding:
                AppUtils.startActivity(context,DataBindingActivity.class);
                break;
                default:
                    break;
        }
    }
}
