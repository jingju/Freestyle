package com.practice.ju.freestyle.dagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by guangju on 2018/5/17.
 */
@Module
public class DateMoudle {

    //todo 默认的
    @Provides
    Person providePerson(){
        return new Person();
    }

    //todo 采用qulifier注解，表示可以提供这种类型的限定符a

    @Provides
    @Named("male")
    Person provideMale(){
        return new Person("汉子");
    }

    @Provides
    @Named("female")
    Person provideFemale(){
        return new Person("妹纸");
    }
    @Provides
    @PersonQualifier
    Person providePersonQualifier(){
        return new Person("PersonQualifier name");
    }

    //todo scope 相关
    @Provides
    @Singleton
    SingletonTestEntity provideSingletonTestEntity(){
        return  new SingletonTestEntity("测试单利");
    }

}
