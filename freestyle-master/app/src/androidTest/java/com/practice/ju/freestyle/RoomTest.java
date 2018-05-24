package com.practice.ju.freestyle;

import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import com.practice.ju.freestyle.room.CommonDateBase;
import com.practice.ju.freestyle.room.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by guangju on 2018/5/24.
 */

@RunWith(AndroidJUnit4.class)
public class RoomTest {
    CommonDateBase mCommondDatabase;

    @Before
    public void initDb(){
        mCommondDatabase= Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(),CommonDateBase.class)
                .build();

    }

    /**
     * assert可以断言多种方式
     *
     *
     *
     */
    @Test
    public void insertUser(){
        Student student =new Student(1,"三丰","男");
        mCommondDatabase.studentDao().insertStudent(student);
        //The user can be retrieved
        List<Student> users = mCommondDatabase.studentDao().getStudents();
        assertThat(users.size(), is(1));
        Student dbStudent= users.get(0);
        assertEquals(dbStudent.mId, student.mId);
        assertEquals(dbStudent.mName, student.mName);


    }

    @After
    public void closeDb(){
        mCommondDatabase.close();
    }

}
