package com.practice.ju.freestyle.dagger2;


import dagger.Component;

/**
 * Created by guangju on 2018/5/17.
 *
 * todo component的三种使用方式
 * 1、@Component的dependences属性，和一个compnent可以依赖一个或多个component
 * 2、包含关系，一个component可以包含多个component @SubComponent标记接口或
 * 抽象类，表示它可以被包含
 * 3、继承关系，用一个component去继承另一个component
 */
@Component(modules = DateMoudle.class)
public interface PersonComponent {
    void inject(MoudleTestActivity moudleTestActivity);
}
