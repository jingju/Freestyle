package com.practice.ju.freestyle.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by guangju on 2018/5/23.
 */
@Database(entities = {Student.class,CLass.class} ,version = 1)
public abstract class CommonDateBase extends RoomDatabase{
    private  static CommonDateBase INSTANCE;

    public abstract StudentDao studentDao();
    
    public static final Object sLock = new Object();

    public static CommonDateBase getINSTANCE(Context context){
         if(INSTANCE==null){
             INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                     CommonDateBase.class,"CommonTest.db")
                     .build();
         }
         return INSTANCE;
    }

}
