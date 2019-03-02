/*
 * created by @Amir
*/

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student();

        s.setLastname("kir1");
        s.setName("kirta1r1");
        s.setPhoneNum("123");
        s.setBirthDate("ass");
        SystemManage.setStudentTmp(s);
        SystemManage.signupStudent();


        s.setLastname("kir2");
        s.setName("kirtar2");
        s.setPhoneNum("123");
        s.setBirthDate("ass");
        SystemManage.setStudentTmp(s);
        SystemManage.signupStudent();


        s.setLastname("kir");
        s.setName("kirtar3");
        s.setPhoneNum("123");
        s.setBirthDate("ass");
        SystemManage.setStudentTmp(s);
        SystemManage.signupStudent();


        SystemManage.setStudentTmp(SystemManage.searchStudent("2",""));
        SystemManage.removeStudent();

        System.out.println( SystemManage.searchStudent("1","").getName());
    }
}
