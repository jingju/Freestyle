package com.practice.ju.freestyle.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by guangju on 2018/5/23.
 */
@Entity(tableName = "Students")
public class Student {
    @PrimaryKey
    @ColumnInfo(name = "studentid")
    public int mId;

    @ColumnInfo(name = "studentname")
    public String mName;

    public Student(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

//    public String getstudentname() {
//        return mName;
//    }
//
//    public int getId() {
//        return mId;
//    }


}
