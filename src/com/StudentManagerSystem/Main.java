/*
 * created by @Amir
 */

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setUniID(0);
        student.setName("he he");
        student.setLastname("ssssss");
        student.setIndex_PersonalInfo(3);
        student.setId(1);
        FileManage.createStudent(student);

        Student s = FileManage.readStudent(3);
        Student student1 = new Student();
        student1.setName("he he");
        student1.setLastname("amir2");
        student1.setLastname("amir2");
        student1.setId(123456789);
        student1.setIndex_PersonalInfo(3);

        FileManage.updateStudent(student,student1);
        Student s2 = FileManage.readStudent(3);
        s2 = FileManage.readStudent(3);

    }
}
