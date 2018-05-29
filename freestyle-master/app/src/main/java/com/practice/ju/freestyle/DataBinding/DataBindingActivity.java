package com.practice.ju.freestyle.DataBinding;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.R;
import com.practice.ju.freestyle.databinding.ActivityDataBindingBinding;
import butterknife.ButterKnife;
/**
 * Created by guangju on 2018/5/24.
 *
 * modudle gradle中的buildtoolversion 一定要写，否则databinding 会报错
 */

public class DataBindingActivity extends AppCompatActivity {

//    @BindView(R.id.tv_databinding)
//    TextView tvDatabinding;

    // TODO: 2018/5/28 databinding不能和butteknife一期使用

    private ActivityDataBindingBinding mBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        // TODO: 2018/5/28 初始话databinding
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        User user = new User();
        user.name="hello databinding";
        mBinding.setUser(user);




    }

//    @OnClick({R.id.tv_databinding})
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.tv_databinding:
//
//
//                break;
//                default:
//                    break;
//        }
//
//    }
}
