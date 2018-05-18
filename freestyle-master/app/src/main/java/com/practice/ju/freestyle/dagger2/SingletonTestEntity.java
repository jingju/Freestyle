package com.practice.ju.freestyle.dagger2;

import javax.inject.Inject;

/**
 * Created by guangju on 2018/5/18.
 */

public class SingletonTestEntity {
    private String desc;

    @Inject
    public SingletonTestEntity(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
