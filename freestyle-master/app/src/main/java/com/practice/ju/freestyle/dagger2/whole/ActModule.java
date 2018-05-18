package com.practice.ju.freestyle.dagger2.whole;

import dagger.Module;
import dagger.Provides;

/**
 * Created by guangju on 2018/5/18.
 */
@Module
public class ActModule {

    @Provides
    ActEntity getActEntity(){
        return new ActEntity("我是actentity");
    }
}
