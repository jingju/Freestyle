package com.practice.ju.freestyle.dagger2;

import com.practice.ju.freestyle.MainActivity;

import dagger.Component;

/**
 * Created by guangju on 2018/5/17.
 */
@Component(modules = DateMoudle.class)
public interface PersonComponent {
    void inject(MoudleTestActivity moudleTestActivity);
}
