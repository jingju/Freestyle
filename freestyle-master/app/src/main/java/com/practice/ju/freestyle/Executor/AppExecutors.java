package com.practice.ju.freestyle.Executor;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by guangju on 2018/5/23.
 */

public class AppExecutors {
    private AppExecutors executors;
    private static final int THREAD_COUNT = 3;
    private final Executor disIO;

    private final Executor mainThread;


    public AppExecutors() {
        this(Executors.newSingleThreadExecutor(),new MainThreadExecutor()
        );
    }

    private AppExecutors(Executor disIO, Executor mainThread) {
        this.disIO = disIO;
        this.mainThread = mainThread;
    }

    public Executor diskIO(){
        return disIO;
    }

    public Executor mainThread(){
        return mainThread;
    }


    public static class MainThreadExecutor implements Executor {
        private final Handler handler =new Handler(Looper.getMainLooper());
        @Override
        public void execute(Runnable r){
            handler.post(r);

        }
    }


}
