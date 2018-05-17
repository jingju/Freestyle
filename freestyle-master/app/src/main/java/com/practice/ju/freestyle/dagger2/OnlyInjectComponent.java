package com.practice.ju.freestyle.dagger2;

import dagger.Component;

/**
 * Created by guangju on 2018/5/17.
 */
@Component()
public interface OnlyInjectComponent {

    void inject(DaggerActivity daggerActivity);
}
