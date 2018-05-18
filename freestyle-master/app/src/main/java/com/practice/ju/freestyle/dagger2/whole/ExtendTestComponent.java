package com.practice.ju.freestyle.dagger2.whole;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by guangju on 2018/5/18.
 */
@Singleton
@Component(modules = {ActModule.class,AppModule.class})
public interface ExtendTestComponent {
    void inject(ExtendTestActivity extendTestActivity);
}
