package com.practice.ju.freestyle.room;

import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.practice.ju.freestyle.Executor.AppExecutors;
import com.practice.ju.freestyle.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by guangju on 2018/5/23.
 */

public class RoomActivity extends AppCompatActivity {
    public static final String TAG = RoomActivity.class.getSimpleName();

    Context mContext;
    @BindView(R.id.tv_show_test)
    TextView tvShowTest;
    @BindView(R.id.tv_insert)
    TextView tvInsert;
    @BindView(R.id.tv_qury)
    TextView tvQury;
    @BindView(R.id.tv_deletestudent)
    TextView tvDeletestudent;

    StudentDao mStduDao;
    private AppExecutors appExecutors;


    public static final int  LOADER_ID=202;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_room);
        ButterKnife.bind(this);
        mContext = this;
        mStduDao = CommonDateBase.getINSTANCE(mContext).studentDao();
        appExecutors = new AppExecutors();


        Loader<Object> loader = getLoaderManager().getLoader(LOADER_ID);




    }


    @OnClick({R.id.tv_insert, R.id.tv_qury, R.id.tv_deletestudent})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_insert:
                final Student student = new Student(1, "第一个","男");
                appExecutors.diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        mStduDao.insertStudent(student);
                    }
                });
                break;
            case R.id.tv_qury:
                appExecutors.diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        final Student student1 = mStduDao.getStudent();
                        appExecutors.mainThread().execute(new Runnable() {
                            @Override
                            public void run() {
                                tvShowTest.setText("id=" + student1.mId
                                        + "name=" + student1.mName
                                        + "sex"+student1.mSex
                                );
                            }
                        });
                    }
                });

                break;
            case R.id.tv_deletestudent:
                appExecutors.diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        mStduDao.deleteALLStudents();
                        final Student student1 = mStduDao.getStudent();
                        appExecutors.mainThread().execute(new Runnable() {
                            @Override
                            public void run() {
                                tvShowTest.setText("id=" + student1.mId
                                        + "name=" + student1.mName);
                            }
                        });
                    }
                });
                break;
            default:
                break;
        }
    }


}
