package com.practice.ju.freestyle.dagger2.whole;

import dagger.Subcomponent;

/**
 * Created by guangju on 2018/5/18.
 */
@Subcomponent()
@PerActivity
public interface ActSubComponent {
    void inject(SubFragmet subFragmetn);
}
