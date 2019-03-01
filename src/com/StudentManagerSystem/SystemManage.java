/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;

import java.io.File;

public class SystemManage {


    private static Student studentTmp;




    private static void addStudent() {

        int index = IndexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        BTreeManage.addStudent(studentTmp);
        FileManage.addStudent(index, studentTmp);
    }


//    private static void updateStudent() {
//        String index = StudentTmp.getIndex();
//        FileManage.updateStudent(StudentTmp.getName(), );
//    }
    //finds the possible students and inserts data in studenttmp class
//    private static String searchByUniID(String uniID) {
//
//        int temp = Integer.parseInt(uniID);
//        BTreeManage.find_StudentUniID(temp);
//    }
//    private static String searchByName(String searchField) {}
//    private static String searchByLastname(String searchField) {}
//    private static String searchByID(String searchField)

    //buttons
    public static Student searchStudent(String inputKey, String searchField) {

        int index;

        index = BTreeManage.genericSearch(searchField,inputKey);
        studentTmp = FileManage.readStudent_pi(index);
        return studentTmp;
    }
    public static void signupStudent(String name, String lastname, String phoneNum, String birthdate, String id) {

        String uniId = IDManage.createNewID();
        setProps(uniId, name, lastname, phoneNum, birthdate, id);
        addStudent();
    }
    public static void updateStudent(String name, String lastname, String phoneNum, String birthdate, String id, String uniID) {

        setProps(uniID, name, lastname, phoneNum, birthdate, id);
        FileManage.updateStudent_pi(studentTmp);
    }
    public static void removeStudent() {

        int index;
        BTreeManage.removeStudent(studentTmp.getUniID());
        index = studentTmp.getIndex_PersonalInfo();
        IndexManage.removeStudent(index);
        FileManage.removeStudent(index);// i don't know if it's needed cause if u remove the index the data i considered removed
    }

    //get and set properties
    private static void setProps(String uniId, String id, String name, String lastname, String phoneNum, String birthdate) {

        int temp;
        temp = Integer.parseInt(uniId);
        studentTmp.setUniID(temp);
        studentTmp.setName(name);
        studentTmp.setLastname(lastname);
        studentTmp.setPhoneNum(phoneNum);
        studentTmp.setBirthDate(birthdate);
        temp = Integer.parseInt(id);
        studentTmp.setId(temp);
    }
    public static String[] getProps() {return new String[6];}
    public static Student getProperties() {return studentTmp;}
}
