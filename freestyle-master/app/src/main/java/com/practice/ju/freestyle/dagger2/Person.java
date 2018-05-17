package com.practice.ju.freestyle.dagger2;

/**
 * Created by guangju on 2018/5/17.
 */

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name="一个烂好人";
    }

    public String getName() {
        return name;
    }
}
