/*
 * created by @Amir
 */

package com.StudentManagerSystem;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        Student s = new Student();
//
//        s.setLastname("kir1");
//        s.setName("kirta1r1");
//        s.setPhoneNum("123");
//        s.setBirthDate("ass");
//        SystemManage.setStudentTmp(s);
//        SystemManage.signUpStudent();
//
//
//        s.setLastname("kir2");
//        s.setName("kirtar2");
//        s.setPhoneNum("123");
//        s.setBirthDate("ass");
//        SystemManage.setStudentTmp(s);
//        SystemManage.signUpStudent();
//
//
//        s.setLastname("kir");
//        s.setName("kirtar3");
//        s.setPhoneNum("123");
//        s.setBirthDate("ass");
//        SystemManage.setStudentTmp(s);
//        SystemManage.signUpStudent();
//
//        s = SystemManage.searchStudent("2","");
//        SystemManage.setStudentTmp(s);
//        SystemManage.removeStudent();
//
//        System.out.println( SystemManage.searchStudent("0","").getName());
        long t = 10;
        FileIO.writeObjectWithIndex("/File", t, 1);
    }
}
