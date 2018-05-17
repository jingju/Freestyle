package com.practice.ju.freestyle.dagger2;


import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/17.
 */

public class User {
    private String name;

    //todo dagger不能同时标记两个构造方法
    @Inject
    public User() {
        name="悟空";
    }

    //todo 这个时候，String也需要用Inject标注，但我们无法标注String,这个时候用到Model;
    //todo 参考Person类
    //todo 同时使用这两种方式，Moudle的优先级高于Inject
    //todo why 使用这种方式和使用Moudle方式不能被同一类依赖？？？？？？？？？
//    @Inject
//    public User(String s){
//
//    }

    public String getName() {
        return name;
    }
}
