package com.practice.ju.freestyle.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;

/**
 * Created by guangju on 2018/5/23.
 */

@Dao
public interface StudentDao {
    /**
     * 在数据库中查询所有的student，限制只取第一个
     * @return
     */
    @Query("SELECT * FROM students LIMIT 1")
    Student getStudent();

    /**
     * 插入，当有相同的Student时，进行替换.
     * @param stdu
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudent(Student stdu);

    /**
     * 删除所有的student
     */
    @Query("DELETE FROM Students")
    void deleteALLStudents();

}
