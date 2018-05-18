package com.practice.ju.freestyle.dagger2.whole;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by guangju on 2018/5/18.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    /**
     * 其它的依赖想要用这个Context,必须显示的暴露
     * 因为其它依赖这个的Component需要使用Context,然后这个Context会去AppModule中找对应的context
     * 与方法名无关，至与返回值类型有关
     * 例如，B依赖A,A有一电饭锅，哪天B想做饭了，想要借用电饭锅，
     * 如果A把电饭锅藏起来不给B用，B就回因为做不了饭饿崩溃（程序报错）
     * 所以，A必要给B用，B才能吃上饭（程序正常）
     * @return
     */
    Context context();
}
