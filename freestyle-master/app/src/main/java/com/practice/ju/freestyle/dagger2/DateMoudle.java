package com.practice.ju.freestyle.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by guangju on 2018/5/17.
 */
@Module
public class DateMoudle {
    @Provides
    Person providePerson(){
        return new Person();
    }

}
