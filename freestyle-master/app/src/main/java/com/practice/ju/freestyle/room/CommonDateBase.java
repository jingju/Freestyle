package com.practice.ju.freestyle.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.support.annotation.VisibleForTesting;

/**
 * Created by guangju on 2018/5/23.
 */
@Database(entities = {Student.class,CLass.class} ,version = 2)
public abstract class CommonDateBase extends RoomDatabase{
    private  static CommonDateBase INSTANCE;

    public abstract StudentDao studentDao();

    public static final Object sLock = new Object();

    @VisibleForTesting
    static final Migration MIGRATION_1_2= new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE Students "
                        + " ADD COLUMN sex  VARCHAR(1)");
        }
    };


    public static CommonDateBase getINSTANCE(Context context){
         if(INSTANCE==null){
             INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                     CommonDateBase.class,"CommonTest.db")
                     .addMigrations(MIGRATION_1_2)
                     .build();
         }
         return INSTANCE;
    }

}
