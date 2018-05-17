package com.practice.ju.freestyle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.dagger2.DaggerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG=MainActivity.class.getSimpleName();
    Context context;
    private TextView tv_dagger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        tv_dagger2 = (TextView) findViewById(R.id.tv_dagger2);
        tv_dagger2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tv_dagger2:
                Intent intent = new Intent(context, DaggerActivity.class);
                context.startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
