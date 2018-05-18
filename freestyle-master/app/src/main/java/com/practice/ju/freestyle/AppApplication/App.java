package com.practice.ju.freestyle.AppApplication;

import android.app.Application;

import com.practice.ju.freestyle.dagger2.whole.AppComponent;
import com.practice.ju.freestyle.dagger2.whole.AppModule;
import com.practice.ju.freestyle.dagger2.whole.DaggerAppComponent;

/**
 * Created by guangju on 2018/5/18.
 */

public class App extends Application{
    private static AppComponent sAppComponent=null;
    @Override
    public void onCreate() {
        super.onCreate();
        if(sAppComponent==null)
            sAppComponent= DaggerAppComponent.builder().appModule(new AppModule(this))
                    .build();
    }

    public static AppComponent getAppComponent() {
        return sAppComponent;
    }
}
