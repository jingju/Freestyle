package com.practice.ju.freestyle.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * Created by guangju on 2018/5/23.
 * 班级表
 */

@Entity(tableName = "class")
public class CLass {
    @PrimaryKey
    @ColumnInfo(name = "classid")
    public int mClassId;

    /**
     * 班级名称 三年二班
     */
    @ColumnInfo(name = "classname")
    public String mClassName;

    public CLass(int mClassId, String mClassName) {
        this.mClassId = mClassId;
        this.mClassName = mClassName;
    }

//    public int getclassid() {
//        return mClassId;
//    }
//
//    public String getclassname() {
//        return mClassName;
//    }
}
