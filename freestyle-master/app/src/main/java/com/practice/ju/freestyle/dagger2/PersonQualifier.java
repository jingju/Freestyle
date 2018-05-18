package com.practice.ju.freestyle.dagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by guangju on 2018/5/18.
 *
 * todo 限定符的使用，可以在component中初始化同一个类的不同参数值的对象
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonQualifier {
}
