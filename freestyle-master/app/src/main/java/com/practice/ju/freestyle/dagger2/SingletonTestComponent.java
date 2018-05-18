package com.practice.ju.freestyle.dagger2;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by guangju on 2018/5/18.
 *
 * todo @Component可一作用于接口，也可以作用于抽象类
 *
 * 为了方便测试，把接口改成了抽象类，实际开发中，可以在Application
 * 中初始化单利
 */
@Component(modules = DateMoudle.class)
@Singleton
public abstract class SingletonTestComponent {
    public abstract void inject(SingletonTestActivity singletonTestActivity);

    /**
     * SingletonTestComponent必须也是单利，否则无法保证提供的对象也是单利
     */
    private static SingletonTestComponent sComponent;

    public static SingletonTestComponent getInstance(){

        if(sComponent==null) {
            sComponent=DaggerSingletonTestComponent.builder().build();

        }
        return sComponent;
    }


}
