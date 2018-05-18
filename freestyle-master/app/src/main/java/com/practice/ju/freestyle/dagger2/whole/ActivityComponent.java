package com.practice.ju.freestyle.dagger2.whole;


import dagger.Component;

/**
 * Created by guangju on 2018/5/18.
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = ActModule.class)
public interface ActivityComponent {

    void inject(DependenceTestActivity dependenceTestActivity);
    void inject(SubComponentTestActivity subComponentTestActivity);

    //包含SubComponent,这样的话该SubComponent也可以拿到ActivityComponent中能提供的依赖。
    ActSubComponent getActSubComponent();
}
